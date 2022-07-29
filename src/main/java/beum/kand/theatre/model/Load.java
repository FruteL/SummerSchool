package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Load extends Performance {
    private Actor actor;
    private Performance performance;
    private String RoleName;
    private int YearPayment;
    private boolean isPlayed = false;

    public Load() {
    }

    public Load(Actor actor, Performance performance, String roleName, int yearPayment, boolean isPlayed) {
        this.actor = actor;
        this.performance = performance;
        RoleName = roleName;
        YearPayment = yearPayment;
        this.isPlayed = isPlayed;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public int getYearPayment() {
        return YearPayment;
    }

    public void setYearPayment(int yearPayment) {
        YearPayment = yearPayment;
    }

    public boolean isPlayed() {
        return isPlayed;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Load)) return false;
        Load load = (Load) o;
        return actor.equals(load.actor) && performance.equals(load.performance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, performance);
    }
}
