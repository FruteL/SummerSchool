package beum.kand.theatre.repository.actor;

import beum.kand.theatre.model.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ActorMongoRepository extends MongoRepository<Actor, String> {
    List<Actor> findAllByCreatedAtAfterAndFirstName(LocalDateTime date, String firstName);
}
