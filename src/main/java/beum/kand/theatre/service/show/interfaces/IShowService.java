package beum.kand.theatre.service.show.interfaces;


import java.util.List;

public interface IShowService {
    Show create (Show show);
    Show update(Show show);
    Show get(String id);
    void delete(String id);
    List<Show> getAll();
}
