package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.StationHoursDto;
import tp.publicTransport.mapper.StationHoursMapperImpl;
import tp.publicTransport.repository.StationHoursRepository;
import tp.publicTransport.service.ServiceInterface.StationHoursServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StationHoursServiceImpl implements StationHoursServiceInterface {

    @Autowired
    private StationHoursRepository repository;
    @Autowired
    private StationHoursMapperImpl mapper;


    @Override
    public List<StationHoursDto> getAllStationHours() {
        return repository.findAll()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public StationHoursDto getStationHoursById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

    @Override
    public StationHoursDto saveStationHours(StationHoursDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public StationHoursDto updateStationHours1(StationHoursDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public StationHoursDto updateStationHours2(StationHoursDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public StationHoursDto deleteStationHoursById(Integer id) {
        StationHoursDto deleted = getStationHoursById(id);
        repository.deleteById(id);
        return deleted;
    }

    @Override
    public List<StationHoursDto> getHoursLine(Integer lineId, Integer positionId) {
        return null;
    }

//    @Override
//    public List<StationHoursDto> getHoursLine(Integer lineId, Integer positionId) {
//        return repository.hoursStart(lineId, positionId)
//                .stream().map(mapper::toDto)
//                .collect(Collectors.toList());
//    }

}