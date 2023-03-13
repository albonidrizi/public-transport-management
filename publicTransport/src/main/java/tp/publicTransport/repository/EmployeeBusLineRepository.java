package tp.publicTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.publicTransport.dto.EmployeeBusLineDto;
import tp.publicTransport.model.Employee;
import tp.publicTransport.model.EmployeeBusLine;

public interface EmployeeBusLineRepository extends JpaRepository<EmployeeBusLine, Integer> {
}
