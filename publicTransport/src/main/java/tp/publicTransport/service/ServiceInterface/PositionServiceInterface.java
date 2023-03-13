package tp.publicTransport.service.ServiceInterface;


import tp.publicTransport.dto.PositionDto;

import java.util.List;

public interface PositionServiceInterface {


    List<PositionDto> getAllPosition();

    PositionDto getPositionById(Integer id);

    PositionDto savePosition(PositionDto body);

    PositionDto updatePosition1(PositionDto body);

    PositionDto updatePosition2(PositionDto body);

    PositionDto deletePositionById(Integer id);


}
