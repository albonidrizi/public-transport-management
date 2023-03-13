package tp.publicTransport.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tp.publicTransport.dto.TurnDto;
import tp.publicTransport.mapper.MapperInterface.TurneMapperInterface;
import tp.publicTransport.model.Turn;

@RequiredArgsConstructor
@Component
public class TurneMapperImpl implements TurneMapperInterface {
    @Override
    public Turn toEntity(TurnDto dto) {
        if (dto ==null) return null;

        Turn entity = new Turn();

        entity.setId(dto.getId());
        entity.setTurne(dto.getTurne());
        entity.setTime(dto.getTime());
        return entity;
    }

    @Override
    public TurnDto toDto(Turn entity) {
        if (entity == null) return null;

        TurnDto dto = new TurnDto();
        dto.setId(entity.getId());
        dto.setTurne(entity.getTurne());
        dto.setTime(entity.getTime());
        return dto;

    }
}
