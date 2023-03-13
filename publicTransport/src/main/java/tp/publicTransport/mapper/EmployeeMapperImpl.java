package tp.publicTransport.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tp.publicTransport.dto.EmployeeDto;
import tp.publicTransport.mapper.MapperInterface.EmployeeMapperInterface;
import tp.publicTransport.mapper.MapperInterface.ProfessionMapperInterface;
import tp.publicTransport.model.Employee;

@RequiredArgsConstructor
@Component
public class EmployeeMapperImpl implements EmployeeMapperInterface {

    @Autowired
    private ProfessionMapperInterface professionMapperInterface;


    @Override
    public Employee toEntity(EmployeeDto dto) {
        if (dto == null) return null;

        Employee entity = new Employee();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setSurname(dto.getSurname());
        entity.setAge(dto.getAge());
        entity.setGender(dto.getGender());
        entity.setEmail(dto.getEmail());
        entity.setProfessionId(professionMapperInterface.toEntity(dto.getProfessionDto()));
        return entity;
    }

    @Override
    public EmployeeDto toDto(Employee entity) {
        if (entity == null) return null;

        EmployeeDto dto = new EmployeeDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
        dto.setAge(entity.getAge());
        dto.setGender(entity.getGender());
        dto.setEmail(entity.getEmail());
        dto.setProfessionDto(professionMapperInterface.toDto(entity.getProfessionId()));
        return dto;
    }
}
