package com.shape;

import com.renderer.Renderer;

public class Square extends Shape {
    private final double side;
    public Square(int id, double side, Renderer renderer){
        super(id, renderer);
        this.side = side;
    }
    @Override
    public String execute() {
        return renderer.renderSquare(getId(), side);
    }
}