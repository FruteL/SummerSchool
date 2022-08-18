package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Performance {

    private String id;
    private String name;
    private LocalDateTime date; //year
    private List<Role> roles;
    private int budget;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Performance() {
    }

    public Performance(String id, String name, LocalDateTime date, List<Role> roles, int budget, String description) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.roles = roles;
        this.budget = budget;
        this.description = description;
    }

    public Performance(String id, String name, LocalDateTime date, List<Role> roles, int budget, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.roles = roles;
        this.budget = budget;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
