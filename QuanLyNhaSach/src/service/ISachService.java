package service;

import dto.SachDTO;
import java.util.List;

public interface ISachService {
    List<SachDTO> getDsSach();
    boolean addSach(SachDTO s);
    boolean deleteSach(SachDTO s);
    boolean editSach(SachDTO s);
}
