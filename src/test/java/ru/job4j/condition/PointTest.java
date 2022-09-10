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
        a.distance(b);
        double expected = 2.0;
        double out = 2.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void when10to20then1() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        a.distance(b);
        double expected = 1.0;
        double out = 1.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void when10to23then3Dot16() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 3);
        a.distance(b);
        double expected = 3.16;
        double out = 3.16;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void when17to23then4Dot12() {
        Point a = new Point(1, 7);
        Point b = new Point(2, 3);
        a.distance(b);
        double expected = 4.12;
        double out = 4.12;
        Assert.assertEquals(expected, out, 0.01);
    }
}