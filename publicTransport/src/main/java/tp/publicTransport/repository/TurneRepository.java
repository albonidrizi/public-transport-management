package tp.publicTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.publicTransport.model.Turn;

//@Repository
public interface TurneRepository extends JpaRepository<Turn, Integer> {
}
