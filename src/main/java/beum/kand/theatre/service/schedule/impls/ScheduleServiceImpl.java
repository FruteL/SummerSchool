package beum.kand.theatre.service.schedule.impls;

import beum.kand.theatre.model.Schedule;
import beum.kand.theatre.repository.schedule.ScheduleMongoRepository;
import beum.kand.theatre.service.schedule.interfaces.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ScheduleServiceImpl implements IScheduleService {
    @Autowired
    ScheduleMongoRepository repository;
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
