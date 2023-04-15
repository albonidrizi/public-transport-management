package tp.publicTransport.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.TurnDto;
import tp.publicTransport.mapper.TurneMapperImpl;
import tp.publicTransport.repository.TurneRepository;
import tp.publicTransport.service.ServiceInterface.TurneServiceInterface;

import java.util.List;
import java.util.stream.Collectors;


@Service @RequiredArgsConstructor
public class TurneServiceImpl implements TurneServiceInterface {

    @Autowired
    private TurneRepository repo;

    @Autowired
    private TurneMapperImpl mapper;

    @Override
    public List<TurnDto> getAllTurn() {
        return repo.findAll()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TurnDto getTurnById(Integer id) {
        return repo.findById(id)
                .map(mapper::toDto)
                .orElse(null);    }

    @Override
    public TurnDto saveTurn(TurnDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public TurnDto updateTurn1(TurnDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public TurnDto updateTurn2(TurnDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public TurnDto deleteTurnById(Integer id) {
        TurnDto deleted = getTurnById(id);
        repo.deleteById(id);
        return deleted;        }
}
