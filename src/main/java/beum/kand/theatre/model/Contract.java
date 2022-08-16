package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Contract  {

    private String id;
    private Actor actor;
    private Role role;
    private int YearPayment;
    private double bonus;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public Contract() {
    }

    public Contract(String id, Actor actor, Role role, int yearPayment, double bonus, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.actor = actor;
        this.role = role;
        YearPayment = yearPayment;
        this.bonus = bonus;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Contract(String id, Actor actor, Role role, int yearPayment, double bonus) {
        this.id = id;
        this.actor = actor;
        this.role = role;
        YearPayment = yearPayment;
        this.bonus = bonus;
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
