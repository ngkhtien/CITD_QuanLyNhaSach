package dao;

import entity.PhieuNhapEntity;
import java.util.List;

public interface IPhieuNhapDAO {
    List<PhieuNhapEntity> loadData();

    int addPhieuNhap(PhieuNhapEntity toEntity);
    int deletePhieuNhap(PhieuNhapEntity toEntity);
    int editPhieuNhap(PhieuNhapEntity toEntity);
}