package tp.publicTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tp.publicTransport.model.EmployeeBusLine;

import java.util.List;

@Repository
public interface EmployeeBusLineRepository extends JpaRepository<EmployeeBusLine, Integer> {


    //group all Employee who work in line
    @Query("SELECT e FROM EmployeeBusLine e " +
            "WHERE e.lineId.id = :lineId " )
    List<EmployeeBusLine> groupEmployeeNamesByLineId(@Param("lineId") Integer lineId);

}
