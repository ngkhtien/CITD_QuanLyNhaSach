package dao;

import entity.PhieuXuatEntity;
import java.util.List;

public interface IPhieuXuatDAO {
    List<PhieuXuatEntity> loadData();

    int addPhieuXuat(PhieuXuatEntity toEntity);
    int deletePhieuXuat(PhieuXuatEntity toEntity);
    int editPhieuXuat(PhieuXuatEntity toEntity);
}