package tp.publicTransport.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.LineDto;
import tp.publicTransport.service.ServiceInterface.LineServiceInterface;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/public_transport_sys_mng")
public class LineController {

    @Autowired
    LineServiceInterface service;

    @GetMapping("/getAllLine")
    public List<LineDto> getAllLine(){
       return service.getAllLine();
    };

    @GetMapping("/getLineById")
    public LineDto getLineById(@RequestParam("lineId") Integer id){
        return service.getLineById(id);
    };
    @PostMapping("/saveLine")
    public LineDto saveLine(@Validated @RequestBody LineDto body){
        return service.saveLine(body);
    }
    @PutMapping("/updateLine1")
    public LineDto updateLine1(@Validated @RequestBody LineDto body){
        return service.updateLine1(body);
    };
    @PatchMapping("/UpdateLine2")
    public LineDto updateLine2(@Validated @RequestBody LineDto body){
        return service.updateLine2(body);
    };
    @DeleteMapping("/deleteLine/{id}")
    public LineDto deleteLineById(@PathVariable("id") Integer id){ return service.deleteLineById(id);};


    @GetMapping("/getLineByName")
    public List<LineDto> getLineByName(@RequestParam("lineName") String lineName){
        return service.getlineByName(lineName);
    }

    @GetMapping("/filter")
    public Page<LineDto> filter(@RequestParam Integer pageSize,
                                @RequestParam Integer pageNumber,
                                @RequestParam String sort, Boolean isAscending,
                                @RequestParam(name = "lineName", required = false) String lineName,
                                @RequestParam(name = "destination", required = false) String destination,
                                @RequestParam(name = "codeID", required = false) Integer codeID) {
        return service.filter(pageSize, pageNumber, sort, isAscending, lineName, destination, codeID);
    }


}
