package tp.publicTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tp.publicTransport.model.StationHours;

import java.util.List;
@Repository
public interface StationHoursRepository extends JpaRepository<StationHours, Integer> {


    @Query("SELECT s FROM StationHours s WHERE s.lineId.lineId=?1 AND s.positionId.positionId=?2")
    List<StationHours> hoursStart(@Param("id") Integer lineId, @Param("id") Integer positionId);


    @Query("SELECT q FROM StationHours q " +
            "LEFT JOIN Line a ON q.lineId.lineId = a.lineId " +
            "LEFT JOIN Position s ON q.positionId.positionId = s.positionId " +
            "WHERE s.position = :position")
    List<StationHours> filterByStationHoursPOSITION(String position);


    // kap orarin e nisjes sipas linjes
//    @Query("SELECT s FROM StationHours s " +
//            "LEFT JOIN Line l ON s.lineId.id=:lineId" +
//            " LEFT JOIN Position p ON s.positionId.id=:positionId")
//    List<StationHoursDto> hoursStart(@Param("positionId") Integer positionId, @Param("lineId") Integer lineId);


//    @Query("SELECT s FROM StationHours s WHERE s.lineId.id=?1 AND s.positionId.id=?2")
//    List<StationHours> hoursStart (@Param("lineId") Integer lineId, @Param("positionId") Integer positionId);

//    @Query("SELECT s FROM StationHours s LEFT JOIN Line l ON s.lineId.id=:lineId" +
//            " LEFT JOIN Position p ON s.positionId.id=:positionId")
//    List<StationHours> hoursStarts(@Param("lineId") Integer lineId, @Param("positionId") Integer positionId);

}
