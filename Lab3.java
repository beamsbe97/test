import java.util.Scanner;


class PetrolPurchase
{
    // Declare variables
    private String station;   
    private double quantity;   
    private String type;
    private double price;
    private int discount;

    //Default constructor
    public PetrolPurchase()
    {
    }

    //Other Constructor
    public PetrolPurchase (String s, double q, String t, double p, int d)
    {
        this.station = s;
        this.quantity = q;
        this.type = t;
        this.price = p;
        this.discount = d;

    }

    //Copy constructor
    public PetrolPurchase(PetrolPurchase pp)
    {
        this(pp.station, pp.quantity, pp.type, pp.price, pp.discount);
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

    //This method calculates the amount for payment
    private double computePayment()
    {
        double payment = price * quantity;
        return payment;
    }
    
    //This method calculates the discount amount to be displayed in the summary
    public double calculateDiscount()
    {
        double discount = getDiscount();
        double payment = computePayment();
        double discountAmount = (payment/100)*discount;
        return discountAmount;
    }

    //This method calculates the nets amount after discount
    public double getPayment()
    {
        double payment = computePayment();
        double discountAmount = calculateDiscount();
        double netsAmount = payment - discountAmount;
        return netsAmount;
    }

    //This methods prints out the purchase summary
    public void printInfo()
    {

        System.out.printf("\nSummary of your purchase%n");
        System.out.printf("Station: %s%n", getStation());
        System.out.printf("Total liter: %.2f%n", getQuantity());
        System.out.printf("Petrol type: %s%n", getType());
        System.out.printf("Price per liter: %.2f%n", getQuantity());
        System.out.printf("Actual cost: %.2f%n", computePayment());
        System.out.printf("Discount (%d%%): %.2f%n", getDiscount(),calculateDiscount());
        System.out.printf("Amount  to pay: %.2f%n", getPayment());
    }
} 

class Lab3
{
    static Scanner input = new Scanner(System.in);
    public static void main (String [ ] args)
    {
        //Declare variables
        String station;   
        double quantity;   
        String type;
        double price;
        int discount;
        double addQty;

        //Read user's input
        System.out.print("Enter the station: ");
        station = input.nextLine();
        System.out.print("Enter quantity in liter: ");
        quantity = input.nextDouble();
        input.nextLine();
        System.out.print("Enter type of petrol: ");
        type = input.nextLine();
        System.out.print("Enter price of petrol: ");
        price = input.nextDouble();
        System.out.print("Enter discount: ");
        discount = input.nextInt(); 
        input.nextLine();

        //Construct a PetrolPurchase object and display the purchase information
        PetrolPurchase pp1 = new PetrolPurchase(station,quantity,type,price,discount);
        pp1.printInfo();

        //Prompt user to input additional petrol quantity
        System.out.print("\nEnter additional quantity of petrol: ");
        addQty = input.nextDouble();
        quantity = quantity + addQty;

        //Construct new purchase with updated info and print out the purchase
        PetrolPurchase pp2 = new PetrolPurchase(station,quantity,type,price,discount);
        System.out.print("\nYour new purchased price");
        pp2.printInfo();

        //Duplicate copy for the customer
        System.out.print("\nDuplicate the same object");
        PetrolPurchase pp3 = new PetrolPurchase(pp2);
        pp3.printInfo();
    }

}  


