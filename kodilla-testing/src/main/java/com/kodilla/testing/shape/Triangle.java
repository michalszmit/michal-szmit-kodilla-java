package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        double field = (height*base)/2;
        return field;
    }

    @Override
    public String toString() {
        return "Triangle {" + "height=" + height + ", side=" + base + ", field=" + getField() +'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.height, height) == 0 && Double.compare(triangle.base, base) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, base);
    }
}
