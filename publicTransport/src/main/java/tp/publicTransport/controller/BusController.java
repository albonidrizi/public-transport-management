package tp.publicTransport.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tp.publicTransport.dto.BussDto;
import tp.publicTransport.service.ServiceInterface.BusServiceInterface;
import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PTM")
public class BusController {

    @Autowired
    public BusServiceInterface service;

    @GetMapping("/getAllBuss")
    public ModelAndView getAllBus() {
        List<BussDto> allBuss = service.getAllBus();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("allBuss", allBuss);
        modelAndView.setViewName("busList");
        return modelAndView;
    }

    @PostMapping("/getBussById")
    public String getBussById(@RequestParam(name = "bussId") Integer id, Model model) {
        BussDto buss = service.getBussById(id);
        model.addAttribute("buss", buss);
        return "busDetails";
    }

    @GetMapping("/createBuss")
    public String showCreateBussPage(Model model) {
        model.addAttribute("bussDto", new BussDto());
        return "createBus";
    }
    @PostMapping("/createBuss")
    public String saveBuss(@Validated @ModelAttribute("bussDto") BussDto bussDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "createBus";
        }
        service.saveBuss(bussDto);
        return "redirect:/bus/getAllBuss";
    }
    @PutMapping("/updateBuss1")
    public BussDto updateBuss1(@Validated @RequestBody BussDto body){
        return service.updateBuss1(body);}
    @PatchMapping("/UpdateBuss2")
    public BussDto updateBuss2(@Validated @RequestBody BussDto body){
        return service.updateBuss2(body);
    }
    @DeleteMapping("/deleteBuss/{id}")
    public BussDto deleteBussById(@RequestParam(name = "busId") Integer id){
        return service.deleteBussById(id);
    };

}
