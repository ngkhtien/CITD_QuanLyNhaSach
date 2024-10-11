package dao;

import entity.DoChoiEntity;
import java.util.List;

public interface IDoChoiDAO extends ISanPhamDAO{
    List<DoChoiEntity> loadDataDoChoi();

    int addDoChoi(DoChoiEntity toEntity);
    int deleteDoChoi(DoChoiEntity toEntity);
    int editDoChoi(DoChoiEntity toEntity);
}