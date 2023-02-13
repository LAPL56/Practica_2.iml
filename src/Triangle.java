public class Triangle
{
    //Variables
    public
    float base_1, base_2, base_3, height;
    //Constructor
    public Triangle(float base_1, float base_2, float base_3, float height)
    {
        this.base_1 = base_1;
        this.base_2 = base_2;
        this.base_3 = base_3;
        this.height = height;
    }
    //Método que devuelve el perímetro del triángulo
    public void Perimeter_int()
    {
        float tri_per = base_1+base_2+base_3;
        System.out.println("Triangle Perimeter: "+tri_per+" cm");

    }
    //Método que devuelve el área del triángulo
    public void Area()
    {
        double height = 0, tri_are = 0;

        tri_are=(base_1*height)/2;

        System.out.println("Triangle Area: "+tri_are+" cm^2");

    }

    //Método estático con parámetros de tipo enteros
    // que devuelve el perímetro del triángulo
    public static int Perimeter_int(int base_1, int base_2, int base_3)
    {
        int result = (base_1+base_2+base_3);
        System.out.println("Triangle Perimeter (int): "+result+" cm");
        return result;
    }
    //Método estático con parámetros de tipo enteros
    // que devuelve el área del triángulo
    public static int Area_int(int base_1,int height)
    {
        int tri_are_int;

        tri_are_int=(base_1*height)/2;
        
        System.out.println("Triangle Area (int): "+tri_are_int+" cm^2");
        return tri_are_int;
    }
    //Método estático con parámetros de tipo flotantes
    // que devuelve el perímetro del triángulo
    public static float Perimeter_flo(float base_1, float base_2, float base_3)
    {
        float result = base_1+base_2+base_3;
        System.out.println("Triangle Perimeter (float): "+result+" cm");
        return result;
    }
    //Método estático con parámetros de tipo flotantes
    // que devuelve el área del triángulo
    public static float Area_flo(float base_1,float height)
    {
        float tri_are_flo;

        tri_are_flo=(base_1*height)/2;
        System.out.println("Triangle Area (float): "+tri_are_flo+" cm^2");
        return tri_are_flo;
    }
}
