package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.List;

public class Schedule {
    private String id;
    private Performance performance;
    private List<Actor> actors;
    private LocalDateTime date;
    private double price;
    private int holdPlaces;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;


}
