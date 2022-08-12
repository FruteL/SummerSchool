//package beum.kand.theatre.repository.actor;
//
//import beum.kand.theatre.model.Actor;
//import org.springframework.data.mongodb.repository.MongoRepository;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//public interface ActorMongoRepository extends MongoRepository<Actor, String> {
//    List<Actor> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
//}
