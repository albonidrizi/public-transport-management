package tp.publicTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.publicTransport.model.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {

}
