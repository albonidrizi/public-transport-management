package tp.publicTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.publicTransport.model.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}
