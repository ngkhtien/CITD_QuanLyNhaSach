package service;

import dto.ChiTietBanDTO;
import java.util.List;

public interface IChiTietBanService {
    List<ChiTietBanDTO> getDsChiTietBan();
    boolean addChiTietBan(ChiTietBanDTO ctb);
    boolean deleteChiTietBan(ChiTietBanDTO ctb);
    boolean editChiTietBan(ChiTietBanDTO ctb);
}
