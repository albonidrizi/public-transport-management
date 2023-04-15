package tp.publicTransport.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tp.publicTransport.dto.ProfessionDto;
import tp.publicTransport.model.Employee;
import tp.publicTransport.model.Profession;


import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //group all employes depending by profesion
    @Query("SELECT e FROM Employee e WHERE e.professionId.id= ?1")
    List<Employee> listemployeeProfession(@Param("professionId") Integer id);

    //    list all employes that dont have grade
    @Query("SELECT e FROM Employee e WHERE e.professionId.grade IS NULL")
    List<Employee> listEmployeWithoutGrade();

    //    list all employes that have state in (brenda shtetit)
    @Query("SELECT p FROM Employee p LEFT JOIN Profession c " + "" +
            "ON c.id=p.professionId.id WHERE c.state='in'")
    List<Employee> listEmlInState();


    @Query("SELECT e FROM Employee e WHERE " +
            "(?1 IS NULL OR UPPER (e.name) LIKE '%' || UPPER(?1) || '%')" +
            "AND (?2 IS NULL OR UPPER (e.surname) LIKE '%' || UPPER(?2) || '%')" +
            "AND (?3 IS NULL OR UPPER (e.age) LIKE '%' || UPPER(?3) || '%')" +
            "AND (?4 IS NULL OR UPPER (e.gender) LIKE '%' || UPPER(?4) || '%')" +
            "AND (?5 IS NULL OR UPPER (e.email) LIKE '%' || UPPER(?5) || '%')" +
            "AND (?6 IS NULL OR UPPER (e.professionId.profession) LIKE '%' || UPPER(?6) || '%')")
    List<Employee> searchEmployee (String name, String surname, String age, String gender, String email, String profession, Pageable pageable);

    @Query("SELECT COUNT(e) FROM Employee e WHERE " +
            "(?1 IS NULL OR UPPER (e.name) LIKE '%' || UPPER(?1) || '%' ) " +
            "AND (?2 IS NULL OR UPPER (e.surname) LIKE '%' || UPPER(?2) || '%' ) " +
            "AND (?3 IS NULL OR UPPER (e.age) LIKE '%' || UPPER(?3) || '%' ) " +
            "AND (?4 IS NULL OR UPPER (e.gender) LIKE '%' || UPPER(?4) || '%' ) " +
            "AND (?5 IS NULL OR UPPER (e.email) LIKE '%' || UPPER(?5) || '%') " +
            "AND (?6 IS NULL OR UPPER (e.professionId.profession) LIKE '%' || UPPER(?6) || '%')")
    Integer counEmployee (String name, String surname, String age, String gender, String email, String profession);


}
