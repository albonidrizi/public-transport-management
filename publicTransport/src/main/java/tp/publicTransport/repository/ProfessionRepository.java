package tp.publicTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp.publicTransport.model.Profession;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Integer> {
}
