package beum.kand.theatre.service.item.interfaces;

import beum.kand.theatre.model.Actor;

import java.util.List;

public interface IActorService {
    Actor create (Actor actor);
    Actor update(Actor actor);
    Actor get(String id);
    void delete(String id);
    List<Actor> getAll();
}
