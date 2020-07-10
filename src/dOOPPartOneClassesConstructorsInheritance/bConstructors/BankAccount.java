package dOOPPartOneClassesConstructorsInheritance.bConstructors;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("Default acount", 0.00d, "Defult name", "Default email", "Default phone number");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("BankAccount constructor with parameters called.");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName,email,phoneNumber);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmmount) {
        balance = balance + depositAmmount;
        System.out.println("Your account was increased with the ammount of: " + depositAmmount + "$");
        System.out.println("Your new balance is: " + balance + "$");
    }

    public void withdrawFunds (double withdrawalAmmount) {
        if (withdrawalAmmount <= 0) {
            System.out.println("Your withdrawal amount must be greater than 0.0$!");
        }
        else if (balance - withdrawalAmmount < 0)  {
            System.out.println("Insufficient funds! Please try again with a lower withdrawal amount!");
        }
        else {
            balance = balance - withdrawalAmmount;
            System.out.println("Your account was decreased with the ammount of: " + withdrawalAmmount + "$");
            System.out.println("Your new balance is: " + balance + "$");
        }
    }

}
