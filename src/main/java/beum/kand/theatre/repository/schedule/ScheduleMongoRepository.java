package beum.kand.theatre.repository.schedule;

import beum.kand.theatre.model.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ScheduleMongoRepository extends MongoRepository<Schedule, String> {
    List<Schedule> findAllByCreatedAtAfterAndDescription(LocalDateTime date, String description);
}
