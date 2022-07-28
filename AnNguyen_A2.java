import java.util.Scanner;
import java.util.zip.GZIPOutputStream;
import java.io.File;
import java.io.IOException;

enum Month{Jab, Feb, Mar, Apr, May , Jun, Jul, Aug, Sep, Oct, Nov, Dec}
class AnNguyen_A2
{
    public static void main (String [ ] args)
    {
        //Construct a Scanner class object
        Scanner input = new Scanner (new File ("input.txt"));
        
        //Initialise patient 1
        HealthProfile hp = new HealthProfile();

        firstName = input.nextLine();
        lastName = input.nextLine();
        dob = input.nextLine();

        //Patient 1
        HealthProfile hp1 = new HealthProfile(input.nextLine(), input.nextLine(), input.nextLine(),
                                                input.nextLine(), input.nextLine(), input.nextLine());

        HealthProfile hp1 = new HealthProfile();

        System.out.printf("First patient%n");
        System.out.printf("-------------");
        hp1.printInfo();
        

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
    public HealthProfile()
    {
        //Initialise dob and h
        dob = new Date(); 
        h = new Height();
    }

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

    //This method caculates the age of the patient
    public int getAge()
    {
        int age = currentYear - dob.getYear();
        return age;
    }

    //This methods calculates the maximum heart rate
    private int getMaximumHeartRate()
    {
        int maximumHeartRate = 220 - getAge();
        return maximumHeartRate;
    }

    private double getMinimumTargetHeartRate()
    {
        double minimumTargetHeartRate = (getMaximumHeartRate()/100) * 50;
        return minimumTargetHeartRate;
    }

    private double getMaximumTargetHeartRate()
    {
       double maximumTargetHeartRate = (getMaximumHeartRate()/100) * 85;
       return maximumTargetHeartRate;
    }

    //Calculate BMI
    private double getBMI()
    {
        double height = h.getHeightInMeter(); //acquire height value in meter
        double bmi = weight/(height * height); //calculate BMI
        return bmi;
    }

    //Display patient info
    public void printInfo()
    {
        System.out.printf("\nName: %s, %s%n", firstName, lastName);
        System.out.printf("Date of birth: %s%n", dob);
        System.out.printf("Your weight: %f%n", weight);
        System.out.printf("Your height: %f%n", h);
        System.out.printf("Current year: %d%n", currentYear);
        System.out.printf("Your age: %d years old%n", getAge());
        System.out.printf("Clinic analysis, based on your age:%n");
        System.out.printf("\t1. Your maximum heart rate is %d%n", getMaximumHeartRate());
        System.out.printf("\t2. Your minimum target heart rate is %.2f%n", getMinimumTargetHeartRate());
        System.out.printf("\t3. Your maximum target heart rate is %.2f%n", getMaximumTargetHeartRate());
        System.out.printf("Your BMI: %.1f%n", getBMI());
        System.out.println("Weight category          Range");
        System.out.println("Underweight / too low    Below 18.5");
        System.out.println("Healthy range            18.5 - 25");
        System.out.println("Overweight               25 - 30");
        System.out.println("Obese                    30 - 35");
        System.out.println("Severe Obesity           35 - 40");
        System.out.println("Morbid Obesity           Over 40");
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
    public double getHeightInMeter()
    {
        double heightInMeter = feet*0.3048 + inches*0.0254;
        return heightInMeter;
    }
}