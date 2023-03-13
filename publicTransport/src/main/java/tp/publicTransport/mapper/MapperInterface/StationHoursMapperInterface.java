package tp.publicTransport.mapper.MapperInterface;

import tp.publicTransport.dto.StationHoursDto;
import tp.publicTransport.model.StationHours;

public interface StationHoursMapperInterface {
    StationHours toEntity(StationHoursDto dto);
    StationHoursDto toDto(StationHours entity);
}
