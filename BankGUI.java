
/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.color.*;
public class BankGUI implements ActionListener
{
    private JLabel heading, cardIdLabel, clientNameLabel, issuerBankLabel, bankAccountLabel,balanceAmountLabel, cardIdLabel2;
    private JTextField cardIdTextField, clientNameTextField, issuerBankTextField, bankAccountTextField, balanceAmountTextField, cardIdTextField2;
    private JButton displayBtn, clearBtn;
    // Debit Card components
    // Label, textfield, combobox and buttons needed for debitcard

    private JLabel pinNumberLabel, withdrawalAmountLabel,withdrawalDateLabel, pinNumberLabel2;
    private JTextField pinNumberTextField, withdrawalAmountTextField, pinNumberTextField2;

    //For withdrawal date

    private JComboBox dayOfWithdrawalComboBox, monthOfWithdrawalComboBox, yearOfWithdrawalComboBox;
    private JButton addDebitCardButton, withdrawBtn;

    // For Credit Card components
    // Label
    private JLabel cvcNumberLabel, creditLimitLabel, interestRateLabel, gracePeriodLabel, expirationDateLabel,CcardIdLabel,CissuerBankLabel,CclientNameLabel,CbankAccountLabel,CbalanceAmountLabel,cardIdLabel4;
    private JTextField cvcNumberTextField, creditLimitTextField, interestRateTextField, gracePeriodTextField,CcardIdTextField,CissuerBankTextField,CclientNameTextField,CbankAccountTextField,CbalanceAmountTextField,cardIdTextField4;
    private JComboBox dayOfExpirationComboBox, monthOfExpirationComboBox, yearOfExpirationComboBox;
    private JButton addCreditCardBtn, setCreditLimitBtn, cancelCreditCardBtn;
    private JFrame frame;
    ArrayList<BankCard> cards = new ArrayList<BankCard>();

    public BankGUI(){
        //Frame code
        JFrame frame = new JFrame("Bank OF KATHMANDU");
        heading = new JLabel("BANK OF KATHMANDU");
        heading.setBounds(320,2,200,100);
        frame.add(heading);

        //Card id
        cardIdLabel = new JLabel("Card ID :");
        cardIdLabel.setBounds(80,120,50,20);
        cardIdTextField = new JTextField();
        cardIdTextField.setBounds(142,120,60,25);

        cardIdLabel2 = new JLabel("Card ID :");
        cardIdLabel2.setBounds(80, 570, 60, 19);
        cardIdTextField2 = new JTextField();
        cardIdTextField2.setBounds(142, 570, 60, 25);

        //Issuer bank
        issuerBankLabel = new JLabel("Issuer Bank :");
        issuerBankLabel.setBounds(53,170,84,14);
        issuerBankTextField = new JTextField();
        issuerBankTextField.setBounds(142,170,125,25);

        //Bank Account  

        bankAccountLabel = new JLabel("Bank Account :");
        bankAccountLabel.setBounds(45,264,101,31);
        bankAccountTextField = new JTextField();
        bankAccountTextField.setBounds(140,220,125,25);

        //Client Name

        clientNameLabel = new JLabel("Client Name :");
        clientNameLabel.setBounds(52,202,101,55);
        clientNameTextField = new JTextField();
        clientNameTextField.setBounds(142,269,125,25);

        //Balance Amount

        balanceAmountLabel = new JLabel("Balance Amount :");
        balanceAmountLabel.setBounds(30,321,113,25);
        balanceAmountTextField = new JTextField();
        balanceAmountTextField.setBounds(142,321,125,25);

        //Pin

        pinNumberLabel = new JLabel("PIN :");
        pinNumberLabel.setBounds(100,370,34,14);
        pinNumberTextField = new JTextField();
        pinNumberTextField.setBounds(142,368,52,25);
        pinNumberLabel2 = new JLabel("PIN :");
        pinNumberLabel2.setBounds(105, 690, 60, 19);
        pinNumberTextField2 = new JTextField();
        pinNumberTextField2.setBounds(142, 690, 60, 25);

        //Withdraw Amount

        withdrawalAmountLabel = new JLabel("Withdraw Amount :");
        withdrawalAmountLabel.setBounds(28,610,124,22);
        withdrawalAmountTextField = new JTextField();
        withdrawalAmountTextField.setBounds(142,610,125,25);

        //Withdraw Date
        withdrawalDateLabel = new JLabel("Withdrawal Date :");
        withdrawalDateLabel.setBounds(35, 650, 112, 18);
        String[] dayOfWithdrawal = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        dayOfWithdrawalComboBox = new JComboBox(dayOfWithdrawal);
        dayOfWithdrawalComboBox.setBounds(255,650,55,25);

        String[] monthOfWithdrawal = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        monthOfWithdrawalComboBox = new JComboBox (monthOfWithdrawal);
        monthOfWithdrawalComboBox.setBounds(200,650,55,25);

        String[] yearOfWithdrawal = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016"};
        yearOfWithdrawalComboBox = new JComboBox(yearOfWithdrawal);
        yearOfWithdrawalComboBox.setBounds(142,650,55,25);

        //For Debit Card Buttons
        addDebitCardButton = new JButton("Add Debit Card");
        addDebitCardButton.setBounds(25, 510, 126, 22);
        withdrawBtn = new JButton("WithDraw");
        withdrawBtn.setBounds(210,690,100,25);
        addDebitCardButton.addActionListener(this);
        withdrawBtn.addActionListener(this);

        // Now for Credit card

        // card id
        CcardIdLabel = new JLabel("Card ID : ");
        CcardIdLabel.setBounds(484,120,65,21);
        CcardIdTextField = new JTextField();
        CcardIdTextField.setBounds(555,120,60,25);
        // issuerbank
        CissuerBankLabel = new JLabel("Issuer Bank :");
        CissuerBankLabel.setBounds(460,170,84,14);
        CissuerBankTextField = new JTextField();
        CissuerBankTextField.setBounds(556,168,126,25);

        //Client Name
        CclientNameLabel = new JLabel("Client Name :");
        CclientNameLabel.setBounds(457,210,110,31);
        CclientNameTextField = new JTextField();
        CclientNameTextField.setBounds(556,214,127,25);

        // bank account
        CbankAccountLabel = new JLabel("Bank Account :");
        CbankAccountLabel.setBounds(451,249,101,55);
        CbankAccountTextField = new JTextField();
        CbankAccountTextField.setBounds(556,267,127,25);

        //balance amount
        CbalanceAmountLabel = new JLabel("Balance Amount :");
        CbalanceAmountLabel.setBounds(435,312,113,20);
        CbalanceAmountTextField = new JTextField();
        CbalanceAmountTextField.setBounds(556,312,129,25);

        // CVC number
        cvcNumberLabel = new JLabel("CVC : ");
        cvcNumberLabel.setBounds(502,330,43,75);
        cvcNumberTextField = new JTextField();
        cvcNumberTextField.setBounds(556,355,55,25);

        // For Interest Rate

        interestRateLabel = new JLabel("Interest Rate :");
        interestRateLabel.setBounds(454,400,88,21);
        interestRateTextField = new JTextField();
        interestRateTextField.setBounds(557,400,55,25);

        // For Expiration Date

        expirationDateLabel = new JLabel("Expiration Date :");
        expirationDateLabel.setBounds(438,450,106,21);
        String[] dayOfExpiration = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        dayOfExpirationComboBox = new JComboBox(dayOfExpiration);
        dayOfExpirationComboBox.setBounds(686,450,55,25);

        String[] monthOfExpiration = {"January","February","March","April","May","June","July","August","September","october","November","December"};
        monthOfExpirationComboBox = new JComboBox(monthOfExpiration);
        monthOfExpirationComboBox.setBounds(620,450,55,25);

        String[] yearOfExpiration = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
        yearOfExpirationComboBox = new JComboBox(yearOfExpiration);
        yearOfExpirationComboBox.setBounds(556,450,55,25);

        // CardId for Credit

        cardIdLabel4 = new JLabel("Card ID :");
        cardIdLabel4.setBounds(484,570,60,19);
        cardIdTextField4 = new JTextField();
        cardIdTextField4.setBounds(556,570,60,25);

        //For Credit Limit
        creditLimitLabel = new JLabel("Credit Limit :");
        creditLimitLabel.setBounds(464,585,99,73);
        creditLimitTextField = new JTextField();
        creditLimitTextField.setBounds(556,610,60,25);

        //For Grace Period
        gracePeriodLabel = new JLabel("Grace Period :");
        gracePeriodLabel.setBounds(455,650,99,25);
        gracePeriodTextField = new JTextField();
        gracePeriodTextField.setBounds(555,650,60,25);

        addCreditCardBtn = new JButton("Add Credit Card");
        addCreditCardBtn.setBounds(640,510,126,22);
        cancelCreditCardBtn = new JButton ("Cancel");
        cancelCreditCardBtn.setBounds(705,650,74,24);
        setCreditLimitBtn = new JButton ("Set");
        setCreditLimitBtn.setBounds(625,650,74,24);
        addCreditCardBtn.addActionListener(this);
        cancelCreditCardBtn.addActionListener(this);
        setCreditLimitBtn.addActionListener(this);

        /* Credit Card's GUI code is finished here */

        /* Button to display and clear the items in the array*/
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(560,725,124,29);
        displayBtn = new JButton("Display");
        displayBtn.setBounds(420,725,124,29);
        clearBtn.addActionListener(this);

        //Frame code
        frame.setSize(800,800);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(cardIdLabel);
        frame.add(cardIdTextField);
        frame.add(issuerBankLabel);
        frame.add(issuerBankTextField);
        frame.add(bankAccountLabel);
        frame.add(bankAccountTextField);
        frame.add(clientNameLabel);
        frame.add(clientNameTextField);
        frame.add(balanceAmountLabel);
        frame.add(balanceAmountTextField);
        frame.add(pinNumberLabel);
        frame.add(pinNumberTextField);
        frame.add(withdrawalAmountLabel);
        frame.add(withdrawalAmountTextField);
        frame.add(withdrawalDateLabel);
        frame.add(dayOfWithdrawalComboBox);
        frame.add(monthOfWithdrawalComboBox);
        frame.add(yearOfWithdrawalComboBox);
        frame.add(addDebitCardButton);
        frame.add(withdrawBtn);
        frame.add(cvcNumberLabel);
        frame.add(cvcNumberTextField);
        frame.add(interestRateLabel);
        frame.add(interestRateTextField);
        frame.add(expirationDateLabel);
        frame.add(dayOfExpirationComboBox);
        frame.add(monthOfExpirationComboBox);
        frame.add(yearOfExpirationComboBox);
        frame.add(creditLimitLabel);
        frame.add(creditLimitTextField);
        frame.add(gracePeriodLabel);
        frame.add(gracePeriodTextField);
        frame.add(addCreditCardBtn);
        frame.add(cancelCreditCardBtn);
        frame.add(setCreditLimitBtn);
        frame.add(clearBtn);
        frame.add(displayBtn);
        frame.add(cardIdLabel2);
        frame.add(cardIdTextField2);
        frame.add(pinNumberLabel2);
        frame.add(pinNumberTextField2);
        frame.add(cardIdLabel4);
        frame.add(cardIdTextField4);

        frame.add(CcardIdLabel);
        frame.add(CcardIdTextField);
        frame.add(CissuerBankLabel);
        frame.add(CissuerBankTextField);
        frame.add(CclientNameLabel);
        frame.add(CclientNameTextField);
        frame.add(CbankAccountLabel);
        frame.add(CbankAccountTextField);
        frame.add(CbalanceAmountLabel);
        frame.add(CbalanceAmountTextField);

    }
      
    //Functionality for debit card
    public void actionPerformed(ActionEvent e){

        // Get all the values of the constructor parameters
        //if(e.getSource() == addDebitCardButton){
        if(e.getSource() == addDebitCardButton){
            try{
                // Retrieving values from text fields

                int cardId = Integer.parseInt(cardIdTextField.getText());
                String clientName = clientNameTextField.getText();
                String issuerBank = issuerBankTextField.getText();
                String bankAccount = bankAccountTextField.getText();
                double balanceAmount = Double.parseDouble(balanceAmountTextField.getText());
                int pinNumber = Integer.parseInt(pinNumberTextField.getText());
                boolean toAdd = true;
                DebitCard dbCard;

                if(cards.isEmpty()){
                    dbCard = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                    cards.add(dbCard);
                    JOptionPane.showMessageDialog(frame, "Debit card is added successfully.", "Alert", JOptionPane.INFORMATION_MESSAGE);

                }else{
                    for(BankCard card : cards){
                        if(card instanceof DebitCard){

                            dbCard = (DebitCard) card;
                            dbCard.display();

                            if(dbCard.getCardID() == cardId){

                                JOptionPane.showMessageDialog(frame, "Debit card already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                                toAdd = false;
                                break;
                            }
                        }else{

                            JOptionPane.showMessageDialog(frame, "Card Cannot Be Added.", "Error", JOptionPane.ERROR_MESSAGE);
                            toAdd = false;
                            break;

                        }

                        if(toAdd == true){

                            dbCard = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                            cards.add(dbCard);
                            JOptionPane.showMessageDialog(frame, "Debit Card Is Added Successfully.","Alert.", JOptionPane.INFORMATION_MESSAGE);

                        }
                    }

                }

            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Invalid !! \n Please input correct data", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Functionality for adding Credit Card button

        if(e.getSource() == addCreditCardBtn){

            try{

                // retrieving values from text fields

                int cardId = Integer.parseInt(CcardIdTextField.getText());
                String clientName = CclientNameTextField.getText();
                String issuerBank = CissuerBankTextField.getText();
                String bankAccount = CbankAccountTextField.getText();
                double balanceAmount = Double.parseDouble(CbalanceAmountTextField.getText());
                int cvcNumber = Integer.parseInt(cvcNumberTextField.getText());
                double interestRate = Double.parseDouble(interestRateTextField.getText());
                String Day = (String) dayOfExpirationComboBox.getSelectedItem();
                String Month = (String) monthOfExpirationComboBox.getSelectedItem();
                String Year = (String) yearOfExpirationComboBox.getSelectedItem();
                String expirationDate = Day + " " + Month + " " + Year;
                boolean toAdd = true;
                CreditCard ggCard;

                if(cards.isEmpty()){
                    ggCard = new CreditCard(cardId ,clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                    cards.add(ggCard);
                    JOptionPane.showMessageDialog(frame, "Credit Card Has Been Added Successfully. ", "Alert", JOptionPane.INFORMATION_MESSAGE);

                }
                else{

                    for(BankCard card : cards){

                        if(card instanceof CreditCard){

                            ggCard = (CreditCard) card;
                            if(ggCard.getCardID() == cardId){

                                JOptionPane.showMessageDialog(frame, "Credit Card Already Exists.", "Error", JOptionPane.ERROR_MESSAGE);
                                toAdd = false;
                                break;
                            }
                        }

                        else{

                            JOptionPane.showMessageDialog(frame, "Card Not Found.", "Error", JOptionPane.ERROR_MESSAGE);
                            toAdd = false;
                            break;
                        }

                    }
                    if(toAdd == true){

                        ggCard = new CreditCard(cardId ,clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                        cards.add(ggCard);
                        JOptionPane.showMessageDialog(frame, "Credit Card Is Added Successfully.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException ex){

                JOptionPane.showMessageDialog(frame, "Invalid !! \n Please Input Correct Data.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Setting CreditLimit

        if(e.getSource() == setCreditLimitBtn){
            try{
                //Retrieving values from text fields

                int cardId = Integer.parseInt(cardIdTextField4.getText());
                double newCreditLimit = Double.parseDouble(creditLimitTextField.getText());
                int newGracePeriod = Integer.parseInt(gracePeriodTextField.getText());

                if(cards.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Card Has Not Been Added", "\n Please Add The Card First", JOptionPane.ERROR_MESSAGE);

                }

                else{

                    //If credit card is already present

                    for(BankCard card:cards){
                        //Check if its credit card or not

                        if(card instanceof CreditCard){

                            //Downcasting

                            CreditCard ggCard = (CreditCard) card;

                            if(ggCard.getCardID() == cardId){

                                //Calling set credit limit method

                                ggCard.setCreditLimit(newCreditLimit, newGracePeriod);

                                if(newCreditLimit <= 2.5 * ggCard.getBalanceAmount()){
                                    JOptionPane.showMessageDialog(frame, "Credit Limit Has Been Set : \n Credit Limit :" + newCreditLimit + "\n Grace Period :" + newGracePeriod, "Alert !!", JOptionPane.INFORMATION_MESSAGE);

                                }
                                else{

                                    JOptionPane.showMessageDialog(frame, "Credit Limit Has Not Been Set", "Error", JOptionPane.ERROR_MESSAGE);

                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(frame, "Your CardID Is Incorrect !!", "Error", JOptionPane.ERROR_MESSAGE);

                            }

                        }
                        else{

                            JOptionPane.showMessageDialog(frame, "Card Not Found !!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                }

            }
            catch(NumberFormatException ex){

                JOptionPane.showMessageDialog(frame, "Invalid Input !!, Please Check Again", "Error !!", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        // Setting Cancle button
        if(e.getSource() == cancelCreditCardBtn){
            try{
                //Retreving calues from textFields

                int cardId = Integer.parseInt(cardIdTextField4.getText());
                int newcreditLimit = Integer.parseInt(creditLimitTextField.getText());
                int newgracePeriod = Integer.parseInt(gracePeriodTextField.getText());
                int cvcNumber = Integer.parseInt(cvcNumberTextField.getText());

                if(cards.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Card Not Found!!", "Error", JOptionPane.ERROR_MESSAGE);

                }
                else{

                    for (BankCard card : cards){

                        if(card instanceof CreditCard){

                            //Downcasting

                            CreditCard ggCard = (CreditCard) card;

                            if(ggCard.getCardID() == cardId){

                                ggCard.cancelCreditCard();
                                creditLimitTextField.setText("");
                                gracePeriodTextField.setText("");
                                cvcNumberTextField.setText("");

                                JOptionPane.showMessageDialog(frame, "Credit Card Is Cancelled Successfully", "No Error Found", JOptionPane.INFORMATION_MESSAGE);

                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Incorrect CardID. Credit Card Is Not Cancelled","Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                        else{
                            JOptionPane.showMessageDialog(frame,"Credit Card Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }

            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid Input!!Please Check Again", "Error",JOptionPane.INFORMATION_MESSAGE);

            }
        }
        // Implementing Action Listener to the WithdrawButton

        if(e.getSource() == withdrawBtn){
            try{

                //Retrieving values form text field

                int cardId = Integer.parseInt(cardIdTextField2.getText());
                int withdrawalAmount = Integer.parseInt(withdrawalAmountTextField.getText());
                int pinNumber = Integer.parseInt(pinNumberTextField2.getText());
                String dbDay = (String) dayOfWithdrawalComboBox.getSelectedItem();
                String dbMonth = (String) monthOfWithdrawalComboBox.getSelectedItem();
                String dbYear = (String) yearOfWithdrawalComboBox.getSelectedItem();
                String dateOfWithdrawal = dbDay + " " + dbMonth + " " + dbYear;

                if(cards.isEmpty()){

                    JOptionPane.showMessageDialog(frame, "Card Has Not Been Added" , "\nPlease Add The Card First", JOptionPane.ERROR_MESSAGE);

                }
                //If Debit card is already present

                else{
                    //loop through the arraylist

                    for(BankCard card : cards){
                        //Its Debit Card or not?
                        if(card instanceof DebitCard){
                            //Downcasting

                            DebitCard dbCard = (DebitCard) card;

                            if(dbCard.getCardID() == cardId && dbCard.getPinNumber() == pinNumber){
                                double initialAmount = dbCard.getBalanceAmount();
                                dbCard.withdraw(withdrawalAmount, dateOfWithdrawal, pinNumber);
                                double finalAmount = dbCard.getBalanceAmount();
                                double remainingAmount = initialAmount - withdrawalAmount;

                                if(withdrawalAmount <= initialAmount){

                                    JOptionPane.showMessageDialog(frame, "Money Is Successfully Withdrawn. Your Remaining Balance Is : ","Withdraw success", JOptionPane.INFORMATION_MESSAGE);

                                }

                                else{

                                    JOptionPane.showMessageDialog(frame, "Your Balance Is Insufficient", "Error", JOptionPane.ERROR_MESSAGE);
                                }

                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Your PIN Or CardID IS Incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            }

                        }
                        else{

                            JOptionPane.showMessageDialog(frame," Debit Card Not Found", "Error",JOptionPane.ERROR_MESSAGE);

                        }

                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame," Invalid Input", "Please Try Again",JOptionPane.INFORMATION_MESSAGE );

            }
        }

        if(e.getSource() == clearBtn){
            cardIdTextField.setText("");
            clientNameTextField.setText("");
            issuerBankTextField.setText("");
            bankAccountTextField.setText("");
            balanceAmountTextField.setText("");
            cardIdTextField2.setText("");
            pinNumberTextField.setText("");
            withdrawalAmountTextField.setText("");
            pinNumberTextField2.setText("");
            cvcNumberTextField.setText("");
            creditLimitTextField.setText("");
            interestRateTextField.setText("");
            gracePeriodTextField.setText("");
            CcardIdTextField.setText("");
            CissuerBankTextField.setText("");
            CclientNameTextField.setText("");
            CbankAccountTextField.setText("");
            CbalanceAmountTextField.setText("");
            cardIdTextField4.setText("");

        }
    
    //Display button
        if(e.getSource() == displayBtn){
            int cardId = Integer.parseInt(cardIdTextField.getText());
            String clientName = clientNameTextField.getText();
            String issuerBank = issuerBankTextField.getText();
            String bankAccount = bankAccountTextField.getText();
            double balanceAmount = Double.parseDouble(balanceAmountTextField.getText());
            int pinNumber = Integer.parseInt(pinNumberTextField.getText());
            
            int withdrawalAmount = Integer.parseInt(withdrawalAmountTextField.getText());
            String day = (String) dayOfWithdrawalComboBox.getSelectedItem();
            String month = (String) monthOfWithdrawalComboBox.getSelectedItem();
            String year = (String) yearOfWithdrawalComboBox.getSelectedItem();
            String withdrawalDate = day+""+month+""+year;
            
            int CcardId = Integer.parseInt(CcardIdTextField.getText());
            String CclientName = CclientNameTextField.getText(); 
            String CissuerBank = CissuerBankTextField.getText();
            String CbankAccount = CbankAccountTextField.getText();
            String CbalanceAmount = CbalanceAmountTextField.getText();
            int cvcNumber = Integer.parseInt(cvcNumberTextField.getText());
            double interestRate = Double.parseDouble(interestRateTextField.getText());
            String day1 = (String) dayOfExpirationComboBox.getSelectedItem();
            String month1 = (String) monthOfExpirationComboBox.getSelectedItem();
            String year1 = (String) yearOfExpirationComboBox.getSelectedItem();
            String expirationDate = day1+""+month1+""+year1;
            
            double nreCreditLimit = Double.parseDouble(creditLimitTextField.getText());
            int newGracePeriod = Integer.parseInt(gracePeriodTextField.getText());
            
            if(cards.isEmpty()){
                JOptionPane.showMessageDialog(frame, "No card Found.","Error",JOptionPane.ERROR_MESSAGE);
                
            }
            else{
                for(BankCard  debObj1 : cards){
                    if(debObj1 instanceof DebitCard){
                        DebitCard debitCard = (DebitCard) debObj1;
                        debObj1.display();
                        
                        String dis = " Card ID : "+cardId+"\nClient Name:"+clientName+"\nIssuer Bank:"+issuerBank+"\nBank Account"+bankAccount+"\nBalance Amount:"+balanceAmount+"\nPin Number:"+pinNumber;
                        JOptionPane.showMessageDialog(frame, dis,"Debit card Displayed", JOptionPane.INFORMATION_MESSAGE);
                        
                        
                        
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        BankGUI obj = new BankGUI();
    }
}

        

            
    
                
            
        // write the logic of the button functionality here
        // add debit card
        // get all the values
        // check all the values
        // if values are not correct: show message

        // if array list is empty:
        // Add Debit card
        // call a constructor
        // create object of debit card
        // add object to the arraylist
        // show message:
        //else
        // if debit card is already present:
        // loop through the arraylist,if id is same
        // dont add
        // show message
        // else:
        // Add debit card
        // call a constructor
        // create object of debit card
        // add object to the arraylist
        // show message
        // WITHDRAW button
        // get the parameters 
        // call the withdraw method

        // if the arraylist is empty:
        // dont withdraw
        // show message:

        // else
        // check id the debitcard is present
        // loop thorough the arraylist
        // if it si debitcard or not?
        // id card id matches
        //  show information in a dialog box
        // if PIN number matches
        // call the withdraw method with the parameters
        // show message: Amount has been withdrawn
        // else
        // show message : PIN does not match
        // else 
        // show message: card not found

        // Display method (everything)
        // call the display method

        // if arraylist is empty:
        // dont display
        // show message: empty  | nothing to display
        // else:
        // loop through the arraylist
        // if debit card is present (if object instance of Debit card)
        //downcast it
        // call the display method
        //else
        // show message: debit card not found

        //  public static void main (String[] args){
        // create object of BankGUI
        //BankGUI obj = new BankGUI();
        //Step1: Create JFrame using constructor

        //Use the method of java frame:
        //step2: Set the size of the JFrame


