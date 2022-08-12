//package beum.kand.theatre.repository.show;
//
//import beum.kand.theatre.model.Show;
//import org.springframework.data.mongodb.repository.MongoRepository;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//public interface ShowMongoRepository extends MongoRepository<Show, String> {
//    List<Show> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
//}
