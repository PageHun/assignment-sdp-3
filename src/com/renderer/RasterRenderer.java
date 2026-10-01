package com.renderer;

public class RasterRenderer implements Renderer {

    @Override
    public String renderCircle(int id, double radius) {
        return String.format("RASTER circle id=%s radius=%s", id, radius);
    }

    @Override
    public String renderSquare(int id, double side) {
        return String.format("RASTER square id=%s side=%s", id, side);
    }
}