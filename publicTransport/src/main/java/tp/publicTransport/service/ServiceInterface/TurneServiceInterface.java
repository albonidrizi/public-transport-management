package tp.publicTransport.service.ServiceInterface;

import tp.publicTransport.dto.TurnDto;

import java.util.List;

public interface TurneServiceInterface {
    List<TurnDto> getAllTurn();
    TurnDto getTurnById(Integer id);
    TurnDto saveTurn(TurnDto body);
    TurnDto updateTurn1(TurnDto body);
    TurnDto updateTurn2(TurnDto body);
    TurnDto deleteTurnById(Integer id);
}
