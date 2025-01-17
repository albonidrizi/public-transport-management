package tp.publicTransport.mapper;


import org.springframework.stereotype.Component;
import tp.publicTransport.dto.PositionDto;
import tp.publicTransport.mapper.MapperInterface.PositionMapperInterface;
import tp.publicTransport.model.Position;
@Component
public class PositionMapperImpl implements PositionMapperInterface {

    public Position toEntity (PositionDto dto){
        if (dto == null)return null;

        Position entity = new Position();
        entity.setPositionId(dto.getPositionId());
        entity.setPosition(dto.getPosition());

        return entity;
    }

    public PositionDto toDto(Position entity){

        if (entity == null)return null;

        PositionDto dto = new PositionDto();
        dto.setPositionId(entity.getPositionId());
        dto.setPosition(entity.getPosition());
        return dto;
    }

}
