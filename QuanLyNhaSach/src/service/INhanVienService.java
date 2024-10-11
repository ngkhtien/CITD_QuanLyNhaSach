package service;

import dto.NhanVienDTO;
import java.util.List;

public interface INhanVienService {
    List<NhanVienDTO> getDsNhanVien();
    boolean addNhanVien(NhanVienDTO nv);
    boolean deleteNhanVien(NhanVienDTO nv);
    boolean editNhanVien(NhanVienDTO nv);
}
