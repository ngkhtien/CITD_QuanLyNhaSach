package dao;

import entity.NhanVienEntity;
import java.util.List;

public interface INhanVienDAO {
    List<NhanVienEntity> getAllNhanVien();

    int addNhanVien(NhanVienEntity toEntity);
    int deleteNhanVien(NhanVienEntity toEntity);
    int editNhanVien(NhanVienEntity toEntity);
}

