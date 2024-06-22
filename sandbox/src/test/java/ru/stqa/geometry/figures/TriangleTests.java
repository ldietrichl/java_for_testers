package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea(){
        var s = new Triangle(5.,12.,13.);
        double result = s.area();
        Assertions.assertEquals(30, result);
    }

    @Test
    void canCalculatePerimeter(){
        Assertions.assertEquals(30, new Triangle(5.,12.,13.).perimeter());
    }

}
