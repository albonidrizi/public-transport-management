package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.LineDto;
import tp.publicTransport.mapper.LineMapperImpl;
import tp.publicTransport.repository.LineRepository;
import tp.publicTransport.service.ServiceInterface.LineServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LineServiceImpl implements LineServiceInterface {
    @Autowired
    public LineRepository repo;
    @Autowired
    public LineMapperImpl mapper;

    @Override
    public List<LineDto> getAllLine() {
        return repo.findAll()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());    }

    @Override
    public LineDto getLineById(Integer id) {
        return repo.findById(id)
                .map(mapper::toDto)
                .orElse(null);    }

    @Override
    public LineDto saveLine(LineDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public LineDto updateLine1(LineDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public LineDto updateLine2(LineDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public LineDto deleteLineById(Integer id) {
        LineDto deleted = getLineById(id);
        repo.deleteById(id);
        return deleted;     }
}
