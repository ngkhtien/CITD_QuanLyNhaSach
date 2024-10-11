package service;

import dto.TheKhoDTO;
import java.util.List;

public interface ITheKhoService {
    List<TheKhoDTO> getDsTheKho();
    boolean addTheKho(TheKhoDTO tk);
    boolean deleteTheKho(TheKhoDTO tk);
    boolean editTheKho(TheKhoDTO tk);
}
