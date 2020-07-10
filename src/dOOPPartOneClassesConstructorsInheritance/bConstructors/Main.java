package dOOPPartOneClassesConstructorsInheritance.bConstructors;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount JohnSmith = new BankAccount("1234567890", 100.0d, "John Smith", "myemail@yahoo.com", "+40749029659");
        System.out.println(JohnSmith.getCustomerName());
        System.out.println(JohnSmith.getBalance());
        System.out.println(JohnSmith.getAccountNumber());
        System.out.println(JohnSmith.getEmail());
        System.out.println(JohnSmith.getPhoneNumber());

        BankAccount BobbyZ = new BankAccount();
        System.out.println(BobbyZ.getCustomerName());
        System.out.println(BobbyZ.getBalance());
        System.out.println(BobbyZ.getAccountNumber());
        System.out.println(BobbyZ.getEmail());
        System.out.println(BobbyZ.getPhoneNumber());


        //##~~~~~~~~~~~~~~~~~~~INPUT DATA FROM KEYWORD~~~~~~~~~~~~~~~##

        /*
        System.out.println("Please enter customer name here: ");
        Scanner myScanner = new Scanner(System.in);
        JohnSmith.setCustomerName(myScanner.nextLine());
        System.out.println(JohnSmith.getCustomerName());
        */


        JohnSmith.depositFunds(25.0d);
        JohnSmith.withdrawFunds(-23.0d);
        JohnSmith.depositFunds(10.0d);
        System.out.println("Customer name is: " + JohnSmith.getCustomerName());
        System.out.println("Customer " + JohnSmith.getCustomerName() + " has a balance of: " + String.format("%.2f",JohnSmith.getBalance()));

        BankAccount timsAccount = new BankAccount("TimB", "tim@gmail.com", "12345");
        System.out.println(timsAccount.getAccountNumber() + "name" + timsAccount.getCustomerName());

        VipCustomer Person1 = new VipCustomer();
        System.out.println(Person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25_000.0);
        System.out.println(person2.getName() + " " + person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("Tim", 100.0, "tim@email.com");
        System.out.println(person3.getName() + " " + person3.getCreditLimit() + " " + person3.getEmailAddress());

    }
}
