package com.main;

import com.renderer.*;
import com.shape.*;

public class Main{
    public static void main(String[] args){
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();
        Shape circle = new Circle(5, 5, 10, vector);
        Shape square = new Square(5, 8, 10, 4, raster);
        circle.draw();
        square.draw();
    }
}