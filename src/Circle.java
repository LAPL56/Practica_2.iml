public class Circle
{
    public
    float radius;
    private
    static final float pi = 3.14159f;
    //Constructor
    public Circle(float radius)
    {
        this.radius = radius;
    }
    //Método que devuelve el perímetro del círculo
    public void Perimeter()
    {
        float result = pi*(2*radius);
        System.out.println("Circle Perimeter");
        System.out.println("    P: " + result + " cm");
    }
    //Método que devuelve el área del círculo
    public void Area()
    {
        float result = pi*(radius*radius);
        System.out.println("Circle Area");
        System.out.println("    A: " + result + " cm^2");
    }
    //Método estático con parámetros de tipo flotantes
    // que devuelve el perímetro del círculo
    public static float Perimeter(float radius)
    {
        float result = pi*(2*radius);
        System.out.println("Circle Perimeter");
        System.out.println("    P: " + result + " cm");
        return result;
    }
    //Método estático con parámetros de tipo flotantes
    // que devuelve el área del círculo
    public static float Area (float radius)
    {
        float result = pi*(radius*radius);
        System.out.println("Cricle Area");
        System.out.println("    A: " + result + " cm^2");
        return result;
    }

}
