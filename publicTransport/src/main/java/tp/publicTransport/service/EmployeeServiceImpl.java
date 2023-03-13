package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.EmployeeDto;
import tp.publicTransport.mapper.EmployeeMapperImpl;
import tp.publicTransport.repository.EmployeeRepository;
import tp.publicTransport.service.ServiceInterface.EmployeeServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

    @Autowired
    public EmployeeRepository repo;

    @Autowired
    public EmployeeMapperImpl mapper;

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
}
