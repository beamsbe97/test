// Objective: My Assignment 1
// Name: An Nguyen
// Student number: 10242357
// File name: AnNguyen_A1.java
// Declaration: this is my own lab and I have not passed my lab to anyone in this class

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

enum ZodiacInfo {
    Aries, Taurus, Gemini, Cancer, Leo, Vigro, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces
}

enum ZodiacType {

    ARI(ZodiacInfo.Aries, "March 21", "April 19"),
    TAU(ZodiacInfo.Taurus, "April 20", "May 20"),
    GEM(ZodiacInfo.Gemini, "May 21", "June 20"),
    CAN(ZodiacInfo.Cancer, "June 21", "July 22"),
    LEO(ZodiacInfo.Leo, "July 23", "August 22"),
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
        this.zodiac = zodiac;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String display() {
        return String.format("%-10s %-15s %-20s %-20s", this.name(), zodiac.name(), fromDate, toDate);
    }

}

class AnNguyen_A1 {
    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();

    private static void displayZodiacTypeInfo() {
        for (ZodiacType deez : ZodiacType.values()) {
            System.out.println(deez.display());
        }

    }

    private static ZodiacType getAnElement() {
        return ZodiacType.AQU;
    }

    private static Set getASet() {
        Set set = new Set();
  
        ArrayList<ZodiacType> setA = new ArrayList<>();
        ZodiacType toAdd;
        for (int i = 0; i < rand.nextInt(12); i++) {
            do {
                toAdd = ZodiacType.values()[rand.nextInt(12)];
            } while (setA.contains(toAdd));
            setA.add(toAdd);
        }
        for (ZodiacType item : setA) {
            set.addElement(item);
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
        System.out.println("5. Complement example");
        System.out.println("6. Sets equality example");
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

    private static void intersectionExample() {
        Set setA = getASet();
        Set setB = getASet();
        System.out.println("Given sets");
        System.out.printf("\tA = {%s}%n", setA);
        System.out.printf("\tB = {%s}%n", setB);
        setA.intersection(setB);
    }

    private static void subsetExample() {

        Set setA = getASet();
        Set setB = getASet();
        System.out.println("Given sets");
        System.out.printf("\tA = {%s}%n", setA);
        System.out.printf("\tB = {%s}%n", setB);
        System.out.println();
        System.out.println("Conclusion");
        System.out.printf("\tA subset of B: %b", setA.subset(setB));
        System.out.println();
        System.out.printf("\tB subset of A: %b", setB.subset(setA));
        System.out.println();
    }

    private static void differenceExample() {
        Set setA = getASet();
        Set setB = getASet();
        System.out.println("Given sets");
        System.out.printf("\tA = {%s}%n", setA);
        System.out.printf("\tB = {%s}%n", setB);
        setA.difference(setB);
    }

    private static void complementExample() {
        Set setA = getASet();
        System.out.println("Given sets");
        System.out.printf("\tA = {%s}%n", setA);
        System.out.println();
        System.out.printf("\tA' = {%s}%n", setA.complement());

    }

    private static void equalityExample() {
        Set setA = getASet();
        Set setB = getASet();
        System.out.println("Given sets");
        System.out.printf("\tA = {%s}%n", setA);
        System.out.printf("\tB = {%s}%n", setB);
        System.out.println();
        System.out.println("Analysis");
        System.out.printf("\tA subset of B: %b", setA.subset(setB));
        System.out.println();
        System.out.printf("\tB subset of A: %b", setB.subset(setA));
        System.out.println();
        System.out.println("Conclusion");
        System.out.printf("\tA equals to B: %b", setA.equality(setB));
    }

    private static void distributiveLaw_1() {
        Set setA = getASet();
        Set setB = getASet();
        Set setC = getASet();
        Set setLHS = setA.union2(setB.intersect(setC));
        Set setRHS = (setA.union2(setB)).intersect(setA.union2(setC));

        System.out.println("\n We wish to prove: A U (B I C) = (A U B) I (A U C)");
        System.out.println();
        System.out.println("Given sets");
        System.out.printf("\tA = {%s}%n", setA);
        System.out.printf("\tB = {%s}%n", setB);
        System.out.printf("\tC = {%s}%n", setC);
        System.out.println();
        System.out.println("LHS analysis");
        System.out.printf("\tLHS = {%s}%n", setLHS);
        System.out.println("RHS analysis");
        System.out.printf("\tRHS = {%s}%n", setRHS);
        System.out.println();
        System.out.println("Conclusion");
        System.out.printf("\tLHS = RHS is %b", setLHS.equality(setRHS));

    }

    private static void distributiveLaw_2() {
        Set setA = getASet();
        Set setB = getASet();
        Set setC = getASet();
        Set setLHS = setA.intersect(setB.union2(setC));
        Set setRHS = (setA.intersect(setB)).union2(setA.intersect(setC));

        System.out.println("\n We wish to prove: A I (B U C) = (A I B) U (A I C)");
        System.out.println();
        System.out.println("Given sets");
        System.out.printf("\tA = {%s}%n", setA);
        System.out.printf("\tB = {%s}%n", setB);
        System.out.printf("\tC = {%s}%n", setC);
        System.out.println();
        System.out.println("LHS analysis");
        System.out.printf("\tLHS = {%s}%n", setLHS);
        System.out.println("RHS analysis");
        System.out.printf("\tRHS = {%s}%n", setRHS);
        System.out.println();
        System.out.println("Conclusion");
        System.out.printf("\tLHS = RHS is %b", setLHS.equality(setRHS));

    }

    public static void displaySubmenu() {
        System.out.println("Some basic operations in set");
        System.out.println("\t1. Add an element");
        System.out.println("\t2. Check an element");
        System.out.println("\t3. Cardinality");
        System.out.println("\t4. Zodiac Info format");
        System.out.println("\t9. Quit");
    }

    public static void anExample() {
        Set example = getASet();
        System.out.printf("\tA = {%s}%n", example);
        System.out.println();
        int subOption;
        do {
            displaySubmenu();
            System.out.printf("Enter your option: ");
            subOption = input.nextInt();
            input.nextLine();
            ZodiacType newElem;
            switch (subOption) {
                case 1:
                    System.out.printf("Enter an element: ");
                    newElem = ZodiacType.valueOf(input.next());
                    example.addElement(newElem);
                    System.out.printf("A = {%s}%n", example);
                    break;
                case 2:
                    System.out.println("Enter an element");
                    newElem = ZodiacType.valueOf(input.next());
                    if (example.belongTo(newElem)) {
                        System.out.printf("Element %s is in the set%n", newElem);
                    }

                    else {
                        System.out.printf("Element %s is not in the set%n", newElem);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("No of elements in set is %d%n", example.cardinality());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Notation in enum format");
                    System.out.printf("\tA = {%s}%n", example.getZodiaInfoFormat());

                    break;
                default:
            }
        } while (subOption != 9);

    }

    public static void main(String[] args) {

        System.out.println("Universal set info");
        displayZodiacTypeInfo();
        int option;
        do {
            displayMenu();

            System.out.printf("Your option:");
            option = input.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Here is an example of set");
                    anExample();

                    break;
                case 1:
                    System.out.println("Union example");
                    unionExample();
                    break;
                case 2:
                    intersectionExample();
                    break;
                case 3:
                    subsetExample();
                    break;
                case 4:
                    differenceExample();
                    break;
                case 5:
                    complementExample();
                    break;
                case 6:
                    equalityExample();
                    break;
                case 7:
                    distributiveLaw_1();
                    break;
                case 8:
                    distributiveLaw_2();
                    break;
                default:
            }
        } while (option != 9);

    }

}

class Set {

    private ArrayList<ZodiacType> s = new ArrayList<ZodiacType>();

    public Set() {
    }

    public Set(Set otherSet) {
        this.s = otherSet.s;
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public int cardinality() {
        return s.size();
    }

    public boolean belongTo(ZodiacType element) {
        return s.contains(element);
    }

    public void addElement(ZodiacType element) {
        if (!s.contains(element)) {
            s.add(element);
        }

    }

    public boolean subset(Set otherSet) {
        for (ZodiacType elem : s) {
            if (!otherSet.s.contains(elem)) {
                return false;
            }
        }
        return true;
    }

    public void union(Set otherSet) {

        for (ZodiacType elem : otherSet.s) {
            if (!s.contains(elem)) {
                s.add(elem);
            }
        }
    }

    public Set union2(Set otherSet) {
        Set ret = new Set(this);

        for (ZodiacType elem : otherSet.s) {
            if (!ret.s.contains(elem)) {
                ret.s.add(elem);
            }
        }

        return ret;

    }

    public void intersection(Set otherSet) {

        System.out.printf("\tIntersection of A and B = {%s}%n", this.intersect(otherSet));

    }

    public Set intersect(Set otherSet) {
        Set intersection = new Set();
        for (ZodiacType elem : otherSet.s) {
            if (s.contains(elem)) {
                intersection.addElement(elem);
            }
        }

        return intersection;
    }

    public void difference(Set otherSet) {
        Set difference = new Set();
        for (ZodiacType elem : s) {
            if (!otherSet.s.contains(elem)) {
                difference.addElement(elem);
            }
        }

        System.out.printf("\n\tA - B = {%s}%n", difference);
    }

    public Set complement() {
        Set setC = new Set();
        for (ZodiacType elem : ZodiacType.values()) {
            if (!s.contains(elem)) {
                setC.addElement(elem);
            }
        }
        return setC;
    }

    public boolean equality(Set otherSet) {
        return this.subset(otherSet) && otherSet.subset(this);
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
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.size(); i++) {
            if (i > 0) {
                builder.append(", ");
            }
            builder.append(s.get(i).zodiac.name());

        }
        return builder.toString();

    }
}
