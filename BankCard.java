
/**
 * Write a description of class Bankcard here.
 *
 * @author (22015816 Samir Gurung)
 * @version (1.0.0)
 */
public class BankCard
{
    //attributes for BankCard class
    private int cardID;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    
    //constructor
    public BankCard(double balanceAmount,int cardID, String bankAccount, String issuerBank)
    {
        //initializes client name to an empty string
        this.clientName = "";
        //assigns attributes with the parameter values
        this.balanceAmount = balanceAmount;
        this.cardID = cardID;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }
    
    //getter or accessor methods for all the attributes
    public String getClientName()
    {
        return this.clientName;
    }
    
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    public int getCardID()
    {
        return this.cardID;
    }

    public String getBankAccount()
    {
        return this.bankAccount;
    }

    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    
    //setter or mutator method for client name and balance amount
    public void setClientName(String clientName)
    {
        this.clientName = clientName; 
    }
    
    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    
    //display method
    public void display()
    {
        System.out.println("Your Card: " + cardID);
        // check if the client name is empty or not
        if(clientName == ""){
            System.out.println("The client name is empty."); //message when client name is unassigned
        }else{
            System.out.println("Client Name: " + clientName);
        }
        
        System.out.println("Issuer Bank: " + issuerBank);
        System.out.println("Bank Account: " + bankAccount);
        System.out.println("Balance Amount: " + balanceAmount);      
    }   
}



