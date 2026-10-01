package com.renderer;

public class AsciiRenderer implements Renderer {

    @Override
    public String renderCircle(int id, double radius) {
        return String.format("Drawing %s(id) circle as ascii with radius %s", id, radius);
    }

    @Override
    public String renderSquare(int id, double side) {
        return String.format("Drawing %s(id) square as ascii with side %s", id, side);
    }
}