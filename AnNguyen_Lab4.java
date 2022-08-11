import java.util.Scanner;

enum Type {
    Equilateral, Isosceles, Scalene, NotTriangle
}

class AnNguyen_Lab4 {
    public static void main(String[] args) {
        PossibleTriangle pt1 = new PossibleTriangle(4, 5, 6);
        pt1.displayInfo();

        
        PossibleTriangle pt2 = new PossibleTriangle(1,2,3);
        pt2.displayInfo();
         
        PossibleTriangle pt3 = new PossibleTriangle(4,5,5);
        pt3.displayInfo();
         
        PossibleTriangle pt4 = new PossibleTriangle(6,6,6);
        pt4.displayInfo();
        
    }
}

class PossibleTriangle {
    private int a;
    private int b;
    private int c;
    Type pt;

    // Default constructor
    public PossibleTriangle() {

    }

    // Other constructor
    public PossibleTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isTriangle() {
        if (a + b > c || c + b > a || a + c > b)
            return true;
        else
            return false;
    }

    private Type getType() {
        if (a > 0 && b > 0 && c > 0) {
            if (a == b || b == c || a == c)
                pt = Type.Isosceles;
            else if (a == b && b == c && a == c)
                pt = Type.Equilateral;
            else if (a != b && b != c && a != c)
                pt = Type.Scalene;
            else
                pt = Type.NotTriangle;
        }

        

        return pt;
    }

    public void displayInfo() 
    {
        System.out.printf("\na = %d, b = %d, c = %d%n", a,b,c);
        System.out.printf("%s%n", getType());
        /*if (isTriangle() == true) 
        {
            //System.out.printf("Type: %s", getType());

            switch (getType()) {
                case Isosceles:
                    System.out.println("Isosceles triangle");
                case Equilateral:
                    System.out.println("Equilateral triangle");
                case Scalene:
                    System.out.println("Scalene triangle");
                default:
                    System.out.println("A triangle");
                    break;
            }
        } 

        else
        {
            System.out.println("Not a triangle");
        }*/

        System.out.printf("-----------------------------------------");
            
    }
}