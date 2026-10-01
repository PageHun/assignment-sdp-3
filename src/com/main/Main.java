package com.main;

import com.renderer.*;
import com.shape.*;

public class Main{
    public static void main(String[] args){
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();
        Shape circle = new Circle(1, 5, vector);
        Shape square = new Square(2, 5, raster);
        System.out.println(circle.execute());
        System.out.println(square.execute());
    }
}