package ru.stqa.geometry.figures;

import java.util.Objects;

public record Triangle(double a, double b, double c) {

    public Triangle{
        if(a<0||b<0||c<0){
            throw  new IllegalArgumentException("Square side should be non-negative");
        }
        if(a+b<c||a+c<b||b+c<a){
            throw  new IllegalArgumentException("Square side should be equal or less then summ of two other sides");
        }
    }


    public static void printTriangleArea(Triangle abc){
        String text = String.format("Площадь треугольника со сторонами %f, %f, %f  = %f", abc.a, abc.b, abc.c, abc.area());
        System.out.println(text);
    }

    public static void printTrianglePerimeter(Triangle abc){
        String text = String.format("Периметр треугольника со сторонами %f, %f, %f  = %f", abc.a, abc.b, abc.c, abc.perimeter());
        System.out.println(text);
    }



    public double area() {
         return  Math.sqrt(perimeter()/2
                         *(perimeter()/2 - this.a)
                         *(perimeter()/2 -this.b)
                         *(perimeter()/2 -this.c)
                        );
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
        ||(Double.compare(this.b, triangle.a) == 0 && Double.compare(this.a, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
        ||(Double.compare(this.c, triangle.a) == 0 && Double.compare(this.a, triangle.b) == 0 && Double.compare(this.b, triangle.c) == 0)
        ||(Double.compare(this.a, triangle.a) == 0 && Double.compare(this.c, triangle.b) == 0 && Double.compare(this.b, triangle.c) == 0)
        ||(Double.compare(this.b, triangle.a) == 0 && Double.compare(this.c, triangle.b) == 0 && Double.compare(this.a, triangle.c) == 0)
        ||(Double.compare(this.c, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.a, triangle.c) == 0)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
