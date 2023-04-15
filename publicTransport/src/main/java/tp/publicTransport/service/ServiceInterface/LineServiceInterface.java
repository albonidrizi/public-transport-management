package tp.publicTransport.service.ServiceInterface;

import org.springframework.data.domain.Page;
import tp.publicTransport.dto.LineDto;

import java.util.List;

public interface LineServiceInterface {
    List<LineDto> getAllLine();
    LineDto getLineById(Integer id);
    LineDto saveLine(LineDto body);
    LineDto updateLine1(LineDto body);
    LineDto updateLine2(LineDto body);
    LineDto deleteLineById(Integer id);

    Page<LineDto> filter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending,
                           String lineName, String destination, Integer codeID);

    List<LineDto> getlineByName(String listName);
}
