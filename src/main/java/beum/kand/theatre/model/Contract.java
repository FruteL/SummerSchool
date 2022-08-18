package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Contract  {

    private String id;
    private Actor actor;
    private Role role;
    private int YearPayment;
    private double bonus;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Contract() {
    }

    public Contract(String id, Actor actor, Role role, int yearPayment, double bonus, String description) {
        this.id = id;
        this.actor = actor;
        this.role = role;
        YearPayment = yearPayment;
        this.bonus = bonus;
        this.description = description;
    }

    public Contract(String id, Actor actor, Role role, int yearPayment, double bonus, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.actor = actor;
        this.role = role;
        YearPayment = yearPayment;
        this.bonus = bonus;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public int getYearPayment() {
        return YearPayment;
    }

    public void setYearPayment(int yearPayment) {
        YearPayment = yearPayment;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
        if (!(o instanceof Contract)) return false;
        if (!super.equals(o)) return false;
        Contract contract = (Contract) o;
        return actor.equals(contract.actor) && role.equals(contract.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), actor, role);
    }
}
