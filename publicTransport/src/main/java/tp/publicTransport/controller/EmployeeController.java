package tp.publicTransport.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.EmployeeDto;
import tp.publicTransport.service.ServiceInterface.EmployeeServiceInterface;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/public_transport_sys_mng")
public class EmployeeController {

    @Autowired
    EmployeeServiceInterface service;

    @GetMapping("/getAllEmployee")
    public List<EmployeeDto> getAllEmployee(){
       return service.getAllEmployee();
    }

    @GetMapping("/getEmployeeById")
    public EmployeeDto getEmployeeById(@RequestParam("employeeId") Integer id){
        return service.getEmployeeById(id);
    }
    @PostMapping("/saveEmployee")
    public EmployeeDto saveEmployee(@Validated @RequestBody EmployeeDto body){
        return service.saveEmployee(body);
    }
    @PutMapping("/updateEmployee1")
    public EmployeeDto updateEmployee1(@Validated @RequestBody EmployeeDto body){
        return service.updateEmployee1(body);
    }
    @PatchMapping("/UpdateEmployee2")
    public EmployeeDto updateEmployee2(@Validated @RequestBody EmployeeDto body){
        return service.updateEmployee2(body);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public EmployeeDto deleteEmployeeById(@PathVariable("id") Integer id){ return service.deleteEmployeeById(id);}

    @GetMapping("/employees/WithoutGrade")
    public List<EmployeeDto> getWithoutGradesEmpl() {
        return service.getWithoutGradeEmployee();
    }

    @GetMapping("/employee/ProfessionEmpl")
    public List<EmployeeDto> getProfessionEmpl(@RequestParam Integer id) {
        return service.getByProfessionId(id);
    }
    @GetMapping("/emp/getByInState")
    public List<EmployeeDto> getByInState() {
        return service.getByInState();
    }

    @GetMapping("/filter/Employee")
    public Page<EmployeeDto> filterE(@RequestParam Integer pageSize,
                                    @RequestParam Integer pageNumber,
                                    @RequestParam String sort, Boolean isAscending,
                                    @RequestParam( name = "name",required = false) String name,
                                    @RequestParam( name = "surname",required = false) String surname,
                                    @RequestParam( name = "age",required = false) String age,
                                    @RequestParam( name = "gender",required = false) String gender,
                                    @RequestParam(name = "email", required = false) String email,
                                    @RequestParam( name = "profesionDto",required = false) String profession
                                    ){
        return service.filterE(pageSize, pageNumber, sort, isAscending, name, surname, age, gender, email, profession);
    }
}
