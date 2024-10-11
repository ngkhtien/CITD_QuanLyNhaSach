package dao;

import entity.SachEntity;
import java.util.List;

public interface ISachDAO extends ISanPhamDAO{
    List<SachEntity> loadDataSach();

    int addSach(SachEntity toEntity);
    int deleteSach(SachEntity toEntity);
    int editSach(SachEntity toEntity);
}
