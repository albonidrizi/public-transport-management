package tp.publicTransport.mapper.MapperInterface;

import tp.publicTransport.dto.BussDto;
import tp.publicTransport.model.Bus;

public interface BusMapperInterface {
    Bus toEntity(BussDto dto);
    BussDto toDto(Bus entity);
}
