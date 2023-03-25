
package com.example.detaithuctap.Controller.DuLichController;

import com.example.detaithuctap.Entity.DuLich.*;
import com.example.detaithuctap.Service.DuLichService.*;
import com.example.detaithuctap.auth.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TravelController {
    @Autowired
    private HotelService hotelService;
    @Autowired
    private TravelTourService travelTourService;
    @Autowired
    private address_detailService addressDetailService;
    @Autowired
    private loaiHinhService loaiHinhService;
    @Autowired
    private diaDiemService addressService;
    @GetMapping("/travel")
    public ModelAndView travelHome(HttpSession session){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel");
        List<address> list = addressService.getAll();
        List<address> listAdd = new ArrayList<address>();
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
        List<travel_tour> tours = travelTourService.getAll();
        modelAndView.addObject("tours", tours);
        return modelAndView;
    }

    @GetMapping("/travel-destination")
    public ModelAndView travelDestination(HttpSession session){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel-destination");
        List<loaiHinh> listLH = loaiHinhService.finfAll();
        modelAndView.addObject("listLH", listLH);
        List<address> listAdd = addressService.getAll();
        modelAndView.addObject("listAdd", listAdd);
        System.out.println(listAdd);
        return modelAndView;
    }

    @GetMapping("/travel-destinationByLh")
    public ModelAndView travelDestinationByLh(HttpSession session, @RequestParam("id_lh") int id_lh){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel-destination");
        List<loaiHinh> listLH = loaiHinhService.finfAll();
        modelAndView.addObject("listLH", listLH);
        List<address> listAdd = addressService.findByLHId(id_lh);
        modelAndView.addObject("listAdd", listAdd);
        System.out.println(listAdd);
        return modelAndView;
    }
    @GetMapping("/travel-hotel")
    public ModelAndView travelHotel(HttpSession session){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel-hotel");
        List<hotel> hotels = hotelService.getAll();
        modelAndView.addObject("hotels", hotels);
        return modelAndView;
    }

    @GetMapping("/travel-destination-detail")
    public ModelAndView travelDestinationDetail(HttpSession session, @RequestParam("id") int id){
        checkSession(session);
        ModelAndView modelAndView = new ModelAndView("travel-destination-detail");
        List<travel_tour> travelTours = travelTourService.getAll();
        modelAndView.addObject("tours", travelTours);
        address address1 = addressService.getById(id);
        modelAndView.addObject("address", address1);
        address_detail addressDetail = addressDetailService.findByIdAddress(id);
        List<String> chi_tiet_hinh_anh = new ArrayList<String>();
        String[] hinh_anh = addressDetail.getChi_tiet_hinh_anh().split(" ");
        for (String w : hinh_anh) {
            chi_tiet_hinh_anh.add(w);
        }
        detail_model detailModel = new detail_model(addressDetail.getId(), addressDetail.getMota(),
                chi_tiet_hinh_anh, addressDetail.getGiomocua(), addressDetail.getGiodongcua(), addressDetail.getAddress(), addressDetail.getDichVu(), addressDetail.getGia());
        modelAndView.addObject("detail", detailModel);
        List<address> listAddLQ = addressService.findByLHId(address1.getLoaiHinh());
        modelAndView.addObject("listAdd", listAddLQ);
        return modelAndView;
    }
    public void checkSession(HttpSession session){
        try{
            MyUserDetail myUserDetail = (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
            session.setAttribute ("user", myUserDetail);
        }catch (Exception e){

        }
    }
}
