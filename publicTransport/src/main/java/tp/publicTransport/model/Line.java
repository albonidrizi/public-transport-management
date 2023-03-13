package tp.publicTransport.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name = "line")
@Getter @Setter
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false, unique = true)
    private int id;

    @Column(name = "line_name", length = 200, nullable = false, unique = false)
    private String lineName;

    @Column(name = "destination",length = 200 , nullable = false, unique = false)
    private String destination;
}
