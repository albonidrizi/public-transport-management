package tp.publicTransport.service.ServiceInterface;

import tp.publicTransport.dto.BussDto;

import java.util.List;

public interface BusServiceInterface {
    List<BussDto> getAllBus();
    BussDto getBussById(Integer id);
    BussDto saveBuss(BussDto body);
    BussDto updateBuss1(BussDto body);
    BussDto updateBuss2(BussDto body);
    BussDto deleteBussById(Integer id);

}
