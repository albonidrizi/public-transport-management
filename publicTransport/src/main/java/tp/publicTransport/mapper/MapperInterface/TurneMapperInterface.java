package tp.publicTransport.mapper.MapperInterface;

import tp.publicTransport.dto.TurnDto;
import tp.publicTransport.model.Turn;

public interface TurneMapperInterface {
    Turn toEntity(TurnDto dto);
    TurnDto toDto(Turn entity);
}
