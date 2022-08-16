package beum.kand.theatre.repository.schedule;

import beum.kand.theatre.model.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleMongoRepository extends MongoRepository<Schedule, String> {
    List<Schedule> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
