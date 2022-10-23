import java.util.ArrayList;

enum ShapeColor{Blue, Yellow, Red, Green, White}

interface ForTwoD{
    public double perimeter();

    public void recolor(ShapeColor sc);
}

interface Shape{
    public double area();
}

interface ForThreeD{
    public double volume();

    public void resize(double percentage);
}

class AnNguyen_242_A2{

    public static void main(String[] args){

    }
}

abstract class ThreeD implements ForThreeD, Shape{
    protected ShapeColor sc;
    protected double a;

    public ThreeD(){}

    public ThreeD(ShapeColor sc, double a){
        set(sc, a);
    }

    public ThreeD(ThreeD td){
        this(td.sc, td.a);
    }

    public double getA(){
        return a;
    }

    public void set(ShapeColor sc, double a){
        this.sc = sc;
        this.a = a;
    }

    public void resize(double percentage){

    }

    public String toString(){
        return String.format(null, null);
    }
}

abstract class TwoD implements ForTwoD, Shape{
    protected ShapeColor sc;
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public TwoD(){}

    public TwoD(ShapeColor sc, int a){
        set(sc, a);
    }

    public TwoD(ShapeColor sc, int a, int b){
        set(sc, a, b);
    }

    public TwoD(ShapeColor sc, int a, int b, int c){
        set(sc, a, b, c);
    }

    public TwoD(ShapeColor sc, int a, int b, int c, int d){
        set(sc, a, b, c, d);
    }

    public TwoD(TwoD td){
        this(td.sc, td.a, td.b, td.c, td.d);
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int getC(){
        return c;
    }

    public int getD(){
        return d;
    }

    public ShapeColor getShapeColor(){}

    public void set(ShapeColor sc, int a){
        this.sc = sc;
        this.a = a;
    }

    public void set(ShapeColor sc, int a, int b){
        this.sc = sc;
        this.a = a;
        this.b = b;
    }

    public void set(ShapeColor sc, int a, int b, int c){
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void set(ShapeColor sc, int a, int b, int c, int d){
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void recolor(ShapeColor sc){

    }

    public String toString(){

    }

}

class Circle extends TwoD{
    public Circle(){}

    public Circle(ShapeColor sc, int radius){
        set(sc, radius);
    }

    public Circle(Circle c){
        this(c.radius);
    }

    public void set(ShapeColor sc, int radius){
        super.set(sc, radius);
    }

}

class Rectangle extends TwoD{
    public Rectangle(){}

    public Rectangle(ShapeColor sc, int length, int width){
        set(sc, length, width);
    }
}

class Triangle extends TwoD{

}

class Trapezoid extends TwoD{
    private int h;

    public Trapezoid(){}

    public Trapezoid(ShapeColor sc, int a, int b, int c, int d, int h){
        set(sc, a, b, c, d ,h);
    }

    public Trapezoid(Trapezoid t){
        this(t.sc, t.a, t.b, t.c, t.d, t.h);
    }

    public double area(){

    }

    public double perimeter(){
        return a + b + c + d;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int getC(){
        return c;
    }

    public int getD(){
        return d;
    }

    public int getHeight(){
        return h;
    }

    public void set(ShapeColor sc, int a, int b, int c, int d, int h){
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    public String toString(){
        return String.format(null, null);
    }

}

class Sphere extends ThreeD{
    public Sphere(){}

    public Sphere(ShapeColor sc, double a){
        set(sc, a);
    }

    public Sphere(Sphere s){
        this(s.sc, s.a);
    }

    public double area(){
        return 0; ///////////////////////////////////////////////////////////////////////
    }

    public double volume(){
        return 0;
    }

    public double getA(){
        return a;
    }

    public void set(ShapeColor sc, double a){
        this.sc = sc;
        this.a = a;
    }

    public String toString(){
        return String.format(null, null);
    }
}

class Cube extends ThreeD{
    public Cube(){}

    public Cube(ShapeColor sc, double a){
        set(sc, a);
    }

    public Cube(Cube c){
        this(c.sc, c.a);
    }

    public double area(){
        return 0;
    }

    public double volume(){
        return 0;
    }

    public double getA(){
        return a;
    }

    public void set(ShapeColor sc, double a){
        this.sc = sc;
        this.a = a;
    }

    public String toString(){
        return String.format(null, null);
    }

}

class Tetrahedron extends ThreeD{
    public Tetrahedron(){}
    
    public Tetrahedron(ShapeColor sc, double a){
        set(sc, a);
    }

    public Tetrahedron(Tetrahedron t){
        this(t.sc, t.a);
    }

    public double area(){
        return 0;
    }

    public double volume(){
        return 0;
    }

    public double getA(){
        return a;
    }

    public void set(ShapeColor sc, double a){
        this.sc = sc;
        this.a = a;
    }

    public String toString(){
        return String.format(null, null);
    }
}

