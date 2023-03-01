package com.example.detaithuctap.API.Comment;

import com.example.detaithuctap.Entity.Comment.MonAn.NhanXetMonAn;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Service.Comment.NhanXetMonAnService;
import com.example.detaithuctap.Service.MonAn.MonAnService;
import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nhan-xet-mon-an")
public class NhanXetController {

    @Autowired
    private NhanXetMonAnService nhanXetMonAnService;
    @Autowired
    private MonAnService monAnService;
    @Autowired
    private NguoiDungService nguoiDungService;

    @GetMapping("/list-comment-mon-an/{id}")
    public Optional<List<NhanXetMonAn>> getListCommentByIdMonAn(@PathVariable("id")int id){
        return Optional.ofNullable (nhanXetMonAnService.getListCommentByIdMonAn (id));
    }

    @PostMapping("/them-nhan-xet-mon-an")
    public void saveComment(@RequestParam("noidung")String noidung, @RequestParam("hinhanh")String hinhanh
        , @RequestParam("id_monan")int id_monan, @RequestParam("id_user")int id_user){
        MonAn monAn = monAnService.getById (id_monan);
        NguoiDung nguoiDung = nguoiDungService.getById (id_user);
        LocalDateTime localDateTime = LocalDateTime.now ();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String timePost = localDateTime.format(format);
        String timeUpdate = localDateTime.format (format);
        NhanXetMonAn nhanXetMonAn = new NhanXetMonAn (noidung, hinhanh, monAn, nguoiDung, timePost, timeUpdate);
        nhanXetMonAnService.saveOrUpdate (nhanXetMonAn);
    }

    @PostMapping("/cap-nhat-nhan-xet-mon-an")
    public void updateComment(@RequestParam("id")int id, @RequestParam("noidung")String noidung, @RequestParam("hinhanh")String hinhanh
            , @RequestParam("id_monan")int id_monan, @RequestParam("id_user")int id_user){
        LocalDateTime localDateTime = LocalDateTime.now ();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String timePost = localDateTime.format(format);
        String timeUpdate = localDateTime.format (format);
        NhanXetMonAn nhanXetMonAn = nhanXetMonAnService.getById (id);
        nhanXetMonAn.setNoidung (noidung);
        nhanXetMonAn.setThoigianpost (timePost);
        nhanXetMonAn.setThoigianUpdate (timeUpdate);
        nhanXetMonAnService.saveOrUpdate (nhanXetMonAn);
    }
}
