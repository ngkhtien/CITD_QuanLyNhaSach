package service;

import dto.NhaCungCapDTO;
import java.util.List;

public interface INhaCungCapService {
    List<NhaCungCapDTO> getDsNhaCungCap();
    boolean addNhaCungCap(NhaCungCapDTO ncc);
    boolean deleteNhaCungCap(NhaCungCapDTO ncc);
    boolean editNhaCungCap(NhaCungCapDTO ncc);
}
