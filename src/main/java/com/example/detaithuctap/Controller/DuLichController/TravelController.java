
package com.example.detaithuctap.Controller.DuLichController;

import com.example.detaithuctap.Entity.DuLich.*;
import com.example.detaithuctap.Entity.MonAn.Loai_hinh_am_thuc;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Service.DuLichService.*;
import com.example.detaithuctap.Service.MonAn.Loai_hinh_am_thucService;
import com.example.detaithuctap.Service.MonAn.MonAnService;
import com.example.detaithuctap.auth.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TravelController {
    @Autowired
    private Loai_hinh_am_thucService loai_hinh_am_thucService;
    @Autowired
    private MonAnService monAnService;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private TravelTourService travelTourService;
    @Autowired
    private Address_detailService addressDetailService;
    @Autowired
    private TravelCategoryService loaiHinhService;
    @Autowired
    private AddressService addressService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/travel")
    public ModelAndView travelHome(HttpSession session){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel");
        List<Address> list = addressService.getAll();
        List<Address> listAdd = new ArrayList<Address>();
        for (int i = 0; i < 8; i++){
            listAdd.add(list.get(i));
        }
        modelAndView.addObject("listAdd", listAdd);
        return modelAndView;
    }

    @GetMapping("/travel-tour")
    public ModelAndView travelTour(HttpSession session){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel-tour");
        List<TravelTour> tours = travelTourService.getAll();
        modelAndView.addObject("tours", tours);
        return modelAndView;
    }

    @GetMapping("/travel-destination")
    public ModelAndView travelDestination(HttpSession session){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel-destination");
        List<TravelCategory> listLH = loaiHinhService.finfAll();
        modelAndView.addObject("listLH", listLH);
        List<Address> listAdd = addressService.getAll();
        modelAndView.addObject("listAdd", listAdd);
        return modelAndView;
    }

    @GetMapping("/travel-destinationByLh")
    public ModelAndView travelDestinationByLh(HttpSession session, @RequestParam("id_lh") int id_lh){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel-destination");
        List<TravelCategory> listLH = loaiHinhService.finfAll();
        modelAndView.addObject("listLH", listLH);
        List<Address> listAdd = addressService.findByLHId(id_lh);
        modelAndView.addObject("listAdd", listAdd);
        System.out.println(listAdd);
        return modelAndView;
    }
    @GetMapping("/travel-hotel")
    public ModelAndView travelHotel(HttpSession session){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel-hotel");
        List<Hotel> hotels = hotelService.getAll();
        modelAndView.addObject("hotels", hotels);
        return modelAndView;
    }

    @GetMapping("/travel-destination-detail")
    public ModelAndView travelDestinationDetail(HttpSession session, @RequestParam("id") int id){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel-destination-detail");
        List<TravelTour> travelTours = travelTourService.getAll();
        modelAndView.addObject("tours", travelTours);
        Address address1 = addressService.getById(id);
        modelAndView.addObject("address", address1);
        AddressDetail addressDetail = addressDetailService.findByIdAddress(id);
        List<String> chi_tiet_hinh_anh = new ArrayList<String>();
        String[] hinh_anh = addressDetail.getChi_tiet_hinh_anh().split(" ");
        for (String w : hinh_anh) {
            chi_tiet_hinh_anh.add(w);
        }
        DetailModel detailModel = new DetailModel(addressDetail.getId(), addressDetail.getMota(),
                chi_tiet_hinh_anh, addressDetail.getGiomocua(), addressDetail.getGiodongcua(), addressDetail.getAddress(), addressDetail.getDichVu(), addressDetail.getGia());
        modelAndView.addObject("detail", detailModel);
        List<Address> listAddLQ = addressService.findByLHId(address1.getLoaiHinh());
        modelAndView.addObject("listAdd", listAddLQ);
        List<CommentAddress> commentaAddressList = commentService.loadByIdAddress(id);
        modelAndView.addObject("listComment", commentaAddressList);
        int slCmt = commentaAddressList.size();
        modelAndView.addObject("slCmt", slCmt);
        return modelAndView;
    }
    public void checkSession(HttpSession session){
        try{
            MyUserDetail myUserDetail = (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
            session.setAttribute ("user", myUserDetail);
        }catch (Exception e){

        }
    }

    @GetMapping("/find-tour")
    public ModelAndView searchTour(HttpSession session, @RequestParam("search") String search
    , @RequestParam("date") String date, @RequestParam("ngay") int ngay){
        ModelAndView modelAndView = new ModelAndView("travel-tour");
        search = "%" + search + "%";
        List<TravelTour> tours = travelTourService.searchAll(search, date, ngay);
        modelAndView.addObject("tours", tours);
        return modelAndView;
    }

    @GetMapping("/find-hotel")
    public ModelAndView searchHotel(HttpSession session, @RequestParam("search") String search){
        ModelAndView modelAndView = new ModelAndView("travel-hotel");
        List<Hotel> hotels = hotelService.searchAll(search);
        modelAndView.addObject("hotels", hotels);
        return modelAndView;
    }

    @PostMapping("/travel-comment")
    public String comment(HttpSession session, @RequestParam("idaddress") String id, @RequestParam("content") String content){
        try{
            Timestamp timepost = new Timestamp(System.currentTimeMillis());
            MyUserDetail myUserDetail = (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
            CommentAddress comment = new CommentAddress(content, timepost.toString(), myUserDetail.getId(), Integer.parseInt(id), myUserDetail.getUsername());
            commentService.saveComment(comment);
            String path = "redirect:/travel-destination-detail?id=" + id;
            return path;
        }
        catch (Exception e){
            return "redirect:/login";
        }
    }

    @GetMapping("/search-all")
    public ModelAndView search(HttpSession session, @RequestParam("catagory") String category, @RequestParam("search") String search){
        if (Integer.parseInt(category) == 1){
            ModelAndView modelAndView = new ModelAndView("travel-destination");
            List<TravelCategory> listLH = loaiHinhService.finfAll();
            modelAndView.addObject("listLH", listLH);
            List<Address> listAdd = addressService.searchAddress(search);
            modelAndView.addObject("listAdd", listAdd);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("food");
            List<Loai_hinh_am_thuc> list = loai_hinh_am_thucService.getAll();
            modelAndView.addObject("listL", list);
            List<MonAn> listMonAns = monAnService.search(search);
            modelAndView.addObject("listM", listMonAns);
            return modelAndView;
        }
    }
}

