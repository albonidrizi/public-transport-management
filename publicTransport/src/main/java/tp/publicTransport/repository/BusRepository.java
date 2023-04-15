package tp.publicTransport.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tp.publicTransport.model.Bus;

import java.util.List;

// @Repository. Ky interface përdor JpaRepository dhe përmban dy metoda të definuara që përdorin anotimin,
// @Query për të krijuar një kërkesë të personalizuar në bazë të fushave të specifikuara nga përdoruesi.
@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {


/*
 Metoda e parë "searchBus" merr dy argumente të tipit String për emrin dhe kodin e autobusit dhe një objekt të Pageable për
 të përcaktuar, një faqe të rezultateve. Ky metodë do të kthejë një listë të objekteve Bus që plotësojnë kriteret e kërkesës
 së personalizuar të definuar në anotimin @Query.
*/
    @Query(value = "SELECT b FROM Bus b WHERE "
            + "(?1 IS NULL OR UPPER (b.bussName) LIKE '%' || UPPER(?1) || '%')"
            + " AND (?2 IS NULL OR UPPER (b.bussCode) LIKE '%' || UPPER(?2) ||'%')")
    List<Bus> searchBus(String bussName, String bussCode, Pageable pageable);


/*
Metoda e dytë "countBus" merr dy argumente të tipit String dhe kthen një numër të tërë që përfaqëson numrin e objekteve Bus që,
plotësojnë kriteret e kërkesës së personalizuar të definuar në anotimin @Query.
*/
    @Query("SELECT COUNT(b) FROM Bus b WHERE " +
            "(?1 IS NULL OR UPPER(b.bussName) LIKE '%' || UPPER(?1) || '%')" +
            "AND (?2 IS NULL OR UPPER (b.bussCode) LIKE '%' || UPPER(?2) || '%')")
    Integer countBus(String bussName, String BussCode);

/*
 Për të krijuar kërkesën e personalizuar, anotimi @Query është përdorur me vlerën "value" që përmban kërkesën
 në gjuhën HQL (Hibernate Query Language). Kjo kërkesë përdor funksionet UPPER dhe LIKE për të kërkuar për fjalë
 kyçe në emrin dhe kodin e autobusit. Gjithashtu, argumentet e kërkesës janë parametrat ?1 dhe ?2 dhe ato janë lidhur
 me vlerat e dhëna nga metodat nëpërmjet shprehjes OR. Nëse një argument është null, kjo do të thotë se ai nuk
 do të ketë efekt në kriteret e kërkesës.
*/

}
