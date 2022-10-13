import java.lang.Math;

class AnNguyen_Lab_2{
    public static void main(String[] args)
    {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(5,6);
        Point p4 = new Point(7,8);
        Line aline1 = new Line(p1,p2);
        Line aline2 = new Line(p3,p4);
        displayInfo(p1, p2, aline1);
        displayInfo(p3, p4, aline2);

    }

    public static void displayInfo(Point p1, Point p2, Line aline){
       System.out.printf("%s",p1);

    }

}

class Point{
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        set(x,y);
    }

    public Point(Point p){
        this(p.x,p.y);
    }

    private double distance(Point p){
        return Math.sqrt((this.getX() - p.getX())^2 + (this.getY() - p.getY())^2);
    }
     
    public double getDistance(Point p){
        return p.distance();
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString ()
	{
		return String.format("Given point (%d, %d)%n", x,y);
	}
}

class Line{
    private Point p1;
    private Point p2;

    public Line(){

    }

    public Line(Point p1, Point p2){
        set(p1,p2);
    }

    public Line(Line aline){
        this(aline.p1, aline.p2);
    }

    public double getDistance(){
        return p1.getDistance(p2);
    }

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public void set(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString ()
	{
		return "Line (" + x + ", " + y + ")";
	}

}
