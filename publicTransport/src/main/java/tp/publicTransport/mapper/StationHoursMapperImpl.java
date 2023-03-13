package tp.publicTransport.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tp.publicTransport.dto.StationHoursDto;
import tp.publicTransport.mapper.MapperInterface.LineMapperInterface;
import tp.publicTransport.mapper.MapperInterface.PositionMapperInterface;
import tp.publicTransport.mapper.MapperInterface.StationHoursMapperInterface;
import tp.publicTransport.model.StationHours;
@Component
public class StationHoursMapperImpl implements StationHoursMapperInterface {

    @Autowired
    private LineMapperInterface lineMapperInterface;
    @Autowired
    private PositionMapperInterface positionMapperInterface;

    @Override
    public StationHours toEntity(StationHoursDto dto) {
        if (dto == null)return null;

        StationHours entity = new StationHours();

        entity.setId(dto.getId());
        entity.setLineId(lineMapperInterface.toEntity(dto.getLineDto()));
        entity.setPositionId(positionMapperInterface.toEntity(dto.getPositionDto()));

        entity.setUejl(dto.getUejl());
        entity.setMolino(dto.getMolino());
        entity.setBexhetiKompani(dto.getBexhetiKompani());
        entity.setHitMobilie(dto.getHitMobilie());
        entity.setMakPetrol(dto.getMakPetrol());
        entity.setShipadi(dto.getShipadi());
        entity.setRotring(dto.getRotring());
        entity.setXhamiaLarme(dto.getXhamiaLarme());
        entity.setGjygji(dto.getGjygji());
        entity.setFitnesArena(dto.getFitnesArena());
        entity.setPallatiKultures(dto.getPallatiKultures());
        entity.setRonaldo(dto.getRonaldo());
        entity.setVeroJambo(dto.getVeroJambo());
        entity.setPallmaMall(dto.getPallmaMall());
        entity.setStacioniAutobuseve(dto.getStacioniAutobuseve());
        entity.setXhepcishtRenova(dto.getXhepcishtRenova());
        entity.setXhepcishtAlpi(dto.getXhepcishtAlpi());
        entity.setXhepcishtVenecia(dto.getXhepcishtVenecia());
        entity.setPorojShkolla(dto.getPorojShkolla());
        entity.setPorojIra(dto.getPorojIra());
        entity.setXhamiaDrenovec(dto.getXhamiaDrenovec());
        entity.setShkolla7marsi(dto.getShkolla7marsi());
        entity.setCerdhePotok(dto.getCerdhePotok());
        entity.setShkollaMuzikes(dto.getShkollaMuzikes());
        entity.setShparkaseBank(dto.getShparkaseBank());
        entity.setEmbeltoreMostar1(dto.getEmbeltoreMostar1());
        entity.setMobiljeAntillop(dto.getMobiljeAntillop());
        entity.setRecicMadhe(dto.getRecicMadhe());
        entity.setShkollaPerparimiRM(dto.getShkollaPerparimiRM());
        entity.setVarrezatRecicVogel(dto.getVarrezatRecicVogel());
        entity.setRKurtishi(dto.getRKurtishi());
        entity.setArabati(dto.getArabati());
        entity.setVarrezatQytetit(dto.getVarrezatQytetit());

        return entity;
    }

    @Override
    public StationHoursDto toDto(StationHours entity) {
        if(entity == null)return null;

        StationHoursDto dto = new StationHoursDto();

        dto.setId(entity.getId());
        dto.setLineDto(lineMapperInterface.toDto(entity.getLineId()));
        dto.setPositionDto(positionMapperInterface.toDto(entity.getPositionId()));

        dto.setUejl(entity.getUejl());
        dto.setMolino(entity.getMolino());
        dto.setBexhetiKompani(entity.getBexhetiKompani());
        dto.setHitMobilie(entity.getHitMobilie());
        dto.setMakPetrol(entity.getMakPetrol());
        dto.setShipadi(entity.getShipadi());
        dto.setRotring(entity.getRotring());
        dto.setXhamiaLarme(entity.getXhamiaLarme());
        dto.setGjygji(entity.getGjygji());
        dto.setFitnesArena(entity.getFitnesArena());
        dto.setPallatiKultures(entity.getPallatiKultures());
        dto.setRonaldo(entity.getRonaldo());
        dto.setVeroJambo(entity.getVeroJambo());
        dto.setPallmaMall(entity.getPallmaMall());
        dto.setStacioniAutobuseve(entity.getStacioniAutobuseve());
        dto.setXhepcishtRenova(entity.getXhepcishtRenova());
        dto.setXhepcishtAlpi(entity.getXhepcishtAlpi());
        dto.setXhepcishtVenecia(entity.getXhepcishtVenecia());
        dto.setPorojShkolla(entity.getPorojShkolla());
        dto.setPorojIra(entity.getPorojIra());
        dto.setXhamiaDrenovec(entity.getXhamiaDrenovec());
        dto.setShkolla7marsi(entity.getShkolla7marsi());
        dto.setCerdhePotok(entity.getCerdhePotok());
        dto.setShkollaMuzikes(entity.getShkollaMuzikes());
        dto.setShparkaseBank(entity.getShparkaseBank());
        dto.setEmbeltoreMostar1(entity.getEmbeltoreMostar1());
        dto.setMobiljeAntillop(entity.getMobiljeAntillop());
        dto.setRecicMadhe(entity.getRecicMadhe());
        dto.setShkollaPerparimiRM(entity.getShkollaPerparimiRM());
        dto.setVarrezatRecicVogel(entity.getVarrezatRecicVogel());
        dto.setRKurtishi(entity.getRKurtishi());
        dto.setArabati(entity.getArabati());
        dto.setVarrezatQytetit(entity.getVarrezatQytetit());

        return dto;
    }
}
