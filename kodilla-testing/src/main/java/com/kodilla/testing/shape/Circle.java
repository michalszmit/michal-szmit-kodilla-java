package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
    return "Circle";
    }

    @Override
    public double getField() {
        double field = 3.14*radius*radius;
        return field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", field=" + getField() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
