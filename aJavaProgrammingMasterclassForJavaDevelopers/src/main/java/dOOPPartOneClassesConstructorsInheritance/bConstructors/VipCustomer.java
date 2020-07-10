package dOOPPartOneClassesConstructorsInheritance.bConstructors;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 50_000.0, "default@gmail.com" );
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer (String name, double creditLimit, String emailAddress) {
        this.name=name;
        this.emailAddress=emailAddress;
        this.creditLimit=creditLimit;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
