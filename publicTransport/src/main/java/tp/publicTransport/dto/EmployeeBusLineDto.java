package tp.publicTransport.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EmployeeBusLineDto {
    private int id;
    private EmployeeDto employeeDto;
    private BussDto busDto;
    private TurnDto turnDto;
    private LineDto lineDto;
}
