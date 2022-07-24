import java.util.Scanner;

enum Month{Jab, Feb, Mar, Apr, May , Jun, Jul, Aug, Sep, Oct, Nov, Dec}
class AnNguyen_A2
{
    public static void main (String [ ] args)
    {

    }

}

class HealthProfile
{
    private String firstName;
    private String lastName;
    private Date dob;
    private Height h;
    private double weight;
    private int currentYear;

    //Default constructor
    public HealthProfile(){}

    //Other constructor
    public HealthProfile(String firstName, String lastName, Date dob, 
                            Height h, double weight, int currentYear)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.h = h;
        this.weight = weight;
        this.currenYear = currentYear;
    }

    public HealthProfile(HealthProfile hp)
    {
        this(hp.firstName, hp.lastName, hp.dob, hp.h, hp.weight, hp.currentYear);
    }

    //Getter methods
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Date getDOB()
    {
        return dob;
    }

    public Height getHeight()
    {
        return h;
    }
    
    public double getWeight()
    {
        return weight;
    }

    public int getCurrentYear()
    {
        return currentYear;
    }

    //Setter methods
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setDOB(Date dob)
    {
        this.dob = dob;
    }

    public void setHeight(Height h)
    {
        this.h = h;
    }

    public void setCurrentYear(int currentYear)
    {
        this.currentYear = currentYear;
    }

    //this method calculate age based on DOB and current year
    public int getAge()
    {
        age = currentYear - Date.getYear();
        return age;
    }
}

class Date
{
    private int day;
    private Month month;
    private int year;

    //Default constructor
    public Date()
    {

    }

    //Other constructor
    public Date(int day, Month month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Copy constructor
    public Date(Date d)
    {
        this(d.day, d.month, d.year);
    }

    //Getter methods
    public int getDay()
    {
        return day;
    }

    public Month getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    //Setter method
    void setDate(int day, Month month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Height
{
    //Declare variables
    private int feet;
    private int inches;

    //Default constructor
    public Height()
    {

    }

    //Other constructor
    public Height(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }

    //Copy constructor
    public Height(Height h)
    {
        this(h.feet, h.inches);
    }

    //Getter methods
    public int getFeet()
    {
        return feet;
    }

    public int getInches()
    {
        return inches;
    }

    //Setter method
    public setHeight(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }

    //convert height to meter
    public getHeightInMeter()
    {
        heightInMeter = feet*0.3048 + inches*0.0254;
        return heightInMeter;
    }
}