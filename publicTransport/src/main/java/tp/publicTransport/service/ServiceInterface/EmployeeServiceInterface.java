package tp.publicTransport.service.ServiceInterface;

import org.springframework.data.domain.*;
import tp.publicTransport.dto.EmployeeDto;
import tp.publicTransport.dto.ProfessionDto;
import tp.publicTransport.model.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    List<EmployeeDto> getAllEmployee();
    EmployeeDto getEmployeeById(Integer id);
    EmployeeDto saveEmployee(EmployeeDto body);
    EmployeeDto updateEmployee1(EmployeeDto body);
    EmployeeDto updateEmployee2(EmployeeDto body);
    EmployeeDto deleteEmployeeById(Integer id);

    List<EmployeeDto> getWithoutGradeEmployee();
    List<EmployeeDto> getByProfessionId(Integer id);
    List<EmployeeDto> getByInState();

    Page<EmployeeDto> filterE(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending,
                             String name, String surname, String age, String gender, String email, String profession);


}
