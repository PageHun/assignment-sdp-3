package com.renderer;

public class VectorRenderer implements Renderer {

    @Override
    public String renderCircle(int id, double radius) {
        return String.format("VECTOR circle id=%s radius=%s", id, radius);
    }

    @Override
    public String renderSquare(int id, double side) {
        return String.format("VECTOR square id=%s side=%s", id, side);
    }
}