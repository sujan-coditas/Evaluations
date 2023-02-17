package Evaluation3;

import java.awt.geom.Area;

class AreaOfShapes{
    public void rectangle( double length, double width){
        Double Area= length * width;
        Double Perimeter= 2*(length+width);
        System.out.println("Area of Rectangle is : "+ Area);
        System.out.println("Perimeter of Rectangle is :" + Perimeter);

    }
}
public class CalculateArea {
    public static void main(String[] args) {
    AreaOfShapes areaOfShapes=new AreaOfShapes();
    areaOfShapes.rectangle(5,10);
    }
}

/* =============OUTPUT===========
* Area of Rectangle is : 50.0
Perimeter of Rectangle is :30.0
* */
