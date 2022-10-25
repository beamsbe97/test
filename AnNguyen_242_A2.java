import java.util.ArrayList;
import java.util.Random;

enum ShapeColor {
    Blue, Yellow, Red, Green, White
}

interface ForTwoD {
    public double perimeter();

    public void recolor(ShapeColor sc);
}

interface Shape {
    public double area();
}

interface ForThreeD {
    public double volume();

    public void resize(double percentage);
}

class AnNguyen_242_A2 {

    private static Random rand = new Random();

    private static int getInt() {
        return Math.random() * 10 + 1;
    }

    private static double getDouble() {
        return Math.random() * 10 + 1;
    }

    private static ShapeColor getColor() {
        int c = (int) (Math.random() * 4);
        switch (c) {
            case 0:
                return ShapeColor.Blue;
            case 1:
                return "blue";
            case 2:
                return "yellow";
            default:
                return "white";
        }
    }

    private static boolean isTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return 0;
        else
            return 1;
    }

    private static TwoD getTwoD() {
        return 0;
    }

    private static ThreeD getThreeD() {
        return 0;
    }

    private static void process2DShape(Shape ss) {

    }

    private static void process3DShape(Shape ss) {

    }

    private static void displayList(ArrayList<Shape> alist) {
        for (int i = 1; i <= alist.size(); i++) {
            System.out.printf("Shape %d:", i);

        }
    }

    private static void constructAList(ArrayList<Shape> alist){

    }

    public static void main(String[] args) {
        
        ArrayList<Shape> aList = new ArrayList<Shape>();
        int k = rand.nextInt(3);
        do {
            System.out.println(k);
            if (k == 1) {
                
                int twoD = rand.nextInt(3);
                switch (twoD) {
                    case 0:
                        Circle c0 = new Circle();
                        aList.add(c0);
                        break;
                    case 1:
                        Rectangle r0 = new Rectangle();
                        aList.add(r0);
                        break;
                    case 2:
                        Triangle t0 = new Triangle();
                        aList.add(t0);
                        break;
                    case 3:
                        Trapezoid tz0 = new Trapezoid();
                        aList.add(tz0);
                        break;
                    default:
                }

            }

            else if (k == 2) {
                
                int threeD = rand.nextInt(2);
                switch (threeD) {
                    case 0:
                        Sphere s0 = new Sphere();
                        aList.add(s0);
                        break;
                    case 1:
                        Cube c0 = new Cube();
                        aList.add(c0);
                        break;
                    case 2:
                        Tetrahedron t0 = new Tetrahedron();
                        aList.add(t0);
                        break;
                    default:

                }
            }

            k = rand.nextInt(3);
        }

        while(k != 0);

    }

}

abstract class ThreeD implements ForThreeD, Shape {
    protected ShapeColor sc;
    protected double a;

    public ThreeD() {
    }

    public ThreeD(ShapeColor sc, double a) {
        set(sc, a);
    }

    public ThreeD(ThreeD td) {
        this(td.sc, td.a);
    }

    public double getA() {
        return a;
    }

    public void set(ShapeColor sc, double a) {
        this.sc = sc;
        this.a = a;
    }

    public void resize(double percentage) {

    }

    public String toString() {
        return String.format(null, null);
    }
}

abstract class TwoD implements ForTwoD, Shape {
    protected ShapeColor sc;
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public TwoD() {
    }

    public TwoD(ShapeColor sc, int a) {
        set(sc, a);
    }

    public TwoD(ShapeColor sc, int a, int b) {
        set(sc, a, b);
    }

    public TwoD(ShapeColor sc, int a, int b, int c) {
        set(sc, a, b, c);
    }

    public TwoD(ShapeColor sc, int a, int b, int c, int d) {
        set(sc, a, b, c, d);
    }

    public TwoD(TwoD td) {
        this(td.sc, td.a, td.b, td.c, td.d);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public ShapeColor getShapeColor() {
        return sc;
    }

    public void set(ShapeColor sc, int a) {
        this.sc = sc;
        this.a = a;
    }

    public void set(ShapeColor sc, int a, int b) {
        this.sc = sc;
        this.a = a;
        this.b = b;
    }

    public void set(ShapeColor sc, int a, int b, int c) {
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void set(ShapeColor sc, int a, int b, int c, int d) {
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void recolor(ShapeColor sc) {
        this.sc = sc;
    }

    public String toString() {
        return String.format("Updated color: %s%n" + "Area = %.3f%n", sc, area());
    }

}

class Circle extends TwoD {
    public Circle() {
    }

    public Circle(ShapeColor sc, int radius) {
        set(sc, radius);
    }

    public Circle(Circle c) {
        this(c.radius);
    }

    public void set(ShapeColor sc, int radius) {
        super.set(sc, radius);
    }

}

class Rectangle extends TwoD {
    public Rectangle() {
    }

    public Rectangle(ShapeColor sc, int length, int width) {
        set(sc, length, width);
    }
}

class Triangle extends TwoD {
    public Triangle() {
    }

    public Triangle(ShapeColor sc, int a, int b, int c) {
        super(sc, a, b, c);
    }

    public Triangle(Triangle t) {
        this(t.sc, t.a, t.b, t.c);
    }

    public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return 1.0 * (a + b + c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void set(ShapeColor sc, int a, int b, int c) {
        super.set(sc, a, b, c);
    }

    @Override
    public String toString() {
        return String.format("Triangle (2D (%s, %d, %d, %d)", sc, a, b, c);
    }
}

class Trapezoid extends TwoD {
    private int h;

    public Trapezoid() {
    }

    public Trapezoid(ShapeColor sc, int a, int b, int c, int d, int h) {
        set(sc, a, b, c, d, h);
    }

    public Trapezoid(Trapezoid t) {
        this(t.sc, t.a, t.b, t.c, t.d, t.h);
    }

    public double area() {
        return 1 / 2 * (a + b) * h;
    }

    public double perimeter() {
        return 1.0 * (a + b + c + d);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getHeight() {
        return h;
    }

    public void set(ShapeColor sc, int a, int b, int c, int d, int h) {
        super.set(sc, a, b, c, d);
        this.h = h;
    }

    @Override
    public String toString() {
        return String.format("Trapezoid (2D (%s, %d, %d, %d, %d), %d", sc, a, b, c, d, h);
    }

}

class Sphere extends ThreeD {
    public Sphere() {
    }

    public Sphere(ShapeColor sc, double a) {
        super(sc, a);
    }

    public Sphere(Sphere s) {
        this(s.sc, s.a);
    }

    public double area() {
        return 0; ///////////////////////////////////////////////////////////////////////
    }

    public double volume() {
        return 0;
    }

    public double getA() {
        return a;
    }

    public void set(ShapeColor sc, double a) {
        this.sc = sc;
        this.a = a;
    }

    public String toString() {
        return String.format(null, null);
    }
}

class Cube extends ThreeD {
    public Cube() {
    }

    public Cube(ShapeColor sc, double a) {
        set(sc, a);
    }

    public Cube(Cube c) {
        this(c.sc, c.a);
    }

    public double area() {
        return 0;
    }

    public double volume() {
        return 0;
    }

    public double getA() {
        return a;
    }

    public void set(ShapeColor sc, double a) {
        this.sc = sc;
        this.a = a;
    }

    public String toString() {
        return String.format(null, null);
    }

}

class Tetrahedron extends ThreeD {
    public Tetrahedron() {
    }

    public Tetrahedron(ShapeColor sc, double a) {
        set(sc, a);
    }

    public Tetrahedron(Tetrahedron t) {
        this(t.sc, t.a);
    }

    public double area() {
        return 0;
    }

    public double volume() {
        return 0;
    }

    public double getA() {
        return a;
    }

    public void set(ShapeColor sc, double a) {
        this.sc = sc;
        this.a = a;
    }

    public String toString() {
        return String.format(null, null);
    }
}
