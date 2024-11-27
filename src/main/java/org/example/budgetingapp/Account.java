package org.example.budgetingapp;

public class Account
{
    //fields
    private String categoryName;
    private double amountBudgeted;
    private double amountSpent;

    //constructor
    public Account(String name, double amountBudget)
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
    public void addToBudget(double amount) { amountBudgeted += amount; }
    public void setCategoryName(String name) {categoryName = name;}
    public void setAmountBudgeted(Double amount) {amountBudgeted = amount;}

    public void setAmountSpent(Double amount) {
        amountSpent = amount;
    }

    //methods
    public void addExpense(Double amount) {
        amountSpent += amount;
    }
    public void removeExpense(Double amount)
    {
        amountSpent -= amount;
    }
    public Double getRemainingBudget()
    {
        return amountBudgeted - amountSpent;
    }
    public void displayDetails()
    {
        System.out.printf("Category: %s%n", categoryName);
        System.out.printf("Amount budgeted: $%.2f%n", amountBudgeted);
        System.out.printf("Amount spent: $%.2f%n", amountSpent);
        System.out.printf("Budget left: $%.2f%n", getRemainingBudget());
    }

}