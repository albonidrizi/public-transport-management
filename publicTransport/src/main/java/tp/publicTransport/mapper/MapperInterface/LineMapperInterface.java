package tp.publicTransport.mapper.MapperInterface;

import tp.publicTransport.dto.LineDto;
import tp.publicTransport.model.Line;

public interface LineMapperInterface {
    Line toEntity(LineDto dto);
    LineDto toDto(Line entiyt);
}
