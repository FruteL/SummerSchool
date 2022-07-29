package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Performance {

    private String id;
    private String name;
    private LocalDateTime date;
    private int budget;

    public Performance() {
    }

    public Performance(String id, String name, LocalDateTime date, int budget) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.budget = budget;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Performance)) return false;
        Performance that = (Performance) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
