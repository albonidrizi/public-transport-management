package tp.publicTransport.mapper;

import org.springframework.stereotype.Component;
import tp.publicTransport.dto.LineDto;
import tp.publicTransport.mapper.MapperInterface.LineMapperInterface;
import tp.publicTransport.model.Line;

@Component
public class LineMapperImpl implements LineMapperInterface {
    @Override
    public Line toEntity(LineDto dto) {
        if (dto == null) return null;

        Line entity= new Line();
        entity.setLineId(dto.getLineId());
        entity.setLineName(dto.getLineName());
        entity.setDestination(dto.getDestination());
        entity.setCodeID(dto.getCodeID());
        return entity;
    }

    @Override
    public LineDto toDto(Line entity) {
        if (entity ==null) return null;

        LineDto dto = new LineDto();

        dto.setLineId(entity.getLineId());
        dto.setLineName(entity.getLineName());
        dto.setDestination(entity.getDestination());
        dto.setCodeID(entity.getCodeID());
        return dto;
    }
}
