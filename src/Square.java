public class Square
{
    //Variables
    public
    float base,height;
    //Constructor
    public Square(float base, float height)
    {
        this.base=base;
        this.height=height;
    }
    //Método que devuelve el perímetro del cuadrado
    public void Perimeter()
    {
        float result = base+base+height+height;
        System.out.println("Square Perimeter: "+result+ " cm");
    }
    //Método que devuelve el área del cuadrado
    public void Area()
    {
        float result = base*height;
        System.out.println("Square Area: "+result+" cm^2");

    }
    //Método estático con parámetros de tipo enteros
    // que devuelve el perímetro del cuadrado
    public static int Perimeter(int base, int height)
    {
        int result = base+base+height+height;
        System.out.println("Square Perimeter (int): "+result+" cm");
        return result;
    }
    //Método estático con parámetros de tipo enteros
    // que devuelve el área del cuadrado
    public static int Area(int base, int height)
    {
        int result = base*height;
        System.out.println("Square Area (int): "+result+" cm^2");
        return result;
    }
    //Método estático con parámetros de tipo flotantes
    // que devuelve el perímetro del cuadrado
    public static float Perimeter(float base, float height)
    {
        float result = base+base+height+height;
        System.out.println("Square Perimeter (float): "+result+" cm");
        return result;
    }
    //Método estático con parámetros de tipo flotantes
    // que devuelve el área del cuadrado
    public static float Area(float base, float height)
    {
        float result = base*height;
        System.out.println("Square Area (float): "+result+" cm^2");
        return result;
    }

}
