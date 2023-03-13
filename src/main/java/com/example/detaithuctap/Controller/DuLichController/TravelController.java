package com.example.detaithuctap.Controller.DuLichController;

import com.example.detaithuctap.Entity.DuLich.*;
import com.example.detaithuctap.Service.DuLichService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String travelHome(HttpSession session){
        return "travel";
    }

    @GetMapping("/travel-tour")
    public ModelAndView travelTour(HttpSession session){
        ModelAndView modelAndView = new ModelAndView("travel-tour");
        List<travel_tour> tours = travelTourService.getAll();
        modelAndView.addObject("tours", tours);
        return modelAndView;
    }

    @GetMapping("/travel-destination")
    public ModelAndView travelDestination(HttpSession session){
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
        ModelAndView modelAndView = new ModelAndView("travel-hotel");
        List<hotel> hotels = hotelService.getAll();
        modelAndView.addObject("hotels", hotels);
        return modelAndView;
    }

    @GetMapping("/travel-destination-detail")
    public ModelAndView travelDestinationDetail(HttpSession session, @RequestParam("id") int id){
        ModelAndView modelAndView = new ModelAndView("travel-destination-detail");
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
}
