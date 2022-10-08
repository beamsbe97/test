class AnNguyen_Lab_2{
    public static void main(String[] args)
    {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(5,6);
        Point p4 = new Point(7,8);
        Line aline1 = new Line(p1,p2);
        Line aline2 = new Line(p3,p4);

        

    }

    public static void displayInfo(Point p1, Point p2, Line aline){
        System.out.printf("Given Point");
        System.out.print();

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

    public String toString(){
        return String.format("%d, %d", getX(), getY());
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
        return (p2.getX() - p1.getX())^2 + (p2.getY() - p1.getY())^2; //to find squre root sign
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

    public String toString(){
        return String.format("%d", getDistance());
    }

}