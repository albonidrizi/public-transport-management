package tp.publicTransport.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LineDto {
    private int lineId;
    private String lineName;
    private String destination;
    public Integer codeID;

}
