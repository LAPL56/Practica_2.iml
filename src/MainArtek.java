public class MainArtek {
    public static void main(String[] args)
    {
    //Clase Cuadrado
        //Métodos no estáticos
        Square square = new Square(2.5f,7.13f);
        square.Perimeter();
        square.Area();
        //Métodos estáticos
        int per_int_squ = Square.Perimeter(4,4);
        int are_int_squ = Square.Area(7,10);
        float per_flo_squ = Square.Perimeter(2.5f,7.13f);
        float are_flo_squ = Square.Area(7.8f,9.1f);

    //Clase Círculo
        //Métodos no estáticos
        Circle circle = new Circle(3f);
        circle.Perimeter();
        circle.Area();
        //Métodos estáticos
        float per_cir = Circle.Perimeter(3f);
        float are_cir = Circle.Area(3f);

    //Clase Triángulo
        //Métodos no estáticos
        Triangle triangle = new Triangle(2.5f,3.5f,1.5f,5.1f);
        triangle.Area();
        triangle.Perimeter_int();
        //Métodas estáticos
        int per_int_tri = Triangle.Perimeter_int(1,2,3);
        int are_int_tri = Triangle.Area_int(1,2);
        float per_flo_tri = Triangle.Perimeter_flo(1.5f,2.3f,3.2f);
        float are_flo_tri = Triangle.Area_flo(1.5f,2.3f);

    //Clase Cubo
        //Constructor (Cube - height, base, width)
        Cube cube = new Cube(3f,2f,3.1f);
        //Métodos de instancia
        cube.Perimeter();
        cube.Area();
        cube.Volume();
        //Constructor (Cube - square y width)
        Cube cube_sqr = new Cube(3f,2f);
        //Métodos de instancia
        cube_sqr.Perimeter_sqr();
        cube_sqr.Area_sqr();
        cube_sqr.Volume_sqr();
    }
}