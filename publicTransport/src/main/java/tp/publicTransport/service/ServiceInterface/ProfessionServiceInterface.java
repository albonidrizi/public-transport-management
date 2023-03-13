package tp.publicTransport.service.ServiceInterface;

import tp.publicTransport.dto.ProfessionDto;

import java.util.List;

public interface ProfessionServiceInterface {
    List<ProfessionDto> getAllProfession();
    ProfessionDto getProfessionById(Integer id);
    ProfessionDto saveProfession(ProfessionDto body);
    ProfessionDto updateProfession1(ProfessionDto body);
    ProfessionDto updateProfession2(ProfessionDto body);
    ProfessionDto deleteProfessionById(Integer id);
}
