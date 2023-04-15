package tp.publicTransport.controller;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tp.publicTransport.dto.BussDto;
import tp.publicTransport.service.ServiceInterface.BusServiceInterface;
import java.util.List;

/*
  Kontrolleri është konfiguruar për të punuar me njëkohësisht HTTP GET, POST, PUT, PATCH dhe DELETE. Kjo është kryesisht për të lejuar
  qasje në API nga shfrytëzuesit në mënyrë të ndryshme dhe për të lejuar ndryshimet në bazën e të dhënave nëpërmjet këtyre kërkesave HTTP.

  1.    @RequiredArgsConstructor: Kjo është një anotim Spring që krijon automatikisht një konstruktor për klasën duke injektuar të gjitha
        fushat e shënuara me anotimin @Autowired. Kjo anotim lehtëson menaxhimin e injektimit të varësive dhe bën kodin më të lexueshëm.
  2.    @CrossOrigin(origins = "*"): Kjo anotim lejon kërkesat nga të gjitha burimet (origjina *) në këtë REST API.
  3.    @RestController: Kjo është një anotim Spring që tregon se kjo klasë është një REST Controller.
  4.    @RequestMapping("/public_transport_sys_mng"): Kjo anotim vendos rrugën fillestare për kërkesat HTTP për këtë kontroller.

   Në këtë rast, kjo klasë është kontrolleri për menaxhimin e autobusëve në sistemin e transportit publik dhe përdor anotimet
     për të lejuar kërkesat nga të gjitha burimet, për të vendosur rrugën fillestare të kërkesave HTTP, dhe për të injektuar
     një instance të klasës së shërbimit të autobusëve nëpërmjet anotimit @Autowired.
*/
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/public_transport_sys_mng")
public class BusController {

/* Në këtë kontroller, të dhënat e autobusëve manipulohen duke përdorur një shërbim (service)
   të caktuar që është injektuar në kontrollerinë përmes Spring Framework Dependency
   @Autowired. Kjo anotim lehtëson menaxhimin e injektimit të varësive dhe bën kodin më të lexueshëm */
    @Autowired
    private BusServiceInterface service;


//Metodat që shërbejnë për kërkesat HTTP janë:
      //getAllBus(): Metoda kthen të gjitha entitetet Bus si një listë të BussDto.
    @GetMapping("/getAllBuss")
    private List<BussDto> getAllBus() {
        return service.getAllBus();
    }


//getBussById(): Metoda merr një id si parameter dhe kthen entitetin Bus për atë id si një BussDto.
    @GetMapping("/getBussById")
    public BussDto getBussById(@Validated @RequestParam(name = "bussId") Integer id) {
        return service.getBussById(id);
    }


//getBussByID(): Metoda merr një id si parameter dhe kthen entitetin Bus për atë id si një BussDto.
    @GetMapping("/getBussByID/{id}")
    public BussDto getBussByID(@Validated @PathVariable("id") Integer id) {
        return service.getBussById(id);
    }


//saveBuss(): Metoda krijon një entitet Bus të ri duke përdorur të dhënat e dhëna nga klienti dhe kthen entitetin e krijuar si një BussDto.
    @PostMapping("/createBuss")
    public BussDto saveBuss(@Validated @RequestBody BussDto body) {
        return service.saveBuss(body);
    }


//updateBuss1(): Metoda përditëson një entitet Bus ekzistues duke përdorur të dhënat e dhëna nga klienti dhe kthen entitetin e përditësuar si një BussDto.
    @PutMapping("/updateBuss1")
    public BussDto updateBuss1(@Validated @RequestBody BussDto body) {
        return service.updateBuss1(body);
    }


//updateBuss2(): Metoda përditëson një entitet Bus ekzistues duke përdorur të dhënat e dhëna nga klienti dhe kthen entitetin e përditësuar si një BussDto.
    @PatchMapping("/UpdateBuss2")
    public BussDto updateBuss2(@Validated @RequestBody BussDto body) {
        return service.updateBuss1(body);
    }


//deleteBussById(): Metoda fshin një entitet Bus për një id të dhënë dhe kthen entitetin e fshirë si një BussDto.
    @DeleteMapping("/deleteBuss")
    public BussDto deleteBussById(@Validated @RequestParam(name = "busId") Integer id) {
        return service.deleteBussById(id);
    }


//deleteBussByID(): Metoda fshin një entitet Bus për një id të dhënë dhe kthen entitetin e fshirë si një BussDto.
    @DeleteMapping("/deletebuss/{id}")
    public BussDto deleteBussByID(@Validated @PathVariable("id") Integer id) {
        return service.deleteBussById(id);
    }


//busFilter(): Metoda kthen një faqe të paginuar të entiteteve Bus, të filtruara nga parametrat e dhënë nga klienti.
    @GetMapping("bussFilter")
    public Page<BussDto> busFilter(@RequestParam Integer pageSize,
                                   @RequestParam Integer pageNumber,
                                   @RequestParam String sort, Boolean isAscending,
                                   @RequestParam(name = "bussName", required = false) String bussName,
                                   @RequestParam(name = "bussCode", required = false) String bussCode) {
        return service.busFilter(pageSize, pageNumber, sort, isAscending, bussName, bussCode);
    }

}
