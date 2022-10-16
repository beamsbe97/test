// Objective: My Lab 2
// Name: An Nguyen
// Student number: 10242357
// File name: AnNguyen_Lab_2.java
// Declaration: this is my own lab and I have not passed my lab to anyone in this class

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

enum ZodiacInfo {
    Aries, Taurus, Gemini, Cancer, Leo, Vigro, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces
}

enum  ZodiacType{

    ARI(ZodiacInfo.Aries, "March 21", "April 19"),
    TAU(ZodiacInfo.Taurus, "April 20", "May 20"), 
    GEM(ZodiacInfo.Gemini, "May 21", "June 20"), 
    CAN(ZodiacInfo.Cancer, "June 21", "July 22"), 
    LEO(ZodiacInfo.Leo,"July 23", "August 22"), 
    VIR(ZodiacInfo.Vigro, "August 23", "September 22"), 
    LIB(ZodiacInfo.Libra, "September 23", "October 22"), 
    SCO(ZodiacInfo.Scorpio, "Octeber 23", "November 21"), 
    SAG(ZodiacInfo.Sagittarius, "November 22", "December 21"), 
    CAP(ZodiacInfo.Capricorn, "December 22", "January 19"), 
    AQU(ZodiacInfo.Aquarius, "January 20", "Febuary 18"), 
    PIS(ZodiacInfo.Pisces, "Febuary 19", "March 20");
  
    public ZodiacInfo zodiac;
    public String fromDate, toDate;
  
    private ZodiacType(ZodiacInfo zodiac, String fromDate, String toDate) {
      this.zodiac = zodiac ;
      this.fromDate = fromDate ;
      this.toDate = toDate;
    }

    public String display(){
        return String.format("%-10s %-15s %-20s %-20s", this.name(),zodiac.name(), fromDate, toDate);
    }
  
}

class AnNguyen_A1 {
    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();
    

    private static void displayZodiacTypeInfo() {
        for (ZodiacType deez: ZodiacType.values()) {
            System.out.println(deez.display());
        }

    }

    private static ZodiacType getAnElement() {
        return ZodiacType.AQU;
    }

    private static Set getASet() {
        Set set = new Set();
        for (int i = 0; i <= rand.nextInt(12); i++) {
            set.addElement(ZodiacType.values()[rand.nextInt(ZodiacType.values().length)]);
        }
        return set;
    }

    private static void displayMenu() {
        System.out.println("\nWelcome to SIM Set Theory lesson");
        System.out.println("\n0. Properties of set");
        System.out.println("1. Union example");
        System.out.println("2. Intersection example");
        System.out.println("3. Subset example");
        System.out.println("4. Difference example");
        System.out.println("5. Sets equality example");
        System.out.println("7. Distributive Law 1");
        System.out.println("8. Distributuve Law 2");
        System.out.println("9. Quit");

    }

    private static void unionExample() {
        Set setA = getASet();
        Set setB = getASet();
        System.out.println(setA);
        System.out.println(setB);
        setA.union(setB);
        System.out.println(setA);
    }

    private static void interesctionExample() {

    }

    private static void subsetExample() {

    }

    private static void differenceExample() {

    }

    private static void complementExample() {

    }

    private static void equalityExample() {

    }

    private static void distributiveLaw_1() {

    }

    private static void distributiveLaw_2() {

    }

    public static void displaySubmenu() {

    }

    public static void anExample() {
        Set example = getASet();
        System.out.println(example);
      
    }

    public static void main(String[] args) {

        System.out.println("Universal set info");
        /*
         * for(int i=0; i<=13; i++){
         * Set set = new Set();
         * 
         * 
         * //set.addElement(ZodiacType.values()[i]);
         * }
         */
        displayZodiacTypeInfo();
        displayMenu();

        System.out.printf("Your option:");
        int option = input.nextInt();
        switch (option) {
            case 0:
                anExample();
            case 1:
                unionExample();
            case 2:
                interesctionExample();
            case 3:
                subsetExample();
            case 4:
                differenceExample();
            case 5:
                complementExample();
            case 6:
                equalityExample();
            case 7:
                distributiveLaw_1();
            case 8:
                distributiveLaw_2();
            default:
        }
        

    }

}

class Set {

    private ArrayList<ZodiacType> s = new ArrayList<ZodiacType>();

    public Set() {
    }

    public Set(Set otherSet) {
        this(otherSet.s);
    }

    public boolean isEmpty() {
        return 0;
    }

    public int cardinality() {
        return 0;
    }

    public boolean belongTo(ZodiacType element) {
        return 0;
    }

    public void addElement(ZodiacType element) {
        s.add(element);
    }

    public boolean subset(Set otherSet) {
        return 0;
    }

    public void union(Set otherSet) {
        java.util.Set<ZodiacType> setA = new HashSet<>();
        setA.addAll(this.s);
        setA.addAll(otherSet.s);
        this.s = new ArrayList<ZodiacType>(setA);
    }

    public void intersection(Set otherSet) {

    }

    public void difference(Set otherSet) {

    }

    public Set complement() {
        return s;
    }

    public boolean equality(Set otheSet) {
        return 0;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.size(); i++) {
            if (i > 0) {
                builder.append(", ");
            }
            builder.append(s.get(i));

        }
        return builder.toString();
    }

    public String getZodiaInfoFormat() {
        switch (s) {
            case "ARI":
                return ZodiacInfo.Aquarius;
            case "TAU":
                return ZodiacInfo.Taurus;
            case "GEM":
                return ZodiacInfo.Gemini;
            case "CAN":
                return ZodiacInfo.Cancer;
            case "LEO":
                return ZodiacInfo.Leo;
            case "VIR":
                return ZodiacInfo.Vigro;
            case "LIB":
                return ZodiacInfo.Libra;
            case "SCO":
                return "Scorpio";

        }
    }
}
