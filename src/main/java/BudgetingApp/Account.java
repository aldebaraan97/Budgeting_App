package BudgetingApp;

public class Account
{
    //fields
    private String categoryName;
    private double amountBudgeted;
    private double amountSpent;

    //constructor
    public Account() {}
    public Account (String name, double amountBudget)
    {
        categoryName = name;
        amountBudgeted = amountBudget;
        amountSpent = 0.0;
    }

    //getters
    public String getCategoryName()
    {
        return categoryName;
    }
    public double getAmountBudgeted()
    {
        return amountBudgeted;
    }
    public double getAmountSpent()
    {
        return amountSpent;
    }

    //setters
    public void setCategoryName(String name)
    {
        categoryName = name;
    }
    public void setAmountBudgeted(double amount)
    {
        amountBudgeted = amount;
    }

    public void setAmountSpent(double amount)
    {
        amountSpent = amount;
    }

    //methods
    public void addExpense(double amount)
    {
        amountSpent += amount;
    }
    public void removeExpense(double amount)
    {
        amountSpent -= amount;
    }
    public double getRemainingBudget()
    {
        return getAmountBudgeted() - getAmountSpent();
    }
    public void displayDetails()
    {
        System.out.printf("Budget Name: %s%n", categoryName);
        System.out.printf("\tAmount budgeted: $%.2f%n", amountBudgeted);
        System.out.printf("\tAmount spent: $%.2f%n", amountSpent);
        System.out.printf("\tBudget left: $%.2f%n", getRemainingBudget());
    }
}