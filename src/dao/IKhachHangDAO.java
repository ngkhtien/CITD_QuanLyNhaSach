package dao;

import entity.KhachHangEntity;
import java.util.List;

public interface IKhachHangDAO {
    List<KhachHangEntity> getAllKhachHang();

    int addKhachHang(KhachHangEntity toEntity);
    int deleteKhachHang(KhachHangEntity toEntity);
    int editKhachHang(KhachHangEntity toEntity);
}
