package service;

import dto.VppDTO;
import java.util.List;

public interface IVppService {
    List<VppDTO> getDsVpp();
    boolean addVpp(VppDTO vpp);
    boolean deleteVpp(VppDTO vpp);
    boolean editVpp(VppDTO vpp);
}
