package dao;

import entity.TheKhoEntity;
import java.util.List;

public interface ITheKhoDAO {
    List<TheKhoEntity> getAllTheKho();

    int addTheKho(TheKhoEntity toEntity);
    int deleteTheKho(TheKhoEntity toEntity);
    int editTheKho(TheKhoEntity toEntity);
}

