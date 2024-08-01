
/**
 * Write a description of class Debitcard here.
 *
 * @author (22015816 Samir Gurung)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //attributes for DebitCard class
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //constructor
    public DebitCard(double balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName,int pinNumber)
    {
        super(balanceAmount, cardID, bankAccount, issuerBank);
        super.setClientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
        
    }
    
    
    //getter or accessor method for all the attributes
    public int getPinNumber()
    {
        return this.pinNumber;
    }

    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    
    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }
    
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    
    //setter or mutator method for withdrawal amount
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount = withdrawalAmount;
    }
    
    //withdraw method
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
    {
        // check if the pin number is same or not
        if(this.pinNumber == pinNumber){
            //checks if withdrawal amount is less than or equal to balance amount
            if(withdrawalAmount<=super.getBalanceAmount()){
                //deducts withdrawal amount from balance amount and store in a variable
                double newBalanceAmount = super.getBalanceAmount() - withdrawalAmount;
                //set new balance amount in super class
                super.setBalanceAmount(newBalanceAmount);
                this.hasWithdrawn = true;
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
                System.out.println("Money successfully withdrawn! Your remaining balance is: " + super.getBalanceAmount());
            }else{
                System.out.println("Insufficient balance. Please try again.");
            }
        }else{
            System.out.println("PIN number is invalid.");
        }
    }
    //display method
    public void display()
    {
        //display the super class
        super.display();
        //checks if the transaction was successful or not and prints as required
        if(this.hasWithdrawn == true){
            System.out.println("Pin Number: " + pinNumber);
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Date of Withdrawal: " + dateOfWithdrawal);
        }else{
            System.out.println("Transaction was unsuccessful. Your balance is: "+ super.getBalanceAmount());
        }
    }
}

