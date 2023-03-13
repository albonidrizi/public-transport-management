package tp.publicTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.publicTransport.model.StationHours;

public interface StationHoursRepository extends JpaRepository<StationHours, Integer> {
}
