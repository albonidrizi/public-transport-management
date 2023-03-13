package tp.publicTransport.service.ServiceInterface;

import tp.publicTransport.dto.LineDto;

import java.util.List;

public interface LineServiceInterface {
    List<LineDto> getAllLine();
    LineDto getLineById(Integer id);
    LineDto saveLine(LineDto body);
    LineDto updateLine1(LineDto body);
    LineDto updateLine2(LineDto body);
    LineDto deleteLineById(Integer id);
}
