package beum.kand.theatre.service.schedule.interfaces;

import beum.kand.theatre.model.Role;
import beum.kand.theatre.model.Schedule;

import java.util.List;

public interface IScheduleService {
    Schedule create (Schedule schedule);
    Schedule update(Schedule schedule);
    Schedule get(String id);
    void delete(String id);
    List<Schedule> getAll();
}
