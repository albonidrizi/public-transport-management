package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.PositionDto;
import tp.publicTransport.mapper.PositionMapperImpl;
import tp.publicTransport.repository.PositionRepository;
import tp.publicTransport.service.ServiceInterface.PositionServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PositionServiceImpl implements PositionServiceInterface {

    @Autowired
    public PositionRepository repository;

    @Autowired
    public PositionMapperImpl mapper;

    @Override
    public List<PositionDto> getAllPosition() {
        return repository.findAll().
                stream().map(mapper::toDto).
                collect(Collectors.toList());
    }

    @Override
    public PositionDto getPositionById(Integer id) {
        return repository.findById(id).
                map(mapper::toDto).
                orElse(null);
    }

    @Override
    public PositionDto savePosition(PositionDto body) {

        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public PositionDto updatePosition1(PositionDto body) {

        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public PositionDto updatePosition2(PositionDto body) {

        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public PositionDto deletePositionById(Integer id) {
        PositionDto deleted = getPositionById(id);
        repository.deleteById(id);
        return deleted;
    }
}
