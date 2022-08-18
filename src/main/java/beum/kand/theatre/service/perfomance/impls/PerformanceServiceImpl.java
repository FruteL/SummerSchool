package beum.kand.theatre.service.perfomance.impls;

import beum.kand.theatre.model.Performance;
import beum.kand.theatre.repository.performance.PerformanceMongoRepository;
import beum.kand.theatre.service.perfomance.interfaces.IPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PerformanceServiceImpl implements IPerformanceService {

    @Autowired
    PerformanceMongoRepository repository;

    @Override
    public Performance create(Performance performance) {
        performance.setCreatedAt(LocalDateTime.now());
        return repository.save(performance);
    }

    @Override
    public Performance update(Performance performance) {
        performance.setUpdatedAt(LocalDateTime.now());
        return repository.save(performance);
    }

    @Override
    public Performance get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Performance> getAll() {
        return repository.findAll();
    }
}
