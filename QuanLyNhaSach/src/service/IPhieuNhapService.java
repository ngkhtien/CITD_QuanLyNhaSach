package service;

import dto.PhieuNhapDTO;
import java.util.List;

public interface IPhieuNhapService {
    List<PhieuNhapDTO> getDsPhieuNhap();
    boolean addPhieuNhap(PhieuNhapDTO pn);
    boolean deletePhieuNhap(PhieuNhapDTO pn);
    boolean editPhieuNhap(PhieuNhapDTO pn);
}
