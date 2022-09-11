package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void when10to20then1() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double expected = 1.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void when10to23then3Dot16() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 3);
        double expected = 3.16;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void when17to23then4Dot12() {
        Point a = new Point(1, 7);
        Point b = new Point(2, 3);
        double expected = 4.12;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void when211to589then11Dot04() {
        Point c = new Point(2, 1, 1);
        Point d = new Point(5, 8, 9);
        double expected = 11.04;
        double out = c.distance3d(d);
        Assert.assertEquals(expected, out, 0.01);
    }
}