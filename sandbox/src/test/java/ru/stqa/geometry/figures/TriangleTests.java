package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        var s = new Triangle(5., 12., 13.);
        double result = s.area();
        Assertions.assertEquals(30, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(30, new Triangle(5., 12., 13.).perimeter());
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-5.0, -3.0, -2.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }

    @Test
    void cannotCreateIlligalTriangleA(){
        try {
            new Triangle(30.0,1.0, 1.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            //OK
        }
    }

    @Test
    void cannotCreateIlligalTriangleB(){
        try {
            new Triangle(1.0,30.0, 1.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            //OK
        }
    }

    @Test
    void cannotCreateIlligalTriangleC(){
        try {
            new Triangle(1.0,1.0, 30.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            //OK
        }
    }


    @Test
    void testEquality(){
        var t1 = new Triangle(1.0,1.0, 1.0);
        var t2 = new Triangle(1.0,1.0, 1.0);

        Assertions.assertEquals(t1,t2);

    }

    @Test
    void testEquality2(){
        var t1 = new Triangle(3.0,4.0, 5.0);
        var t2 = new Triangle(4.0,5.0, 3.0);

        Assertions.assertEquals(t1,t2);

    }

}
