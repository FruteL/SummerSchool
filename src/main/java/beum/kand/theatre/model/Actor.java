package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Actor {
    private String id;
    private String firstName;
    private String secondName;
    private String surname;
    private String rank;
    private int expYear;
    private String discription;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Actor() {
    }

    public Actor(String firstName, String secondName, String surname, String rank, int expYear, String discription) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.rank = rank;
        this.expYear = expYear;
        this.discription = discription;
    }

    public Actor(String id, String firstName, String secondName, String surname, String rank, int expYear, String discription, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.rank = rank;
        this.expYear = expYear;
        this.discription = discription;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return id.equals(actor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
