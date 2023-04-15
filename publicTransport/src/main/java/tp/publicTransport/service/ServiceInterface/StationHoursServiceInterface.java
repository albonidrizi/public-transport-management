package tp.publicTransport.service.ServiceInterface;

import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tp.publicTransport.dto.StationHoursDto;

import java.util.List;

public interface StationHoursServiceInterface {

    List<StationHoursDto> getAllStationHours();

    StationHoursDto getStationHoursById(Integer id);

    StationHoursDto saveStationHours (StationHoursDto body);

    StationHoursDto updateStationHours1 (StationHoursDto body);

    StationHoursDto updateStationHours2 (StationHoursDto body);

    StationHoursDto deleteStationHoursById(Integer id);

    List<StationHoursDto> getHoursLine(Integer lineId, Integer positionId);
}
