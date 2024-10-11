package service;

import dto.ChiTietNhapDTO;
import java.util.List;

public interface IChiTietNhapService {
    List<ChiTietNhapDTO> getDsChiTietNhap();
    boolean addChiTietNhap(ChiTietNhapDTO ctn);
    boolean deleteChiTietNhap(ChiTietNhapDTO ctn);
    boolean editChiTietNhap(ChiTietNhapDTO ctn);
}
