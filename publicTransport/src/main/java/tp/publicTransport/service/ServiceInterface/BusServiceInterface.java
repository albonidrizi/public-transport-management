package tp.publicTransport.service.ServiceInterface;

import org.springframework.data.domain.Page;
import tp.publicTransport.dto.BussDto;

import java.util.List;

public interface BusServiceInterface {
    List<BussDto> getAllBus();
    BussDto getBussById(Integer id);
    BussDto saveBuss(BussDto body);
    BussDto updateBuss1(BussDto body);
    BussDto updateBuss2(BussDto body);
    BussDto deleteBussById(Integer id);

    Page<BussDto> busFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending,
                         String bussName, String bussCode);

}
