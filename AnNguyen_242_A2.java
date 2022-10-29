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

    private static int getInt(int bound) {
        return rand.nextInt(bound) + 1;
    }

    private static double getDouble() {
        return Math.random() * 10 + 1;
    }

    private static ShapeColor getColor() {
        int c = (int) (Math.random() * 5);
        switch (c) {
            case 0:
                return ShapeColor.Blue;
            case 1:
                return ShapeColor.Yellow;
            case 2:
                return ShapeColor.Red;
            case 3:
                return ShapeColor.Green;
            default:
                return ShapeColor.White;
        }
    }

    private static boolean isTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
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
        for (Shape shape: alist) {
            System.out.println(shape);

        }
    }

    private static void constructAList(ArrayList<Shape> aList){
        int k = rand.nextInt(3);
        do {
            System.out.println(k);
            if (k == 1) {
                
                int twoD = rand.nextInt(3);
                switch (twoD) {
                    case 0:
                        Circle c0 = new Circle(getColor(), getInt(10));
                        aList.add(c0);
                        break;
                    case 1:
                        Rectangle r0 = new Rectangle(getColor(), getInt(10), getInt(10));
                        aList.add(r0);
                        break;
                    case 2:
                        Triangle t0 = new Triangle(getColor(), getInt(10), getInt(10), getInt(10));
                        if(isTriangle(t0.getA(), t0.getB(), t0.getC())){
                            aList.add(t0);
                        }
                        break;
                    case 3:
                        Trapezoid tz0 = new Trapezoid(getColor(), getInt(10), getInt(10), getInt(10), getInt(10), getInt(10));
                        aList.add(tz0);
                        break;
                    default:
                }

            }

            else if (k == 2) {
                
                int threeD = rand.nextInt(2);
                switch (threeD) {
                    case 0:
                        Sphere s0 = new Sphere(getColor(), getDouble());
                        aList.add(s0);
                        break;
                    case 1:
                        Cube c0 = new Cube(getColor(), getDouble());
                        aList.add(c0);
                        break;
                    case 2:
                        Tetrahedron t0 = new Tetrahedron(getColor(), getDouble());
                        aList.add(t0);
                        break;
                    default:

                }
            }

            k = rand.nextInt(3);
        }

        while(k != 0);


    }

    public static void main(String[] args) {
        
        ArrayList<Shape> aList = new ArrayList<Shape>();
    
        constructAList(aList);
        displayList(aList);

    }

}

abstract class ThreeD implements ForThreeD, Shape {
    protected ShapeColor sc;
    protected double a;
    private double percentage = Math.random()*1.0 + 0.1;

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
        a = a*percentage;
    }

    public String toString() {
        return String.format("Surface area = %.3f%n" + "Volume = %.3f%n" 
                            + "Size reduced by %.1f: %s", area(), volume(), percentage, );
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
    private int radius; //////////////////////////////////////////////////////

    public Circle() {
    }

    public Circle(ShapeColor sc, int radius) {
        set(sc, radius);
    }

    public Circle(Circle c) {
        this(c.radius);
    }

    public int getRadius(){
        return radius;
    }

    public double perimeter(){
        return Math.PI * 2 * getRadius();
    }

    public double area(){
        return Math.PI * getRadius() * getRadius();
    }

    public void set(ShapeColor sc, int radius) {
        super.set(sc, radius);
    }

    @Override
    public String toString(){
        return String.format("Circle (2D (%s, %d)%n" + "%s%n", sc, radius, super.toString());
    }

}

class Rectangle extends TwoD {

    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(ShapeColor sc, int length, int width) {
        set(sc, length, width);
    }

    public Rectangle(Rectangle r){
        this(r.sc, r.length, r.width);
    }

    public double area(){
        return getLength() * getWidth();
    }

    public double perimeter(){
        return 2*getLength() + 2*getWidth();
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void set(ShapeColor sc, int length, int width){
        super.set(sc, length, width);
    }

    @Override
    public String toString(){
        return String.format("Rectangle (2D (%s, %d, %d)%n" + "%s%n", sc, length, width, super.toString());
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
        return String.format("Triangle (2D (%s, %d, %d, %d)%n" + "%s%n", sc, a, b, c, super.toString());
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

    @Override
    public double area() {
        return 4.0 * Math.PI * (a*a); 
    }

    public double volume() {
        return (4/3) * Math.PI * a*a*a;
    }

    public double getA() {
        return a;
    }

    public void set(ShapeColor sc, double a) {
        this.sc = sc;
        this.a = a;
    }

    @Override
    public String toString() {
        return String.format("Sphere (3D (%s, %.3f))%n" + "%s%n", sc, a, super.toString());
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
        return a*a;
    }

    public double volume() {
        return a*a*a;
    }

    public double getA() {
        return a;
    }

    public void set(ShapeColor sc, double a) {
        this.sc = sc;
        this.a = a;
    }

    public String toString() {
        return String.format("Cube (3D (%s, %.3f))%n" + "%s%n", sc, a, super.toString());
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
        double s = (3*a) / 2.0;
        double triArea =  Math.sqrt(s * (s - a) * 3);
        return 4.0*a + 3*triArea;
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
        return String.format("Tetrahedron (3D (%s, %.3f))%n" + "%s%n", sc, a, super.toString());
    }
}