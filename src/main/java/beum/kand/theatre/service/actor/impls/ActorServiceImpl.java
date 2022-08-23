package beum.kand.theatre.service.actor.impls;

import beum.kand.theatre.model.Actor;
import beum.kand.theatre.model.Item;
import beum.kand.theatre.repository.actor.ActorMongoRepository;
import beum.kand.theatre.service.actor.interfaces.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ActorServiceImpl implements IActorService {
    @Autowired
    ActorMongoRepository repository;

    private LocalDateTime now = LocalDateTime.now();
//    private List<Actor> actors = new ArrayList<>(
//            Arrays.asList(
//                    new Actor("1", "Pavlo","Kandieiv","Alexandrovich", "People's Artist of Ukraine", 12, "Описание", now, now),
//                    new Actor("2", "Petro","Petrov","Sergiyovich", "People's Artist of Ukraine", 9, "Описание", now, now),
//                    new Actor("3", "Ivan","Ivanov","Ivanovich", "Artist of Ukraine", 4, "Описание", now, now),
//                    new Actor("4", "Dmitry","Dmitrov","Dmitrovich", "newbi", 1, "Описание", now, now)
//                    ));
//
//    @PostConstruct
//    void init(){
//        repository.saveAll(actors);
//    }
    @Override
    public Actor create(Actor actor) {
        actor.setCreatedAt(LocalDateTime.now());
        return repository.save(actor);
    }

    @Override
    public Actor update(Actor actor) {
        actor.setUpdatedAt(LocalDateTime.now());
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
