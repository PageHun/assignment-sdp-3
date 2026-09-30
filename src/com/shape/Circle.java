package com.shape;

import com.renderer.Renderer;

public class Circle extends Shape {
    private double x, y, radius;
    public Circle(double x, double y, double radius, Renderer renderer){
        super(renderer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        renderer.renderCircle(x, y, radius);
    }
}