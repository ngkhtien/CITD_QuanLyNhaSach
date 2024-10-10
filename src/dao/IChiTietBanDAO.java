package dao;

import entity.ChiTietBanEntity;
import java.util.List;

public interface IChiTietBanDAO {
    List<ChiTietBanEntity> getAllChiTietBan();

    int addChiTietBan(ChiTietBanEntity toEntity);
    int deleteChiTietBan(ChiTietBanEntity toEntity);
    int editChiTietBan(ChiTietBanEntity toEntity);
}
