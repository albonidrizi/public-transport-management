package tp.publicTransport.mapper;

import org.springframework.stereotype.Component;
import tp.publicTransport.dto.ProfessionDto;
import tp.publicTransport.mapper.MapperInterface.ProfessionMapperInterface;
import tp.publicTransport.model.Profession;

@Component
public class ProfessionMapperImpl implements ProfessionMapperInterface {


    public Profession toEntity(ProfessionDto dto) {
        if (dto ==null) return null;

        Profession entity = new Profession();

        entity.setId(dto.getId());
        entity.setProfession(dto.getProfession());
        entity.setGrade(dto.getGrade());
        entity.setState(dto.getState());
        return entity;
    }

    @Override
    public ProfessionDto toDto(Profession entity) {
        if (entity == null) return null;

        ProfessionDto dto = new ProfessionDto();
        dto.setId(entity.getId());
        dto.setProfession(entity.getProfession());
        dto.setGrade(entity.getGrade());
        dto.setState(entity.getState());
        return dto;
    }
}
