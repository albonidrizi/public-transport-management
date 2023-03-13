package tp.publicTransport.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.EmployeeBusLineDto;
import tp.publicTransport.service.ServiceInterface.EmployeeBusLineServiceInterface;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PTM")
public class EmployeeBusLineController {


    @Autowired
    public EmployeeBusLineServiceInterface service;

    @GetMapping("/getAllEmployeeBusLine")
    public List<EmployeeBusLineDto> getAllEmployeeBusLine(){
        return service.getAllEmployeeBusLine();
    }

    @GetMapping("/getEmployeeBusLineById")
    public EmployeeBusLineDto getEmployeeBusLineById(@RequestParam("employeeBusLineId") Integer id){
        return service.getEmployeeBusLineById(id);
    }

    @PostMapping("/saveEmployeeBusLine")
    public EmployeeBusLineDto saveEmployeeBusLine(@Validated @RequestBody EmployeeBusLineDto body){
        return service.saveEmployeeBusLine(body);
    }

    @PutMapping("/updateEmployeeBusLine1")
    public EmployeeBusLineDto updateEmployeeBusLine1(@Validated @RequestBody EmployeeBusLineDto body){
        return service.updateEmployeeBusLine1(body);
    }
    @PatchMapping("/UpdateEmployeeBusLine2")
    public EmployeeBusLineDto updateEmployeeBusLine2(@Validated @RequestBody EmployeeBusLineDto body){
        return service.updateEmployeeBusLine2(body);
    }
    @DeleteMapping("/deleteEmployeeBusLine/{id}")
    public EmployeeBusLineDto deleteEmployeeBusLineById(@PathVariable("id") Integer id){
        return service.deleteEmployeeBusLineById(id);
    }


}
