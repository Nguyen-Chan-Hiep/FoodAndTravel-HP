package com.example.detaithuctap.API.YeuThich;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Entity.MonAn.LikeMonAn;
import com.example.detaithuctap.Service.MonAn.MonAnService;
import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
import com.example.detaithuctap.Service.Yeu_Thich.LikeMonAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LikeMonAnAPI {

    @Autowired
    private LikeMonAnService likeMonAnService;
    @Autowired
    private MonAnService monAnService;
    @Autowired
    private NguoiDungService nguoiDungService;

    @PostMapping("/them-like-mon-an/{idmonan}/{iduser}")
    public void save(@PathVariable("idmonan") int id, @PathVariable("iduser") int userid){
        MonAn monAn = monAnService.getById (id);
        NguoiDung nguoiDung = nguoiDungService.getById (userid);
        LikeMonAn likeMonAn = likeMonAnService.getLikeByIdMonAnAndIdUser (monAn, nguoiDung);
        if(likeMonAn == null){
            LikeMonAn likeMonAn1 = new LikeMonAn ();
            likeMonAn1.setMonAn (monAn);
            likeMonAn1.setNguoiDung (nguoiDung);
            likeMonAn1.setStatus (1);
            likeMonAnService.saveOrUpdate (likeMonAn1);
        }
        else{
            if(likeMonAn.getStatus () == 1){
                likeMonAn.setStatus (0);
            }
            else{
                likeMonAn.setStatus (1);
            }
            likeMonAnService.saveOrUpdate (likeMonAn);
        }
    }
}
