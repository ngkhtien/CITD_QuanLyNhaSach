package dao;

import entity.VppEntity;
import java.util.List;

public interface IVppDAO extends ISanPhamDAO{
    List<VppEntity> getAllSach();

    int addVpp(VppEntity toEntity);
    int deleteVpp(VppEntity toEntity);
    int editVpp(VppEntity toEntity);
}