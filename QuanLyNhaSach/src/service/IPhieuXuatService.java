package service;

import dto.PhieuXuatDTO;
import java.util.List;

public interface IPhieuXuatService {
    List<PhieuXuatDTO> getDsPhieuXuat();
    boolean addPhieuXuat(PhieuXuatDTO px);
    boolean deletePhieuXuat(PhieuXuatDTO px);
    boolean editPhieuXuat(PhieuXuatDTO px);
}
