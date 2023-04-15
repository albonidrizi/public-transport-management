package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.LineDto;
import tp.publicTransport.mapper.LineMapperImpl;
import tp.publicTransport.model.Line;
import tp.publicTransport.repository.LineRepository;
import tp.publicTransport.service.ServiceInterface.LineServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LineServiceImpl implements LineServiceInterface {
    @Autowired
    private LineRepository repo;
    @Autowired
    private LineMapperImpl mapper;


//    private static final String PROFESIONinPROFESION = "profession";
//    private static final String PROFESIONIDinEMPLOYE = "professionId.id";
//
//    private static final String PROFESION = "professionId.profession";



    @Override
    public List<LineDto> getAllLine() {
        return repo.findAll()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());    }

    @Override
    public LineDto getLineById(Integer id) {
        return repo.findById(id)
                .map(mapper::toDto)
                .orElse(null);    }

    @Override
    public LineDto saveLine(LineDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public LineDto updateLine1(LineDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public LineDto updateLine2(LineDto body) {
        return mapper.toDto(repo.save(mapper.toEntity(body)));
    }

    @Override
    public LineDto deleteLineById(Integer id) {
        LineDto deleted = getLineById(id);
        repo.deleteById(id);
        return deleted;     }

    @Override
    public Page<LineDto> filter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending,
                                String lineName, String destination, Integer codeID) {

//    1    if (sort != null && sort.equals(PROFESIONinPROFESION))
//            sort = PROFESIONIDinEMPLOYE + PROFESIONinPROFESION;
//    2    if (PROFESIONinPROFESION.equals(sort))
//            sort = PROFESIONinPROFESION;
//    3    if (PROFESIONinPROFESION.equals(sort))
//            sort = PROFESIONIDinEMPLOYE + PROFESIONinPROFESION;

        Sort sortingOption = isAscending
                ? Sort.by(sort).ascending()
                : Sort.by(sort).descending();


        Pageable pageable = PageRequest.of(pageNumber, pageSize, sortingOption);

        List<Line> lines = repo.searchLineBus(lineName, destination, codeID, pageable);

        List<LineDto> list = new ArrayList<>();
        Integer count = repo.counLineBus(lineName, destination, codeID);

        for (Line u : lines)
            list.add(mapper.toDto(u));

        return new PageImpl<>(list, pageable, count);
    }


    public List<LineDto> getlineByName(String listName) {
        return repo.getlineByName(listName).stream().map(mapper::toDto).collect(Collectors.toList());
    }



}
