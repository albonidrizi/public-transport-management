package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.BussDto;
import tp.publicTransport.mapper.BusMapperImpl;
import tp.publicTransport.model.Bus;
import tp.publicTransport.repository.BusRepository;
import tp.publicTransport.service.ServiceInterface.BusServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Kjo është një klasë e shërbimit në Spring Boot, e cila implementon një ndërfaqe të quajtur "BusServiceInterface".
// "Service" është një klase që përdoret për të bërë lidhjen midis "repository" dhe "controller" në një aplikacion Spring Boot.
@RequiredArgsConstructor
@Service
public class BusServiceImpl implements BusServiceInterface {


/*
"BusRepository" për të kryer operacione me bazën e të dhënave.
*/
    @Autowired
    private BusRepository repository;


/*"
BusMapperImpl" konverton "dto" në "entity" dhe anasjelltas. Kjo është një teknikë që ndihmon në shmangien e ripërsëritjes së kodit.
*/
    @Autowired
    private BusMapperImpl mapper;


/*
Metoda "getAllBus" kthen një listë të gjithë elementeve të "Bus" duke përdorur metodën "findAll" e "repository"
*/
    @Override
    public List<BussDto> getAllBus() {
      return repository.findAll()
              .stream().map(mapper::toDto)
              .collect(Collectors.toList());
    }


/*
Metoda "getBussById" kthen një autobus nga baza e të dhënave në formën e një "BussDto", duke marrë si parametër një id të autobusit.
*/
    @Override
    public BussDto getBussById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }


/*
Metoda "saveBuss" ndërton një "Bus" të ri duke përdorur një "Dto" të dhënë dhe e ruajti atë në "repository".
*/
    @Override
    public BussDto saveBuss(BussDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }


/*
Metoda "updateBuss1" ndryshon të dhënat e një autobusi në bazën e të dhënave duke përdorur një "BussDto" si input.
*/
    @Override
    public BussDto updateBuss1(BussDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }


/*
Metoda "updateBuss1" ndryshon të dhënat e një autobusi në bazën e të dhënave duke përdorur një "BussDto" si input.
*/
    @Override
    public BussDto updateBuss2(BussDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }


/*
Metoda "deleteBussById" fshin një autobus nga baza e të dhënave duke marrë si parametër një id të autobusit.
*/
    @Override
    public BussDto deleteBussById(Integer id) {
        BussDto deleted = getBussById(id);
        repository.deleteById(id);
        return deleted;
    }


/*
Metoda "busFilter" ndërton një objekt "Pageable" duke përdorur disa nga parametrat e dhënë dhe më pas kërkon një listë të "Bus"
të filtruar duke përdorur një query të caktuar në "repository". Kjo metodë kthen një objekt "Page" që përmban një listë të
elementeve të filtruar, të dhënat e faqes dhe numrin total të elementeve në "repository".
*/
    @Override
    public Page<BussDto> busFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending, String bussName, String bussCode) {

        // Ndërtoni objektin sortingOprion
        Sort sortingOption = isAscending
                ? Sort.by(sort).ascending()
                : Sort.by(sort).descending();

        // Krijoni objektin pageable duke përdorur objektin sortingOption dhe vlerat e dhëna
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sortingOption);

        // Kërkojeni punëtorët nga repo
        List<Bus> bussPage = repository.searchBus(bussName,bussCode,pageable);

        // Konvertoni faqen e punëtorëve në një listë të "EmployeeDto"-ve
        List<BussDto> list = new ArrayList<>();
        Integer count = repository.countBus(bussName,bussCode);

        for (Bus b : bussPage)
            list.add(mapper.toDto(b));

        // Kthejeni një objekt "Page" me listën e "BussDto"-ve, të dhënat e faqes dhe numrin total të elementeve
        return new PageImpl<>(list,pageable,count);
    }
}
