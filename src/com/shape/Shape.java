package com.shape;

import com.renderer.*;

public abstract class Shape{
    protected Renderer renderer;
    protected Shape(Renderer renderer){
        this.renderer = renderer;
    }
    public abstract void draw();
}

//class Square extends Shape{
//    @Override
//    public void draw() {
//        System.out.println("Drawing square");
//    }
//}