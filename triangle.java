public class Triangle 
{
    public double height;
    public double base;

  
    public void Height(double hgt)
    {
        height = hgt;
    }

    public void Base(double bs)
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
