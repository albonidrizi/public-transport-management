package tp.publicTransport.mapper.MapperInterface;

import tp.publicTransport.model.Position;
import tp.publicTransport.dto.PositionDto;


public interface PositionMapperInterface {

    Position toEntity(PositionDto dto);
    PositionDto toDto(Position entity);

}
