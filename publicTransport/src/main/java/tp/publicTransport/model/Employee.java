package tp.publicTransport.model;

import lombok.*;


import javax.persistence.*;

@Entity @Table(name ="employee" )
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false, unique = true)
    private int id;

    @Column(name = "name",length = 200 , nullable = false, unique = false)
    private String name;

    @Column(name = "surname",length = 200 , nullable = false, unique = false)
    private String surname;

    @Column(name = "age",length = 200, nullable = false, unique = false)
    private String age;

    @Column(name = "gender",length = 200 , nullable = false, unique = false)
    private String gender;

    @Column(name = "email",length = 200 , nullable = false, unique = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "profession_id")
    private Profession professionId;
}
