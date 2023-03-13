package tp.publicTransport.mapper;

import org.springframework.stereotype.Component;
import tp.publicTransport.dto.BussDto;
import tp.publicTransport.mapper.MapperInterface.BusMapperInterface;
import tp.publicTransport.model.Bus;

@Component
public class BusMapperImpl implements BusMapperInterface {
    @Override
    public Bus toEntity(BussDto dto) {
        if (dto == null) return null;

        Bus entity = new Bus();
        entity.setId(dto.getId());
        entity.setBusName(dto.getBusName());
        entity.setBusCode(dto.getBusCode());
        return entity;
    }

    @Override
    public BussDto toDto(Bus entity) {
        if (entity == null) return null;

        BussDto dto = new BussDto();
        dto.setId(entity.getId());
        dto.setBusName(entity.getBusName());
        dto.setBusCode(entity.getBusCode());
        return dto;
    }
}
