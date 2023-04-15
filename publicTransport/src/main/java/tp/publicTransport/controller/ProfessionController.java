package tp.publicTransport.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.ProfessionDto;
import tp.publicTransport.service.ServiceInterface.ProfessionServiceInterface;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/public_transport_sys_mng")
public class ProfessionController {
    @Autowired
    public ProfessionServiceInterface service;

    @GetMapping("/getAllProfession")
    public List<ProfessionDto> getAllProfession() {
        return service.getAllProfession();
    }

    @GetMapping("/getProfessionById")
    public ProfessionDto getProfessionById(@RequestParam(name = "professionId") Integer id) {
        return service.getProfessionById(id);
    }

    @PostMapping("/createProfession")
    public ProfessionDto createProfession(@Validated @RequestBody ProfessionDto body) {
        return service.saveProfession(body);
    }

    @PutMapping("/updateProfession1")
    public ProfessionDto updateProfession1(@Validated @RequestBody ProfessionDto body) {
        return service.updateProfession1(body);
    }

    @PatchMapping("/updateProfession2")
    public ProfessionDto updateProfession2(@Validated @RequestBody ProfessionDto body) {
        return service.updateProfession2(body);
    }

    @DeleteMapping("/deleteProfession/{professionId}")
    public ProfessionDto deleteProfessionPId(@PathVariable("professionId") Integer id) {
        return service.deleteProfessionById(id);
    }

    @DeleteMapping("/deleteProfession")
    public ProfessionDto delete(@RequestParam(name = "professionId") Integer id) {
        return service.deleteProfessionById(id);
    }
}
