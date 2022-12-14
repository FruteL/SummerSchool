package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Schedule {
    private String id;
    private Performance performance;
    private List<Actor> actors;
    private LocalDateTime date;
    private double price;
    private int holdPlaces;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Schedule() {
    }

    public Schedule(String id, Performance performance, List<Actor> actors, LocalDateTime date, double price, int holdPlaces, String description) {
        this.id = id;
        this.performance = performance;
        this.actors = actors;
        this.date = date;
        this.price = price;
        this.holdPlaces = holdPlaces;
        this.description = description;
    }

    public Schedule(String id, Performance performance, List<Actor> actors, LocalDateTime date, double price, int holdPlaces, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.performance = performance;
        this.actors = actors;
        this.date = date;
        this.price = price;
        this.holdPlaces = holdPlaces;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHoldPlaces() {
        return holdPlaces;
    }

    public void setHoldPlaces(int holdPlaces) {
        this.holdPlaces = holdPlaces;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id='" + id + '\'' +
                ", performance=" + performance +
                ", actors=" + actors +
                ", date=" + date +
                ", price=" + price +
                ", holdPlaces=" + holdPlaces +
                ", createdAt=" + createdAt +
                ", updateAt=" + updatedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schedule)) return false;
        Schedule schedule = (Schedule) o;
        return id.equals(schedule.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
