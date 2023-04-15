package tp.publicTransport.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity @Table(name = "position")
@Getter @Setter
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false, unique = true)
    private int positionId;

    @Column(name = "position",length = 45 , nullable = false, unique = false)
    private String position;
}
