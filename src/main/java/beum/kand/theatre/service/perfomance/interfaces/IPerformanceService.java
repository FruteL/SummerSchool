package beum.kand.theatre.service.perfomance.interfaces;

import beum.kand.theatre.model.Actor;
import beum.kand.theatre.model.Performance;

import java.util.List;

public interface IPerformanceService {
    Performance create (Performance performance);
    Performance update(Performance performance);
    Performance get(String id);
    void delete(String id);
    List<Performance> getAll();
}
