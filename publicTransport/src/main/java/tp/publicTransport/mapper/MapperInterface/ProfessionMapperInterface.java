package tp.publicTransport.mapper.MapperInterface;

import tp.publicTransport.dto.ProfessionDto;
import tp.publicTransport.model.Profession;

public interface ProfessionMapperInterface {
    Profession toEntity(ProfessionDto dto);
    ProfessionDto toDto(Profession entity);
}
