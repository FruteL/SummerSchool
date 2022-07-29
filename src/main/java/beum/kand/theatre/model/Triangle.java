package beum.kand.theatre.model;

import java.util.*;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    public double getHeight(){
        double p = (double)getPerimeter()/2;
        double h = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC)) * 2 / sideA;
        return h;
    }

    public double getArea(){
        return getHeight() * sideA / 2;
    }

    public double inscribedRadius(){
        double p = (double) getPerimeter()/2;
        double r = Math.sqrt((p-sideA) * (p-sideB) * (p-sideC)/p);
        return r;
    }

    public double getCornerRadian(){
        double cos = (Math.pow(sideB,2)+Math.pow(sideC,2)-Math.pow(sideA,2))/(2 * sideC * sideB);
        return Math.acos(cos)*180/Math.PI;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getSideA() == triangle.getSideA() &&
                getSideB() == triangle.getSideB() &&
                getSideC() == triangle.getSideC();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB(), getSideC());
    }
}
