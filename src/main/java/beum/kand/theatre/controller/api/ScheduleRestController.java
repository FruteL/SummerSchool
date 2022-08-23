package beum.kand.theatre.controller.api;

import beum.kand.theatre.model.Role;
import beum.kand.theatre.model.Schedule;
import beum.kand.theatre.service.role.impls.RoleServiceImpl;
import beum.kand.theatre.service.schedule.impls.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/schedule/")
@RestController
public class ScheduleRestController {
    @Autowired
    ScheduleServiceImpl service;

    @GetMapping("")
    public List<Schedule> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Schedule showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Schedule insertOne(@RequestBody Schedule schedule){
        return service.create(schedule);
    }
    @PutMapping()
    public Schedule updateOne(@RequestBody Schedule schedule){
        return service.update(schedule);
    }
}
