package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Performance {

    private String id;
    private String name;
    private LocalDateTime date; //year
    private List<Role> roles;
    private int budget;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public Performance() {
    }

    public Performance(String id, String name, LocalDateTime date, List<Role> roles, int budget) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.roles = roles;
        this.budget = budget;
    }

    public Performance(String id, String name, LocalDateTime date, List<Role> roles, int budget, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.roles = roles;
        this.budget = budget;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }


    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
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
