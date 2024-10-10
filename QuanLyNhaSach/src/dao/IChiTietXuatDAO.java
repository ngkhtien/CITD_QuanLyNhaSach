package dao;

import entity.ChiTietXuatEntity;
import java.util.List;

public interface IChiTietXuatDAO {
    List<ChiTietXuatEntity> getAllChiTietXuat();

    int addChiTietXuat(ChiTietXuatEntity toEntity);
    int deleteChiTietXuat(ChiTietXuatEntity toEntity);
    int editChiTietXuat(ChiTietXuatEntity toEntity);
}
