package fArraysListsAutoboxingUnboxing.iAutoboxingAndUnboxingChallenge;

import java.util.Scanner;

public class Main {

    private static Bank bank = new Bank("National Australia Bank");
    private static Bank bofa = new Bank("Bank of America");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        get(bank, 25);
        get(bofa, 33);

        addBranch(bofa, "New York");

        addBranch(bank, "Adelaine");
        addBranch(bank, "Sydney");
        addBranch(bank, "Adelaine");

        addCustomer(bank, "Adelaine", "Tim", 1_000.05d);
        addCustomer(bank, "Adelaine", "Mike", 175.34d);
        addCustomer(bank, "Adelaine", "Percy", 220.12d);
        //addCustomer("Sydney", "Bob", 150.54d);
        addCustomer(bank, "Sydney", "Bob", 150.54d);
        addCustomer(bank, "Melbourne", "Bob", 150.54d);

        addBranch(bank, "Melbourne");
        addCustomer(bank, "Melbourne", "Bob", 150.54d);

        addCustomerTransaction(bank, "Adelainew", "Tim", 44.22d);
        addCustomerTransaction(bank, "Adelaine", "Timb", 64.22d);
        addCustomerTransaction(bank, "Adelaine", "Tim", 12.44d);
        addCustomerTransaction(bank, "Adelaine", "Mike", 1.65d);

        //bank.listCustomers("Adelaine", true);
        //bank.listCustomers("Sydney", true);

        boolean quit = false;

        printActions();
        while (!quit) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    boolean done = false;
                    boolean showTransactions = false;
                    String branchName = "";
                    while (!done) {

                        System.out.println("Please enter branch name:");
                        branchName = scanner.next();
                        scanner.nextLine();
                        System.out.println("Do you want to display customer's transactions? 1 for YES, 0 for NO.");
                        int transactions = scanner.nextInt();
                        boolean existsBranch = bank.findBranchH(branchName);

                        if (transactions == 1 && existsBranch) {
                            showTransactions = true;
                            done = true;
                        } else if (transactions == 0 && existsBranch) {
                            done = true;
                        }
                        if (!existsBranch) {
                            System.out.println("The branch name you have entered does not exist! Please try again!");
                        }
                        if (transactions > 1 || transactions < 0) {
                            System.out.println("You have entered a wrong value. You have to enter 1 for YES or 0 for NO.");
                        }
                    }
                    listCustomers(bank, branchName, showTransactions);
                    break;
                case 2:
                    printActions();
                    break;
                case 3:
                    int bankOptions;
                    Bank bankName;
                    System.out.println("Please select the bank which branch you want to add:\npress:");

                    System.out.println("1 - Australian national bank.\n 2 - Bank of America.");
                    bankOptions = scanner.nextInt();
                    scanner.nextLine();

                    if (bankOptions == 1) {
                        bankName = bank;
                        System.out.println("Please enter the name of the branch you want to create:");

                        branchName = scanner.nextLine();
                        addBranch(bankName, branchName);
                    }
                    if (bankOptions == 2) {
                        bankName = bofa;
                        System.out.println("Please enter the name of the branch you want to create:");

                        branchName = scanner.nextLine();
                        addBranch(bankName, branchName);
                    }
            }
        }
    }

    private static void addBranch(Bank bankName, String branchName) {
        if (bankName.addBranch(branchName)) {
            System.out.println(branchName + " branch created.");
        } else if (!bankName.addBranch(branchName)) {
            System.out.println(branchName + " branch already exists.");
        }
    }

    private static void addCustomer(Bank bankName, String branchName, String customerName, double initialDepositAmount) {
        if (bankName.addCustomer(branchName, customerName, initialDepositAmount) == 1) {
            System.out.println(customerName + " was added to " + branchName + " branch.");
        } else if (bankName.addCustomer(branchName, customerName, initialDepositAmount) == 2) {
            System.out.println("Customer " + customerName + " already exists.");
        } else if (bankName.addCustomer(branchName, customerName, initialDepositAmount) == 0) {
            System.out.println("Error! " + branchName + " branch does not exist!");
        }
    }

    private static void addCustomerTransaction(Bank bankName, String branchName, String customerName, double depositAmount) {
        if (bankName.addCustomerTransaction(branchName, customerName, depositAmount) == 1) {
            System.out.println("A new deposit of " + depositAmount + "$ was made in " + customerName + "'s account.");
        } else if (bankName.addCustomerTransaction(branchName, customerName, depositAmount) == 2) {
            System.out.println("Customer " + customerName + " does not exist at branch.");
        } else if (bankName.addCustomerTransaction(branchName, customerName, depositAmount) == 0) {
            System.out.println("Error! " + branchName + " branch does not exist!");
        }
    }

    private static void listCustomers(Bank bankName, String branchName, boolean showTransactions) {
        //bank.listCustomers(branchName, showTransactions);
        if (!bankName.listCustomers(branchName, showTransactions)) {
            System.out.println("Error! " + branchName + " branch does not exist!");
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to close banking application.\n" +
                "1  - to list customers.\n" +
                "2  - to add a new contact\n" +
                "3  - to print a list of available actions.\n");
        System.out.println("Choose your action: ");
    }

    private static void get(Bank bank, int x) {
        System.out.println(bank.getName());

    }

}