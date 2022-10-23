
class AnNguyen_242_A2{

    public static void main(String[] args){

    }
}

abstract class TwoD{
    protected ShapeColor sc;
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public TwoD(){}

    public TwoD(ShapreColor sc, int a){
        set(sc, a);
    }

    public TwoD(ShapreColor sc, int a, int b){
        set(sc, a, b);
    }

    public TwoD(ShapreColor sc, int a, int b, int c){
        set(sc, a, b, c);
    }

    public TwoD(ShapreColor sc, int a, int b, int c, int d){
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

    public void recolor(ShapreColor sc){

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

    public Rectangle(ShapreColor sc, int length, int width){
        set(sc, length, width);
    }
}

class Triangle extends TwoD{

}

class Trapezoid extends TwoD{
    private int h;

    public Trapezoid(){}

    public 
}