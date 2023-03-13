package tp.publicTransport.mapper.MapperInterface;

import tp.publicTransport.dto.EmployeeDto;
import tp.publicTransport.model.Employee;

public interface EmployeeMapperInterface {
    Employee toEntity(EmployeeDto dto);
    EmployeeDto toDto(Employee entity);
}
