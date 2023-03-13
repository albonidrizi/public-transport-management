package tp.publicTransport.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.TurnDto;
import tp.publicTransport.service.ServiceInterface.TurneServiceInterface;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PTM")
public class TurnController {

    @Autowired
    public TurneServiceInterface service;

    public
    @GetMapping("/getAllTurn") List<TurnDto> getAllTurn() {
        return service.getAllTurn();
    }

    public
    @GetMapping("/getTurnById") TurnDto getTurnById(@RequestParam(name = "turnId") Integer id) {
        return service.getTurnById(id);
    }

    public
    @PostMapping("/createTurn") TurnDto createTurn(@Validated @RequestBody TurnDto body) {
        return service.saveTurn(body);
    }

    public
    @PutMapping("/updateTurn1") TurnDto updateTurn1(@Validated @RequestBody TurnDto body) {
        return service.updateTurn1(body);
    }

    public
    @PatchMapping("/updateTurn2") TurnDto updateTurn2(@Validated @RequestBody TurnDto body) {
        return service.updateTurn2(body);
    }

    @DeleteMapping("/deleteTurn/{TurnId}")
    public TurnDto deleteTurnPId(@PathVariable("turnId") Integer id) {
        return service.deleteTurnById(id);
    }

    @DeleteMapping("/deleteTurn")
    public TurnDto deleteTurn(@RequestParam(name = "turnId") Integer id) {
        return service.deleteTurnById(id);
    }
}
