package tp.publicTransport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.publicTransport.dto.BussDto;
import tp.publicTransport.mapper.BusMapperImpl;
import tp.publicTransport.repository.BusRepository;
import tp.publicTransport.service.ServiceInterface.BusServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BusServiceImpl implements BusServiceInterface {

    @Autowired
    public BusRepository busRepository;
    @Autowired
    public BusMapperImpl busMapper;

    @Override
    public List<BussDto> getAllBus() {
      return busRepository.findAll()
              .stream().map(busMapper::toDto)
              .collect(Collectors.toList());
    }

    @Override
    public BussDto getBussById(Integer id) {
        return busRepository.findById(id)
                .map(busMapper::toDto)
                .orElse(null);
    }

    @Override
    public BussDto saveBuss(BussDto body) {
        return busMapper.toDto(busRepository.save(busMapper.toEntity(body)));
    }

    @Override
    public BussDto updateBuss1(BussDto body) {
        return busMapper.toDto(busRepository.save(busMapper.toEntity(body)));
    }

    @Override
    public BussDto updateBuss2(BussDto body) {
        return busMapper.toDto(busRepository.save(busMapper.toEntity(body)));
    }

    @Override
    public BussDto deleteBussById(Integer id) {
        BussDto deleted = getBussById(id);
        busRepository.deleteById(id);
        return deleted;
    }
}
