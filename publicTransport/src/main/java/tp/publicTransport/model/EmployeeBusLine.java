package tp.publicTransport.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity @Table(name = "employee_bus_line")
@Getter @Setter
public class EmployeeBusLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false, unique = true)
    private int id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employeeId;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus busId;
    
    @ManyToOne
    @JoinColumn(name = "turn_id")
    private Turn turnId;

    @ManyToOne
    @JoinColumn(name = "line_id")
    private Line lineId;
}
