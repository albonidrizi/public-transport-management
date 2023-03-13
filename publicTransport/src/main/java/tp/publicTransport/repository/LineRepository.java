package tp.publicTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.publicTransport.model.Line;

@Repository
public interface LineRepository extends JpaRepository<Line, Integer> {
}
