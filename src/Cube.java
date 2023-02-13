public class Cube
{
    public
    float height, base, width, square;
    //Constructor usando los parámetros: height, base y width.
    public Cube(float height, float base, float width)
    {
        this.height=height;
        this.base=base;
        this.width=width;
    }
    //Constructor usando los parámetros: square y width.
    public Cube(float square, float width)
    {
        this.square = square;
        this.width = width;
    }
    //Método que devuelve el perimetro
    public void Perimeter()
    {
        float perimeter;
        perimeter = (height*4)+(base*4)+(width*4);
        System.out.println("\nCube Perimeter: "+perimeter+" cm");
    }
    //Método que devuelve el área
    public void Area()
    {
        float area;
        area = (base*height)*6;
        System.out.println("Cube Area: "+area+" cm^2");
    }
    //Método que devuelve el volumen
    public void Volume()
    {
        float volume;
        volume = (base*height*width);
        System.out.println("Cube Volume: "+volume+" cm^3");
    }
    //Método que devuelve el perimetro, usando la variable 'square'
    public void Perimeter_sqr()
    {
        float perimeter;
        perimeter = width*12;
        System.out.println("Cube Perimeter: "+perimeter+" cm");
    }
    //Método que devuelve el área, usando la variable 'square'
    public void Area_sqr()
    {
        float area;
        area = square*6;
        System.out.println("Cube Area: "+area+" cm^2");
    }
    //Método que devuelve el volumen, usando la variable 'square'
    public void Volume_sqr()
    {
        float volume;
        volume = square*width;
        System.out.println("Cube Volume: "+volume+" cm^3");
    }

}