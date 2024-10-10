package dao;

import entity.PhieuXuatEntity;
import java.util.List;

public interface IPhieuXuatDAO {
    List<PhieuXuatEntity> getAllPhieuXuat();

    int addPhieuXuat(PhieuXuatEntity toEntity);
    int deletePhieuXuat(PhieuXuatEntity toEntity);
    int editPhieuXuat(PhieuXuatEntity toEntity);
}