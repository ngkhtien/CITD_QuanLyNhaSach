package dao;

import entity.PhieuNhapEntity;
import java.util.List;

public interface IPhieuNhapDAO {
    List<PhieuNhapEntity> getAllPhieuNhap();

    int addPhieuNhap(PhieuNhapEntity toEntity);
    int deletePhieuNhap(PhieuNhapEntity toEntity);
    int editPhieuNhap(PhieuNhapEntity toEntity);
}