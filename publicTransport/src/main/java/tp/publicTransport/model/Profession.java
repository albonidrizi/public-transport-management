package tp.publicTransport.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name ="profession" )
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Profession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false, unique = true)
    private int id;

    @Column(name = "profession",length = 200 , nullable = false, unique = false)
    private String profession;

    @Column(name = "grade",length = 200 , nullable = true, unique = false)
    private String grade;

    @Column(name = "state",length = 200 , nullable = true, unique = false)
    private String state;
}
