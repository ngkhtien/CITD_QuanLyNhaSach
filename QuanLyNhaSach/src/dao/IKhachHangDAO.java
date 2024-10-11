package dao;

import entity.KhachHangEntity;
import java.util.List;

public interface IKhachHangDAO {
    List<KhachHangEntity> loadData();

    int addKhachHang(KhachHangEntity toEntity);
    int deleteKhachHang(KhachHangEntity toEntity);
    int editKhachHang(KhachHangEntity toEntity);
}
