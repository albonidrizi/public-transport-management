package tp.publicTransport.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.StationHoursDto;
import tp.publicTransport.service.ServiceInterface.StationHoursServiceInterface;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/public_transport_sys_mng")
public class StationHoursController {

    @Autowired
    public StationHoursServiceInterface service;

    @GetMapping("/getAllStationHours")
    public List<StationHoursDto> getAllStationHours(){
        return service.getAllStationHours();
    }

    @GetMapping("/getStationById")
    public StationHoursDto getStationHoursById(@RequestParam("StationHoursId") Integer id){
        return service.getStationHoursById(id);
    }

    @PostMapping("/saveStationHours")
    public StationHoursDto saveStationHours(@Validated @RequestBody StationHoursDto body){
        return service.saveStationHours(body);
    }

    @PutMapping("/updateStationHours1")
    public StationHoursDto updateStationHours1(@Validated @RequestBody StationHoursDto body){
        return service.updateStationHours1(body);
    }
    @PatchMapping("/updateStation2")
    public StationHoursDto updateStationHours2(@Validated @RequestBody StationHoursDto body){
        return service.updateStationHours2(body);
    }
    @DeleteMapping("/deleteStation/{id}")
    public StationHoursDto deleteStationHoursById(@PathVariable("id") Integer id){
        return service.deleteStationHoursById(id);
    }
    @GetMapping("/getHoursLine")
    public  List<StationHoursDto> hoursLine (@RequestParam("lineId")Integer lineId ,@RequestParam("positionId") Integer positonId){
        return service.getHoursLine(lineId,positonId);
    }
}
