package beum.kand.theatre.service.actor.impls;

import beum.kand.theatre.model.Actor;
import beum.kand.theatre.repository.actor.ActorMongoRepository;
import beum.kand.theatre.service.actor.interfaces.IActorService;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class ActorServiceImpl implements IActorService {
    @Autowired
    ActorMongoRepository repository;
    @Override
    public Actor create(Actor actor) {
        actor.setCreateAt(LocalDateTime.now());
        return repository.save(actor);
    }

    @Override
    public Actor update(Actor actor) {
        actor.setUpdateAt(LocalDateTime.now());
        return repository.save(actor);
    }

    @Override
    public Actor get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Actor> getAll() {
        return repository.findAll();
    }
}
