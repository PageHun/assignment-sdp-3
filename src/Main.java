import com.renderer.*;
import com.shape.*;

public class Main{
    public static void main(String[] args){
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();
        Renderer ascii = new AsciiRenderer();
        Shape shape1 = new Circle(1, 5, vector);
        Shape shape2 = new Square(2, 5, raster);
        Shape shape3 = new Square(3, 4, ascii);
        shape2 = new Circle(2, 10, raster);
        System.out.println(shape1.execute());
        System.out.println(shape2.execute());
        System.out.println(shape3.execute());
    }
}