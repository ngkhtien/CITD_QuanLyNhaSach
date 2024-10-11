package service;

import dto.PhieuXuatBanDTO;
import java.util.List;

public interface IPhieuXuatBanService {
    List<PhieuXuatBanDTO> getDsPhieuXuatBan();
    boolean addPhieuXuatBan(PhieuXuatBanDTO pxb);
    boolean deletePhieuXuatBan(PhieuXuatBanDTO pxb);
    boolean editPhieuXuatBan(PhieuXuatBanDTO pxb);
}
