package beum.kand.theatre.service.schedule.impls;

import beum.kand.theatre.model.Actor;
import beum.kand.theatre.model.Performance;
import beum.kand.theatre.model.Schedule;
import beum.kand.theatre.repository.actor.ActorMongoRepository;
import beum.kand.theatre.repository.schedule.ScheduleMongoRepository;
import beum.kand.theatre.service.actor.impls.ActorServiceImpl;
import beum.kand.theatre.service.schedule.interfaces.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ScheduleServiceImpl implements IScheduleService {
    @Autowired
    ScheduleMongoRepository repository;

    private LocalDateTime now = LocalDateTime.now();
    Performance red =   new Performance("1", "red Riding Hood", 1697, 14000, "little girl who brings grandma pies", now, now);
    Performance pig = new Performance("2", "Three Pig", 1843, 10000, "3 pig build own houses", now, now);
    Performance masha = new Performance("3", "Masha and Three Bear", 1875, 12000, "little girl lost in forest", now, now);
    private List<Actor> actors = new ArrayList<>(
            Arrays.asList(
                    new Actor("1", "Pavlo","Kandieiv","Alexandrovich", "People's Artist of Ukraine", 12, "Описание", now, now),
                    new Actor("2", "Petro","Petrov","Sergiyovich", "People's Artist of Ukraine", 9, "Описание", now, now),
                    new Actor("3", "Ivan","Ivanov","Ivanovich", "Artist of Ukraine", 4, "Описание", now, now),
                    new Actor("4", "Dmitry","Dmitrov","Dmitrovich", "newbi", 1, "Описание", now, now)
            ));

    private List<Schedule> schedules = new ArrayList<>(
            Arrays.asList(
                    new Schedule("1", red, actors,LocalDateTime.of(2022, 9, 21, 19, 0), 10, 120, "half of seats are sold", now, now),
                    new Schedule("2", pig, null,LocalDateTime.of(2022, 8, 26, 19, 0), 12, 156, "", now, now),
                    new Schedule("3", masha, actors,LocalDateTime.of(2022, 8, 21, 19, 0), 8, 200, "", now, now)
                    ));

    @PostConstruct
    void init(){
        repository.saveAll(schedules);
    }


    @Override
    public Schedule create(Schedule schedule) {
        schedule.setCreatedAt(LocalDateTime.now());
        return repository.save(schedule);
    }

    @Override
    public Schedule update(Schedule schedule) {
        schedule.setUpdatedAt(LocalDateTime.now());
        return repository.save(schedule);
    }

    @Override
    public Schedule get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Schedule> getAll() {
        return repository.findAll();
    }
}
