package beum.kand.theatre.repository.performance;

import beum.kand.theatre.model.Performance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PerformanceMongoRepository extends MongoRepository<Performance, String> {
    List<Performance> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
