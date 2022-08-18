package beum.kand.theatre.service.perfomance.impls;

import beum.kand.theatre.model.Performance;
import beum.kand.theatre.model.Role;
import beum.kand.theatre.repository.item.ItemMongoRepository;
import beum.kand.theatre.repository.performance.PerformanceMongoRepository;
import beum.kand.theatre.repository.role.RoleMongoRepository;
import beum.kand.theatre.service.perfomance.interfaces.IPerformanceService;
import beum.kand.theatre.service.role.interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class PerformanceServiceImpl implements IPerformanceService {

    @Autowired
    PerformanceMongoRepository repository;

    @Override
    public Performance create(Performance performance) {
        performance.setCreateAt(LocalDateTime.now());
        return repository.save(performance);
    }

    @Override
    public Performance update(Performance performance) {
        performance.setUpdateAt(LocalDateTime.now());
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
