import java.util.Scanner;
public class TriangleDemo{
   public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Triangle tri = new Triangle();  
        System.out.println("What is the height?");          
        double height = sc.nextInt();
        System.out.println("What is the base?");          
        double base = sc.nextInt();
        tri.set(height,base);
        System.out.println("The pyramid's height is " + tri.Height());
        System.out.println("The pyramid's base is " + tri.Base());
        System.out.println("The pyramid's area is " + tri.Area());
    }
}

class Triangle1
{
    public double height;
    public double base;

    public void setHeight(double hgt)
    {
        height = hgt;
    }

    
    public void setBase(double bs)
    {
        base = bs;
    }


    public void set(double hgt, double bs)
    {
        height = hgt;
        base = bs;
    }

    
    public double Height()
    {
        return height;
    }

  
    public double Base()
    {
        return base;
    }

    
    public double Area()
    {
        return 0.5 * height * base;
    }
}
