package com.renderer;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double x, double y, double radius) {
        System.out.printf("Drawing circle as vector at %s, %s with radius %s\n", x, y, radius);
    }

    @Override
    public void renderSquare(double x1, double y1, double x2, double y2) {
        System.out.printf("Drawing square as vector at 2 points: {%s; %s;}, {%s; %s;}\n", x1, y1, x2, y2);
    }
}