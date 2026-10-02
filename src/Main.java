import com.renderer.*;
import com.shape.*;

public class Main{
    public static void main(String[] args){
        int count = 0;
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();
        Renderer ascii = new AsciiRenderer();
        System.out.println("======================= Required demonstration checks =======================");
        // T1
        Shape circle1 = new Circle(1, 2, vector);
        String result1 = circle1.execute();
        String expected1 = "VECTOR circle id=1 radius=2.0";
        boolean passT1 = result1.equals(expected1);
        if (passT1) count++;
        check("T1", passT1, "Circle + VectorRenderer", result1, expected1);
        // T2
        Shape circle2 = new Circle(2, 2, raster);
        String result2 = circle2.execute();
        String expected2 = "RASTER circle id=2 radius=2.0";
        boolean passT2 = result2.equals(expected2);
        if (passT2) count++;
        check("T2", passT2, "Circle + RasterRenderer", result2, expected2);
        // T3
        Shape square3 = new Square(3, 3, vector);
        String result3 = square3.execute();
        String expected3 = "VECTOR square id=3 side=3.0";
        boolean passT3 = result3.equals(expected3);
        if (passT3) count++;
        check("T3", passT3, "Square + VectorRenderer", result3, expected3);
        // T4
        Shape square4 = new Square(4, 3, raster);
        String result4 = square4.execute();
        String expected4 = "RASTER square id=4 side=3.0";
        boolean passT4 = result4.equals(expected4);
        if (passT4) count++;
        check("T4", passT4, "Square + RasterRenderer", result4, expected4);
        // T5
        Circle circle5 = new Circle(5, 2, vector);
        Shape beforeObject = circle5;
        int beforeId = circle5.getId();
        double beforeRadius = circle5.getRadius();
        String beforeResult5 = circle5.execute();

        circle5.setImplementation(raster);

        Shape afterObject = circle5;
        int afterId = circle5.getId();
        double afterRadius = circle5.getRadius();
        String afterResult5 = circle5.execute();
        String beforeExpected5 = "VECTOR circle id=5 radius=2.0";
        String afterExpected5 = "RASTER circle id=5 radius=2.0";
        boolean sameObject = (beforeObject == afterObject);
        boolean stateUnchanged = (beforeRadius == afterRadius && beforeId == afterId);
        boolean passT5 = sameObject && stateUnchanged && (afterResult5.equals(afterExpected5) && beforeResult5.equals(beforeExpected5));
        if (passT5) count++;
        System.out.printf("T5 | %s | sameObject=%b         | stateUnchanged=%b | before=<%s> | after=<%s>%n", passT5 ? "PASS:)" : "FAIL:(", sameObject, stateUnchanged, beforeResult5, afterResult5);
        // T6
        Shape circle6 = new Circle(6, 2, ascii);
        String result6 = circle6.execute();
        String expected6 = "ASCII circle id=6 radius=2.0";
        boolean passT6 = result6.equals(expected6);
        if (passT6) count++;
        check("T6", passT6, "Circle + AsciiRenderer ", result6, expected6);
        // T7
        Shape square7 = new Square(7, 3, ascii);
        String result7 = square7.execute();
        String expected7 = "ASCII square id=7 side=3.0";
        boolean passT7 = result7.equals(expected7);
        if (passT7) count++;
        check("T7", passT7, "Square + AsciiRenderer ", result7, expected7);
        System.out.println("=============================================================================");
        System.out.printf("SUMMARY: %s/7 PASS%n", count);
    }

    public static void check(String check, boolean pass, String object, String result, String expected){
        if (pass){
            System.out.printf("%s | PASS:) | %s | result=%s%n", check, object, result);
        } else{
            System.out.printf("%s | FAIL:( | %s | expected=%s%n", check, object, expected);
        }
    }
}