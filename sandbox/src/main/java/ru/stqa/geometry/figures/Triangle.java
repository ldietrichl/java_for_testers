package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {


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
}
