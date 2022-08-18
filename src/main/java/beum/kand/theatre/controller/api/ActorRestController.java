package beum.kand.theatre.controller.api;

import beum.kand.theatre.model.Actor;
import beum.kand.theatre.model.Item;
import beum.kand.theatre.service.actor.impls.ActorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/actors/")
@RestController
public class ActorRestController {

    @Autowired
    ActorServiceImpl service;

    @GetMapping("")
    public List<Actor> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Actor showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Actor insertOne(@RequestBody Actor actor){
        return service.create(actor);
    }
    @PutMapping()
    public Actor updateOne(@RequestBody Actor actor){
        return service.update(actor);
    }
}
