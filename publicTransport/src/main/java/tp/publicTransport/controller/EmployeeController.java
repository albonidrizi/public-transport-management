package tp.publicTransport.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.EmployeeDto;
import tp.publicTransport.service.ServiceInterface.EmployeeServiceInterface;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PTM")
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



}
