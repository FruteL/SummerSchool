//package beum.kand.theatre.repository.performance;
//
//import beum.kand.theatre.model.Performance;
//import org.springframework.data.mongodb.repository.MongoRepository;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//public interface PerformanceMongoRepository extends MongoRepository<Performance, String> {
//    List<Performance> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
//}
