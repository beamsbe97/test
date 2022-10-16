import java.lang.Math;
import java.util.Random;

class AnNguyen_Lab_2{
    private static Random ran = new Random();
    private static final int NO_SETS = 5;
    public static void main(String[] args)
    {
        for (int i = 0; i <= NO_SETS; i++) {

            Point p1 = new Point(getInt(), getInt());
            Point p2 = new Point(getInt(), getInt());
            Line aline1 = new Line(p1,p2);
            System.out.printf("Set %d%n", i);
            displayInfo(p1, p2, aline1);
            System.out.println("-----------------------");
        }
        

    }

    public static void displayInfo(Point p1, Point p2, Line aline){
       System.out.printf("Given %s%n",p1);
       System.out.printf("Given %s%n",p2);
       System.out.printf("%s",aline);

    }

    private static int getInt(){
        
        return ran.nextInt(100);
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
		return String.format("Point (%d, %d)", x,y);
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
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY() - p2.getY()),2));
        
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
		//return "Line (" + p1 + ", " + p2 + ", " +"distance = "+ getDistance() +")";
        return String.format("Line( %s, %s, distance = %4f)%n", p1, p2, getDistance());
	}

}
