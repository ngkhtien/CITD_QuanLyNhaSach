package service;

import dto.ChiTietXuatDTO;
import java.util.List;

public interface IChiTietXuatService {
    List<ChiTietXuatDTO> getDsChiTietXuat();
    boolean addChiTietXuat(ChiTietXuatDTO ctx);
    boolean deleteChiTietXuat(ChiTietXuatDTO ctx);
    boolean editChiTietXuat(ChiTietXuatDTO ctx);
}
