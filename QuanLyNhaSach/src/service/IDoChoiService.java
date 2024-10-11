package service;

import dto.DoChoiDTO;
import java.util.List;

public interface IDoChoiService {
    List<DoChoiDTO> getDsDoChoi();
    boolean addDoChoi(DoChoiDTO dc);
    boolean deleteDoChoi(DoChoiDTO dc);
    boolean editDoChoi(DoChoiDTO dc);
}
