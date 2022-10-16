import java.util.Scanner;
import java.util.ArrayList;

enum ZodiacInfo{Aries, Taurus, Gemini, Cancer, Leo, Vigro, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces}
enum ZodiacType{ARI, TAU, GEM, CAN, LEO, VIR, LIB, SCO, SAG, CAP, AQU, PIS}

class AnNguyen_A1{
    private static Scanner input = new Scanner(System.in);

    //NEED TO USE DO WHILE !!!!!!!!!!!!!!!!!!!!!

    private static void displayZodiacTypeInfo(){

    }

    private static ZodiacType getAnElement(){

    }

    private Set getASet(){

    }

    private static void displayMenu(){

    }

    private static void unionExample(){

    }

    private static void interesctionExample(){

    }

    private static void subsetExample(){

    }

    private static void differenceExample(){

    }

    private static void complementExample(){

    }

    private static void equalityExample(){

    }

    private static void distributiveLaw_1(){

    }

    private static void distributiveLaw_2(){

    }

    public static void displaySubmenu(){

    }

    public static void anExample(){

    }

    public static void main(String[] args){
        Set set = new Set();
        for(int i=0; i<=13; i++){
            set.addElement(ZodiacType.values()[i]);
        }
        
        
        
    }
}

class Set{
    
    private ArrayList<ZodiacType> s;

    public Set(){}

    public Set(Set otherSet){
        this(otherSet.s);
        
    }

    public boolean isEmpty(){

    }

    public int cardinality(){

    }

    public boolean belongTo(ZodiacType element){
        
    }

    public void addElement(ZodiacType element){
        s.add(element);
    }

    public boolean subset(Set otherSet){

    }

    public void union(Set otherSet){

    }

    public void intersection(Set otherSet){

    }

    public void difference(Set otherSet){

    }

    public Set complement(){

    }

    public boolean equality(Set otheSet){

    }

    public String toString(){
        String.format(null, null);
    }

    public String getZodiaInfoFormat(){
        String.format("%s", )
    }
}


