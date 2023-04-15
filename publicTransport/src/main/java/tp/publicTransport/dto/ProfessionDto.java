package tp.publicTransport.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter @Setter
public class ProfessionDto {
    private int id;
    private String profession;
    private String grade;
    private String state;

}
