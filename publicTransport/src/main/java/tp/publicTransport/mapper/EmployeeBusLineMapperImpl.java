package tp.publicTransport.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tp.publicTransport.dto.EmployeeBusLineDto;
import tp.publicTransport.mapper.MapperInterface.*;
import tp.publicTransport.model.EmployeeBusLine;

@Component
public class EmployeeBusLineMapperImpl implements EmployeeBusLineMapperInterface {

    @Autowired
    private EmployeeMapperInterface employeeMapperInterface;
    @Autowired
    private BusMapperInterface busMapperInterface;
    @Autowired
    private TurneMapperInterface turneMapperInterface;
    @Autowired
    private LineMapperInterface lineMapperInterface;


    public EmployeeBusLine toEntity (EmployeeBusLineDto dto) {
        if (dto != null) return null;

        EmployeeBusLine entity = new EmployeeBusLine();
        entity.setId(dto.getId());
        entity.setEmployeeId(employeeMapperInterface.toEntity(dto.getEmployeeDto()));
        entity.setBusId(busMapperInterface.toEntity(dto.getBusDto()));
        entity.setTurnId(turneMapperInterface.toEntity(dto.getTurnDto()));
        entity.setLineId(lineMapperInterface.toEntity(dto.getLineDto()));
        return entity;
    }

    public EmployeeBusLineDto toDto (EmployeeBusLine entity){
        if(entity == null) return null;

        EmployeeBusLineDto dto = new EmployeeBusLineDto();
        dto.setId(entity.getId());
        dto.setEmployeeDto(employeeMapperInterface.toDto(entity.getEmployeeId()));
        dto.setBusDto(busMapperInterface.toDto(entity.getBusId()));
        dto.setTurnDto(turneMapperInterface.toDto(entity.getTurnId()));
        dto.setLineDto(lineMapperInterface.toDto(entity.getLineId()));
        return dto;
    }
}
