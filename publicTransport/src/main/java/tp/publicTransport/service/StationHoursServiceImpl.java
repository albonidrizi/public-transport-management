package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.StationHoursDto;
import tp.publicTransport.mapper.StationHoursMapperImpl;
import tp.publicTransport.repository.StationHoursRepository;
import tp.publicTransport.service.ServiceInterface.StationHoursServiceInterface;

import java.util.List;
@RequiredArgsConstructor
@Service
public class StationHoursServiceImpl implements StationHoursServiceInterface {

    @Autowired
    public StationHoursRepository repository;
    @Autowired
    public StationHoursMapperImpl mapper;


    @Override
    public List<StationHoursDto> getAllStationHours() {
        return null;
    }

    @Override
    public StationHoursDto getStationHoursById(Integer id) {
        return null;
    }

    @Override
    public StationHoursDto saveStationHours(StationHoursDto body) {
        return null;
    }

    @Override
    public StationHoursDto updateStationHours1(StationHoursDto body) {
        return null;
    }

    @Override
    public StationHoursDto updateStationHours2(StationHoursDto body) {
        return null;
    }

    @Override
    public StationHoursDto deleteStationHoursById(Integer id) {
        return null;
    }
}