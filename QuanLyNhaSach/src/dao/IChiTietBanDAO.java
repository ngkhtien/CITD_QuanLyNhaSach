package dao;

import entity.ChiTietBanEntity;
import java.util.List;

public interface IChiTietBanDAO {
    List<ChiTietBanEntity> loadData();

    int addChiTietBan(ChiTietBanEntity toEntity);
    int deleteChiTietBan(ChiTietBanEntity toEntity);
    int editChiTietBan(ChiTietBanEntity toEntity);
}
