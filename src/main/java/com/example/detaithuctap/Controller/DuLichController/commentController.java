package com.example.detaithuctap.Controller.DuLichController;

import com.example.detaithuctap.Entity.DuLich.commentaAddress;
import com.example.detaithuctap.Service.DuLichService.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/du-lich/comment")
public class commentController {
    @Autowired
    private commentService service;
    @GetMapping("/load-comment")
    public List<commentaAddress> getAll(@RequestParam("id_dia_diem") int id){
        return service.loadByIdAddress(id);
    }
    @PostMapping("/new-comment")
    public void newCommnet(@RequestParam("noidung") String noidung, @RequestParam("id_user")int idUser,
                           @RequestParam("id_dia_diem")int idAddress){
        Timestamp timepost = new Timestamp(System.currentTimeMillis());
        commentaAddress commentaAddress1 = new commentaAddress(noidung, timepost, idUser, idAddress);
        service.saveComment(commentaAddress1);
    }
    @PostMapping("/update-comment")
    public String updateCommnet(@RequestParam("id")int id, @RequestParam("noidung") String noidung,
                              @RequestParam("id_user")int idUser, @RequestParam("id_dia_diem")int idAddress){
        Timestamp timepost = new Timestamp(System.currentTimeMillis());
        commentaAddress commentaAddress1 = new commentaAddress(id, noidung, timepost, idUser, idAddress);
        try{
            service.updateComment(commentaAddress1);
            return "access";
        }
        catch (Exception e){
            return "fail";
        }
    }
    @DeleteMapping("/delete-comment")
    public String delComment(@RequestParam("id")int id){
        try {
            service.delComment(id);
            return "access";
        } catch (Exception e){
            return "fail";
        }
    }
}
