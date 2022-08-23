package beum.kand.theatre.controller.api;

import beum.kand.theatre.model.Performance;
import beum.kand.theatre.model.Role;
import beum.kand.theatre.service.perfomance.impls.PerformanceServiceImpl;
import beum.kand.theatre.service.role.impls.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/roles/")
@RestController
public class RoleRestController {
    @Autowired
    RoleServiceImpl service;

    @GetMapping("")
    public List<Role> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Role showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Role insertOne(@RequestBody Role role){
        return service.create(role);
    }
    @PutMapping()
    public Role updateOne(@RequestBody Role role){
        return service.update(role);
    }
}
