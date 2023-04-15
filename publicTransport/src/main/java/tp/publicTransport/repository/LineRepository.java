package tp.publicTransport.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tp.publicTransport.model.Line;

import java.util.List;

@Repository
public interface LineRepository extends JpaRepository<Line, Integer> {

    //kap te gjithe colonen descrition
    @Query("SELECT l.destination FROM Line l")
    List<String> getAllLineDestination();

    //group all Line depending by line name
    @Query("SELECT l FROM Line l WHERE l.lineName=?1")
    List<Line> getlineByName (@Param("lineName") String lineName);



    @Query(value = "SELECT s FROM Line s WHERE "
            + "(?1 IS NULL OR UPPER (s.lineName) LIKE '%' || UPPER(?1) || '%')"
            + " AND (?2 IS NULL OR UPPER (s.destination) LIKE '%' || UPPER(?2) ||'%')"
            + " AND (?3 IS NULL OR s.codeID.id= ?3)")
//            "AND (?4 IS NULL OR s.professionId.id= ?4)" +
//            "AND (?5 IS NULL OR s.professionId.profession= ?5)"
//            + "AND (?6 IS NULL OR s.professionId.grade= ?6)")
    List<Line> searchLineBus(String lineName, String destination, Integer codeID, Pageable pageable);
//    , String profession, String grade,

    @Query("SELECT COUNT(s) FROM Line s WHERE (?1 IS NULL OR UPPER (s.lineName) LIKE '%' || UPPER(?1) ||'%')"
            + " AND (?2 IS NULL OR UPPER (s.destination) LIKE '%' || UPPER(?2) ||'%')"
            + " AND (?3 IS NULL OR s.codeID.id= ?3)")
    Integer counLineBus(String lineName, String destination, Integer codeID);
//    , String profession, String grade,



}
