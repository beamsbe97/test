import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;
import java.util.Random;

class AnNguyen_130_A3
{
    private final static String[] Countries = {"China", "Thailand", "British Columbia", "South Korea", "Japan", 
                                        "USA", "Australia", "Venezuela", "Russia", "Brazil"};
    private final String[] Titles = {"Interview event", "Swimsuit competition event", "Evening gown competition event"};

    private static Random rand = new Random();
    private static void getScore(double[] score)
    {

    }

    /*private static String getCountry(ArrayList<MissWorld> alist, double result)
    {

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
        
        int nameNo = 0;
        for (int i = 1; i <= Countries.length; i++) {
            Country country = new Country(Countries[i-1], "Name"+i, rand.nextInt(50));
            System.out.printf("%-20s  %-10s  %d%n", country.getName(), country.getMissName(), country.getAge());
            
        }

        for (int i = 1; i <= Countries.length; i++){
            
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

    public static void construct2D()
    {
        for (int i = 0; i < array.length; i++) {
            
        }
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
        this. score = score;
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

    }

    private double highest()
    {

    }

    private double secondHighest()
    {

    }

    private double lowest()
    {

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
        System.out.printf("");
    }
}

