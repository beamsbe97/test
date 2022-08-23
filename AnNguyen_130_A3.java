import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;
import java.util.Random;

class AnNguyen_130_A3
{
    private final static String[] Countries = {"China", "Thailand", "British Columbia", "South Korea", "Japan", 
                                               "USA", "Australia", "Venezuela", "Russia", "Brazil"};
    //private final static String[] Countries =  new String [10];
    private final static String[] Titles = {"Interview event", "Swimsuit competition event", "Evening gown competition event"};

    private static Random rand = new Random();
    private static void getScore(double[] score)
    {
        for (int i = 0; i < score.length; i++) {
            score [i] =  rand.nextDouble();
        }
    }

    private static String getCountry(ArrayList<MissWorld> alist, double result)
    {
     
    }

    private static void constructAList (ArrayList <Country> alist)
	{
		for (String name : Countries)
		{
			alist.add (new Country (name, "Name1", rand.nextInt(50)));
		}
	}

    /*private static void displayInfo(ArrayList<Country> alist)
    {
        System.out.printf("%-15s","Countries");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-6s", "J" + " " + i);
        }

        System.out.printf("%-6s","c/f");
        System.out.printf("%-6","Current");
        System.out.printf("%-6","Total");

        for (MissWorld mw : alist)
            mw.printInfo();
    }*/

    private static void displaySortedList(ArrayList<MissWorld> alist, String event)
    {
        System.out.printf("");
    }

    private static int getAge()
    {
        return Math.random() * 100;
    }

    public static void main (String [] args)
    {
        double[] score = new double[10];

        getScore(score);
        ArrayList <Country> alist = new ArrayList <Country> ();
        constructAList(alist);

        
        for (int i = 0; i < Titles.length; i++) {

            for (Country c : alist)
            System.out.printf("%s %s %d%n", c.getName(), c.getMissName(), c.getAge());
        }
        
    
    }
}

class Country
{
    private String name;
    private String missName;
    private int age;

    //Default constructor
    public Country()
    {
        missName = missname + 1;
    }

    //Other constructor
    public Country(String name, String missName, int age)
    {
        this.name = name;
        this.missName = missName;
        this.age = age;
    }

    //Getter methods
    public String getName()
    {
        return name;
    }

    public String getMissName()
    {
        return missName;
    }

    public int getAge()
    {
        return age;
    }

    public void displyCountryInfo()
    {
    }
}

class MissWorld
{
    static final int SIZE = 10;
    private Country name;
    private double[] score;
    private double cf;
    private double fs;

    //Default constructor
    public MissWorld()
    {}

    //Other constructor
    public MissWorld(Country name, double[] score, double cf)
    {
        this.name = name;
        this.score = score;
        this.cf = cf;
    }

    //Getter methods
    public Country getCountry()
    {
        return name;
    }

    public double getCarriedForward()
    {
        return cf;
    }

    public double getFinalScore()
    {
        return fs;
    }

    

    private ArrayList<Double> getSortedList()///////////////////////////////////////////////////////////
    {
        
        Array.sort(score);
    }


    private double highest(double [] score)
    {
        double highest = 0;
        for (int i = 0; i < score.length; i++){
            if (score[i] > highest)
            {
                highest = score[i];
            }
        }

        return highest;
    }

    private double secondHighest()
    {

    }

    private double lowest(double [] score)
    {
        double lowest = 10;
        for (int i = 0; i < score.length; i++) {
            if (score[i] < lowest)
            {
                lowest = score[i];
            }  
        }

        return lowest;
    }

    private double secondLowest()
    {

    }

    private double finalScore()
    {

    }

    private double getTotalScore()
    {

    }

    public void printInfo()
    {
        System.out.printf("%-15s", name);
        
        for (double s : score) {
            System.out.printf("%-6f", s);
        }

        System.out.printf("%-6f", getCarriedForward());
        System.out.printf("%-6f", finalScore());
        System.out.printf("%-6f", getTotalScore());
    }
}

