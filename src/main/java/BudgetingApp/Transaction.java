package BudgetingApp;

public class Transaction
{
    //fields
    private String transactionType;
    private double transactionAmount;

    //constructor
    public Transaction(String type, double amount)
    {
        transactionType = type;
        transactionAmount = amount;
    }

    //getters
    public String getTransactionType()
    {
        return transactionType;
    }
    public double getTransactionAmount()
    {
        return transactionAmount;
    }

    //setters
    public void setTransactionType(String type)
    {
        transactionType = type;
    }
    public void setTransactionAmount(double amount)
    {
        transactionAmount = amount;
    }

    //methods
    public void displayDetails()
    {
        System.out.printf("Transaction type: %s%n", transactionType);
        System.out.printf("Transaction amount: $%.2f%n", transactionAmount);
    }
}