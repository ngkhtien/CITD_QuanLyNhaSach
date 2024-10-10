package dao;

import entity.ChiTietNhapEntity;
import java.util.List;

public interface IChiTietNhapDAO {
    List<ChiTietNhapEntity> getAllChiTietNhap();

    int addChiTietNhap(ChiTietNhapEntity toEntity);
    int deleteChiTietNhap(ChiTietNhapEntity toEntity);
    int editChiTietNhap(ChiTietNhapEntity toEntity);
}
