package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.EmployeeBusLineDto;
import tp.publicTransport.mapper.EmployeeBusLineMapperImpl;
import tp.publicTransport.repository.EmployeeBusLineRepository;
import tp.publicTransport.service.ServiceInterface.EmployeeBusLineServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployeeBusLineServiceImpl implements EmployeeBusLineServiceInterface {

    @Autowired
    public EmployeeBusLineRepository repository;
    @Autowired
    public EmployeeBusLineMapperImpl mapper;

    @Override
    public List<EmployeeBusLineDto> getAllEmployeeBusLine() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto).
                collect(Collectors.toList());
    }
    @Override
    public EmployeeBusLineDto getEmployeeBusLineById(Integer id) {

        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
    @Override
    public EmployeeBusLineDto saveEmployeeBusLine(EmployeeBusLineDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }
    @Override
    public EmployeeBusLineDto updateEmployeeBusLine1(EmployeeBusLineDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public EmployeeBusLineDto updateEmployeeBusLine2(EmployeeBusLineDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public EmployeeBusLineDto deleteEmployeeBusLineById(Integer id) {
        EmployeeBusLineDto delete = getEmployeeBusLineById(id);
        repository.deleteById(id);
        return delete;
    }
}
