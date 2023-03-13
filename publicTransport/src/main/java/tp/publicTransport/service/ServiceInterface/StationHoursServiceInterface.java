package tp.publicTransport.service.ServiceInterface;

import tp.publicTransport.dto.StationHoursDto;

import java.util.List;

public interface StationHoursServiceInterface {

    List<StationHoursDto> getAllStationHours();

    StationHoursDto getStationHoursById(Integer id);

    StationHoursDto saveStationHours (StationHoursDto body);

    StationHoursDto updateStationHours1 (StationHoursDto body);

    StationHoursDto updateStationHours2 (StationHoursDto body);

    StationHoursDto deleteStationHoursById(Integer id);
}
