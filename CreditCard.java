
/**
 * Write a description of class CreditCard here.
 *
 * @author (22015816 Samir Gurung)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    //attributes
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    //constructor
    public CreditCard(int cardID,String clientName, String issuerBank, String bankAccount, 
    double balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        //call made to superclass constructor with 4 parameters and a setter method
        super(balanceAmount,cardID, bankAccount,issuerBank);
        this.setClientName(clientName);
        //assigns parameter values and a false value
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    //getter or accessor method for all attributes
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    
    public double getInterestRate()
    {
        return this.interestRate;
    }
    
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
  
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    
    //method to set the credit limit
    public void setCreditLimit(double newCreditLimit, int newGracePeriod)
    {
        this.creditLimit = newCreditLimit;
        this.gracePeriod = newGracePeriod;
        //credit limit should be less or equals to 2.5 times the balance amount of super class
        if(creditLimit <= 2.5 * (super.getBalanceAmount())){
            System.out.println("Credit is successfully granted!");
            this.isGranted = true;
        }else{
            System.out.println("Credit limit exceeded, hence credit could not be granted.");
        }
    }
    
    //method to cancel credit card
    public void cancelCreditCard()
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    
    //display method
    public void display()
    {
        //display the super class display()
        super.display();
        if(isGranted == true){
            System.out.println("Credit limit is valid, hence credit is granted!");
            System.out.println("Credit Limit:" + this.creditLimit);
            System.out.println("Grace Period:" + this.gracePeriod);
        }else{
            System.out.println("Credit is not granted.");
        }
        System.out.println("CVC number:" + this.cvcNumber);
        System.out.println("Interest Rate:" + this.interestRate);
        System.out.println("Expiration Date:" + this.expirationDate);
    }
}
