package dao;

import entity.DoChoiEntity;
import java.util.List;

public interface IDoChoiDAO extends ISanPhamDAO{
    List<DoChoiEntity> getAllSach();

    int addDoChoi(DoChoiEntity toEntity);
    int deleteDoChoi(DoChoiEntity toEntity);
    int editDoChoi(DoChoiEntity toEntity);
}