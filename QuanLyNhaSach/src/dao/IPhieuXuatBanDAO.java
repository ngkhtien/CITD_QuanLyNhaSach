package dao;

import entity.PhieuXuatBanEntity;
import java.util.List;

public interface IPhieuXuatBanDAO {
    List<PhieuXuatBanEntity> loadData();

    int addPhieuXuatBan(PhieuXuatBanEntity toEntity);
    int deletePhieuXuatBan(PhieuXuatBanEntity toEntity);
    int editPhieuXuatBan(PhieuXuatBanEntity toEntity);
}
