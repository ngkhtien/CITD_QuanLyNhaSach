package service;

import dto.KhachHangDTO;
import java.util.List;

public interface IKhachHangService {
    List<KhachHangDTO> getDsKhachHang();
    boolean addKhachHang(KhachHangDTO kh);
    boolean deleteKhachHang(KhachHangDTO kh);
    boolean editKhachHang(KhachHangDTO kh);
}
