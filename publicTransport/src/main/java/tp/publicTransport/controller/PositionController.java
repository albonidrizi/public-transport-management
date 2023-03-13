package tp.publicTransport.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.PositionDto;
import tp.publicTransport.service.ServiceInterface.PositionServiceInterface;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PTM")
public class PositionController {
    @Autowired
    public PositionServiceInterface service;

    @GetMapping("/getAllPosition")
    public List<PositionDto> getAllPosition(){
        return service.getAllPosition();
    }

    @GetMapping("/getPositionById")
    public PositionDto getPositionById(@RequestParam("employeeBusLineId") Integer id){
        return service.getPositionById(id);
    }

    @PostMapping("/savePosition")
    public PositionDto savePosition(@Validated @RequestBody PositionDto body){
        return service.savePosition(body);
    }

    @PutMapping("/updatePosition1")
    public PositionDto updatePosition1(@Validated @RequestBody PositionDto body){
        return service.updatePosition1(body);
    }
    @PatchMapping("/UpdatePosition2")
    public PositionDto updatePosition2(@Validated @RequestBody PositionDto body){
        return service.updatePosition2(body);
    }
    @DeleteMapping("/deletePosition/{id}")
    public PositionDto deletePositionById(@PathVariable("id") Integer id){
        return service.deletePositionById(id);
    }
}