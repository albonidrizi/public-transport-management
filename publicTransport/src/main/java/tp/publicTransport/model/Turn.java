package tp.publicTransport.model;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor @ToString
@Entity @Table(name = "turne")
@Getter @Setter
public class Turn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false, unique = true)
    private int id;

    @Column(name = "turne", length = 45, nullable = false, unique = false)
    private String turne;

    @Column(name = "time", length = 45, nullable = false, unique = false)
    private String time;
}
