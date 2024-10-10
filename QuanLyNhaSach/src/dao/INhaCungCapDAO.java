package dao;

import entity.NhaCungCapEntity;
import java.util.List;

public interface INhaCungCapDAO {
    List<NhaCungCapEntity> getAllNhaCungCap();

    int addNhaCungCap(NhaCungCapEntity toEntity);
    int deleteNhaCungCap(NhaCungCapEntity toEntity);
    int editNhaCungCap(NhaCungCapEntity toEntity);
}

