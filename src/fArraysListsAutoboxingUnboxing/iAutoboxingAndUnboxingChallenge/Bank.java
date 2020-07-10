package fArraysListsAutoboxingUnboxing.iAutoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {

        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public int addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            boolean x = branch.newCustomer(customerName, initialAmount);
            if (x) {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    public int addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            boolean x = branch.addCustomerTranzaction(customerName, amount);
            if (x) {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    public boolean findBranchH(String branchNameS) {
        if (findBranch(branchNameS) == null) {
            return false;
        }
        return true;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers details for branch " + branch.getName() + ":");

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount: " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchArray() {
        return branches;
    }
}
