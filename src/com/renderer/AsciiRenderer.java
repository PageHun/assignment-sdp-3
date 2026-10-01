package com.renderer;

public class AsciiRenderer implements Renderer {

    @Override
    public String renderCircle(int id, double radius) {
        return String.format("ASCII circle id=%s radius=%s", id, radius);
    }

    @Override
    public String renderSquare(int id, double side) {
        return String.format("ASCII square id=%s side=%s", id, side);
    }
}