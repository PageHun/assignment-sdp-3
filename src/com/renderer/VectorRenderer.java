package com.renderer;

public class VectorRenderer implements Renderer {

    @Override
    public String renderCircle(int id, double radius) {
        return String.format("Drawing %s(id) circle as vector with radius %s", id, radius);
    }

    @Override
    public String renderSquare(int id, double side) {
        return String.format("Drawing %s(id) square as vector with side %s", id, side);
    }
}