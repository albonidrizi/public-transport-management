package tp.publicTransport.mapper.MapperInterface;

import tp.publicTransport.dto.EmployeeBusLineDto;
import tp.publicTransport.model.EmployeeBusLine;


public interface EmployeeBusLineMapperInterface {
    EmployeeBusLine toEntity(EmployeeBusLineDto dto);
    EmployeeBusLineDto toDto(EmployeeBusLine entity);

}
