import java.util.ArrayList;
import java.util.Scanner;

class AnNguyen_Lab_1{

    public static void main(String[] args){
        int day = 1;
        Date dob = new Date(day);

        Info info = new Info("An", "Vietnamese", "18th March 1997");
    }

}

class Info{
    private String nationality;
    private String name;
    private String date;
    private ArrayList<String> hobbies;
    private ArrayList<String> wishes;

    public Info(){

    }

    public Info(String name, String nationality, String date){
        setInfo(name, nationality, date);
    }

    public void setInfo(String name, String nationality, String date){
        this.name = name;
        this.nationality = nationality;
        this.date = date;
        //this.hobbies = hobbies;
        //this.wishes = wishes;
    }

    public String getName(){
        return name;
    }

    public String getNationality(){
        return nationality;
    }

    public String getDate(){
        return date;
    }

    public ArrayList<String> getHobbies(){
        return hobbies;
    }

    public ArrayList<String> getWishes(){
        return wishes;
    }


}

class Date{
    int day;
    String month;
    int year;

    public Date(){

    };

    public Date(int day, String month, int year){
        setDate(day, month, year);
    }

    public Date(int day){
        this.day = day;
    }

    public void setDate(int day, String month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public String getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

}