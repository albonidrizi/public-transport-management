package tp.publicTransport.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.LineDto;
import tp.publicTransport.service.ServiceInterface.LineServiceInterface;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PTM")
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

}
