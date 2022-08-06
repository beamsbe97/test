import java.util.Scanner;

enum Type {Equilateral, Isosceles, Scalene, NotTriangle}

class AnNguyen_Lab4
{
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        
    }
}

class PossibleTriangle
{
    private int a;
    private int b;
    private int c;
    Type pt;

    //Default constructor
    public PossibleTriangle(){
        
    }

    //Other constructor
    public PossibleTriangle(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isTriangle()
    {
        if (a == 0 || b==0 || c==0)
            return true;
        else
            return false;
    }
    
    private Type getType()
    {
        while (a > 0 && b > 0 && c > 0)
        {
            if (a == b || b==c || a==c)
                pt = Type.Isosceles;
            else if (a == b && b == c && a==c)
                pt = Type.Equilateral;    
        }

        return pt;
    }
    
    public void displayInfo()
    {
        if (isTriangle())
            switch(pt)
            {
                case Isosceles: System.out.println("Isosceles triangle");
                case Equilateral: System.out.println("Equilateral triangle");
                case Scalene: System.out.println("Scalene");
            }
        
        else
            System.out.println("Not a triangle");
    }
}