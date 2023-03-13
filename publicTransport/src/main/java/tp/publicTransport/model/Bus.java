package tp.publicTransport.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name = "bus")
@Getter @Setter
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name="bus_name",length = 200, nullable = false,unique = false)
    private String busName;

    @Column(name = "bus_code", length = 200, nullable = false, unique = false)
    private String busCode;

}
