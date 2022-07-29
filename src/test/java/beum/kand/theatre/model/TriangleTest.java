package beum.kand.theatre.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TriangleTest {

    @Test
    void testA3B4C5thenPerimeter12() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(triangle.getPerimeter(), 3+4+5, 1);
    }

    @Test
    public void testABC3thenHeight() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assert.assertEquals(triangle.getHeight(), 2.598,0.01);
    }

    @Test
    public void testABC3thenArea() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assert.assertEquals(triangle.getArea(), 3.897,0.01);
    }

    @Test
    public void testABC3thenInscribedRadius() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assert.assertEquals(triangle.inscribedRadius(), 0.87,0.01);
    }

    @Test
    public void testABC3thenCorner() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assert.assertEquals(triangle.getCornerRadian(), 60,0.01);
    }
}