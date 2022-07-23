import java.util.Scanner;

class Lab3
{
	//This is actual code that wilkl break the project
    static Scanner input = new Scanner(System.in);
    public static void main (String [ ] args)
    {

    }

}  

class PetrolPurchase
{
    private String station;   
    private double quantity;   
    private String type;
    private double price;
    private int discount;

    //Default constructor
    public void PetrolPurchase()
    {

    }
    //Constructors
    public void PetrolPurchase (String s, double q, String t, double p, int d)
    {
        this.station = s;
        this.quantity = q;
        this.type = t;
        this.price = p;
        this.discount = d;

    }

    //Copy constructor
    public void PetrolPurchase(PetrolPurchase pp)
    {
        this(pp.station);
    }
    //Accessor methods
    public String getStation()
    {
        return station;
    }

    public String getType()
    {
        return type;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public int getDiscount()
    {
        return discount;
    }

    //Mutator methods
    public void setStation(String station)
    {
        this.station = station;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    public void setDiscount(int discount)
    {
        this.discount = discount;
    }

    private setInfo(String s, double q, String t, double p, int d)
    {
        this.station = s;
        this.quantity = q;
        this.type = t;
        this.price = p;
        this.discount = d;
    }

    private double computePayment()
    {
        double payment = price * quantity;
        return payment;
    }
    
    public double getPayment()
    {
        double netsAmount = getPayment();
        return netsAmount;
    }

    public void printInfo()
    {
        System.out.printf("Summary of your purchase");
        System.out.printf("Station: %s", getStation());
        System.out.printf("Total liter: %f", getQuantity());
        System.out.printf("Petrol type: %s", getType());
        System.out.printf("Price per liter: %f", getQuantity());
        System.out.printf("Actual cost: %f", get)
    }
} 


/* System.out.print("Enter the station:");
station = nextLine();
System.out.print("Enter quantity in liter:");
quantity = nextLine();
System.out.print("Enter type of petrol:");
type = nextLine();
System.out.print("Enter discount:");
discount = nextLine(); */ 
