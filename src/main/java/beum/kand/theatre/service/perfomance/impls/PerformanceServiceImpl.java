package beum.kand.theatre.service.perfomance.impls;

import beum.kand.theatre.model.Performance;
import beum.kand.theatre.repository.performance.PerformanceMongoRepository;
import beum.kand.theatre.service.perfomance.interfaces.IPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PerformanceServiceImpl implements IPerformanceService {

    @Autowired
    PerformanceMongoRepository repository;

//    private LocalDateTime now = LocalDateTime.now();
//        private List<Performance> performance = new ArrayList<>(
//            Arrays.asList(
//                    new Performance("1", "red Riding Hood", 1697, 14000, "little girl who brings grandma pies", now, now),
//                    new Performance("2", "Three Pig", 1843, 10000, "3 pig build own houses", now, now),
//                    new Performance("3", "Masha and Three Bear", 1875, 12000, "little girl lost in forest", now, now)
//                    ));
//
//    @PostConstruct
//    void init(){
//        repository.saveAll(performance);
//    }

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
