package tp.publicTransport.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EmployeeDto {
    private int id;
    private String name;
    private String surname;
    private String age;
    private String gender;
    private String email;
    private ProfessionDto professionDto;
}
