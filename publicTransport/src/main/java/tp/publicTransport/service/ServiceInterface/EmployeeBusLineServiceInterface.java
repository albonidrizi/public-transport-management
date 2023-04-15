package tp.publicTransport.service.ServiceInterface;

import tp.publicTransport.dto.EmployeeBusLineDto;

import java.util.List;

public interface EmployeeBusLineServiceInterface {

    List<EmployeeBusLineDto> getAllEmployeeBusLine();

    EmployeeBusLineDto getEmployeeBusLineById(Integer id);

    EmployeeBusLineDto saveEmployeeBusLine(EmployeeBusLineDto body);

    EmployeeBusLineDto updateEmployeeBusLine1(EmployeeBusLineDto body);

    EmployeeBusLineDto updateEmployeeBusLine2(EmployeeBusLineDto body);

    EmployeeBusLineDto deleteEmployeeBusLineById(Integer id);

    List<EmployeeBusLineDto> getEmployeeNamesByLineId(Integer lineId);
}
