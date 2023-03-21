package com.example.detaithuctap.Repository.MonAn;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DiaDiemAnUongRepository implements BaseRepository<DiaDiemAnUong> {

    @Autowired
    private SessionFactory sessionFactory;
    @SuppressWarnings("unchecked")
	@Override
    public List<DiaDiemAnUong> getAll () {
        return sessionFactory.getCurrentSession ().createQuery ("from DiaDiemAnUong")
                .list ();
    }

    public List<DiaDiemAnUong> getListDiaDiemByIdMonAn(int idd){
        return sessionFactory.getCurrentSession ().createNativeQuery ("select d.* from dia_diem_an_uong d join monan_diadiemanuong m on d.id_dia_diem = m.id_dia_diem\n" +
                "where m.id_mon_an = :idd limit 3 offset 0", DiaDiemAnUong.class).setParameter ("idd", idd).list ();
    }

    @Override
    public void saveOrUpdate (DiaDiemAnUong diaDiemAnUong) {
        sessionFactory.getCurrentSession ().saveOrUpdate (diaDiemAnUong);
    }

    public void delete (int id) {
        DiaDiemAnUong diaDiemAnUong = getById (id);
        sessionFactory.getCurrentSession ().delete (diaDiemAnUong);
    }

    @Override
    public DiaDiemAnUong getById (int id) {
        return (DiaDiemAnUong) sessionFactory.getCurrentSession ().createQuery ("from DiaDiemAnUong where id = :id")
                .setParameter ("id", id).getSingleResult ();
    }

    @Override
    public DiaDiemAnUong getByName (String name) {
        return null;
    }
    
	public List<DiaDiemAnUong> listDiaDiemAnUongKhac(int iddiadiem, int idmonan){
    	try {
			return (List<DiaDiemAnUong>) sessionFactory.getCurrentSession()
					.createNativeQuery("SELECT d.* FROM "
							+ "dia_diem_an_uong d join monan_diadiemanuong m on d.id_dia_diem = m.id_dia_diem and "
							+ "m.id_mon_an = :idmonan where d.id_dia_diem != :iddiadiem", DiaDiemAnUong.class)
					.setParameter("iddiadiem", iddiadiem).setParameter("idmonan", idmonan).list();
		} catch (Exception e) {
			return null;
		}
    }

}
