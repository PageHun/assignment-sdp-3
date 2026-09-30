package com.shape;

import com.renderer.Renderer;

public class Square extends Shape {
    private double x1, y1, x2, y2;
    public Square(double x1, double y1, double x2, double y2, Renderer renderer){
        super(renderer);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public void draw() {
        renderer.renderSquare(x1, y1, x2, y2);
    }
}