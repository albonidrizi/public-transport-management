package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.EmployeeDto;


import tp.publicTransport.mapper.EmployeeMapperImpl;
import tp.publicTransport.model.Employee;

import tp.publicTransport.repository.EmployeeRepository;
import tp.publicTransport.service.ServiceInterface.EmployeeServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

    @Autowired
    private EmployeeRepository repo;

    @Autowired
    private EmployeeMapperImpl mapper;

    @Override
    public List<EmployeeDto> getAllEmployee() {
        return repo.findAll()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto getEmployeeById(Integer id) {
        return repo.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

    @Override
    public EmployeeDto saveEmployee(EmployeeDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public EmployeeDto updateEmployee1(EmployeeDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public EmployeeDto updateEmployee2(EmployeeDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public EmployeeDto deleteEmployeeById(Integer id) {
        EmployeeDto deleted = getEmployeeById(id);
        repo.deleteById(id);
        return deleted;
    }


    @Override
    public List<EmployeeDto> getWithoutGradeEmployee() {
        return repo.listEmployeWithoutGrade()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDto> getByProfessionId(Integer id) {
        return repo.listemployeeProfession(id)
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDto> getByInState() {
        return repo.listEmlInState()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Page<EmployeeDto> filterE(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending,
                                    String name, String surname, String age, String gender, String email, String profession) {

//    1    if (sort != null && sort.equals(PROFESIONinPROFESION))
//            sort = PROFESIONIDinEMPLOYE + PROFESIONinPROFESION;
//    2    if (PROFESIONinPROFESION.equals(sort))
//            sort = PROFESIONinPROFESION;
//    3    if (PROFESIONinPROFESION.equals(sort))
//            sort = PROFESIONIDinEMPLOYE + PROFESIONinPROFESION;

        // Ndërtoni objektin sortingOprion
        Sort sortingOption = isAscending
                ? Sort.by(sort).ascending()
                : Sort.by(sort).descending();

        // Krijoni objektin pageable duke përdorur objektin sortingOption dhe vlerat e dhëna
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sortingOption);

        // Kërkojeni punëtorët nga repo
        List<Employee> employeePage = repo.searchEmployee(name,surname,age, gender, email, profession, pageable);

        // Konvertoni faqen e punëtorëve në një listë të "EmployeeDto"-ve
        List<EmployeeDto> list = new ArrayList<>();
        Integer count = repo.counEmployee(name, surname, age, gender, email, profession);

        for (Employee e : employeePage)
            list.add(mapper.toDto(e));


        // Kthejeni një objekt "Page" me listën e "EmployeeDto"-ve, të dhënat e faqes dhe numrin total të elementeve
        return new PageImpl<>(list, pageable, count);
    }

}
