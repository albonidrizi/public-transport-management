package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.ProfessionDto;
import tp.publicTransport.mapper.MapperInterface.ProfessionMapperInterface;
import tp.publicTransport.mapper.ProfessionMapperImpl;
import tp.publicTransport.repository.ProfessionRepository;
import tp.publicTransport.service.ServiceInterface.ProfessionServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProfessionServiceImpl implements ProfessionServiceInterface {

    @Autowired
    private ProfessionMapperImpl mapper;
    @Autowired
    private ProfessionRepository repo;

    @Override
    public List<ProfessionDto> getAllProfession() {
        return repo.findAll()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());      }

    @Override
    public ProfessionDto getProfessionById(Integer id) {
        return repo.findById(id)
                .map(mapper::toDto)
                .orElse(null);    }

    @Override
    public ProfessionDto saveProfession(ProfessionDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public ProfessionDto updateProfession1(ProfessionDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public ProfessionDto updateProfession2(ProfessionDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public ProfessionDto deleteProfessionById(Integer id) {
        ProfessionDto deleted = getProfessionById(id);
        repo.deleteById(id);
        return deleted;        }
}
