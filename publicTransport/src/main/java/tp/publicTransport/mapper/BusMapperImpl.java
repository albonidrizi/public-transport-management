package tp.publicTransport.mapper;

import org.springframework.stereotype.Component;
import tp.publicTransport.dto.BussDto;
import tp.publicTransport.mapper.MapperInterface.BusMapperInterface;
import tp.publicTransport.model.Bus;


/*
Klasa BusMapperImpl implementon interface BusMapperInterface dhe përmban dy metoda:
toEntity(BussDto dto)
toDto(Bus entity)
*/
@Component
public class BusMapperImpl implements BusMapperInterface {

/*
 Ky kod implementon një mapper që konverton objektet e klasës Bus dhe BussDto nga njëra në tjetrën.
 Klasa Bus paraqet një model për një autobus në sistem, ndërsa BussDto paraqet një DTO (Data Transfer Object)
 që përdoret për të komunikuar me klientin, për shkak të kësaj kodi mund të përdoret për të konvertuar objekte të
 klasës Bus dhe BussDto dhe për të kryer operacione CRUD në objektet e tyre për të komunikuar me bazën e të dhënave.
*/

    // toEntity(BussDto dto): Kjo metodë merr një objekt BussDto si input dhe kthen një objekt Bus si output.
    // Metoda krijoj një objekt Bus dhe i atribuon vlerat e fushave nga objekti BussDto.
    @Override
    public Bus toEntity(BussDto dto) {
        if (dto == null) return null;

        Bus entity = new Bus();
        entity.setId(dto.getId());
        entity.setBussName(dto.getBussName());
        entity.setBussCode(dto.getBussCode());
        return entity;
    }

   // toDto(Bus entity): Kjo metodë merr një objekt Bus si input dhe kthen një objekt BussDto si output.
   // Metoda krijoj një objekt BussDto dhe i atribuon vlerat e fushave nga objekti Bus.
    @Override
    public BussDto toDto(Bus entity) {
        if (entity == null) return null;

        BussDto dto = new BussDto();
        dto.setId(entity.getId());
        dto.setBussName(entity.getBussName());
        dto.setBussCode(entity.getBussCode());
        return dto;
    }

}
