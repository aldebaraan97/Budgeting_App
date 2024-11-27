package BudgetingApp;
import java.util.ArrayList;

public class Tracker
{
    //fields
    private ArrayList<Account> categories;

    //constructor
    public Tracker()
    {
        categories = new ArrayList<>();
    }

    //methods
    public void addCategory(String name, double amount)
    {
        Account category = new Account(name, amount);
        categories.add(category);
        System.out.printf("Category %s added.", name);
    }
    public void addTransaction(String name, double amount)
    {
        for(int i = 0; i < categories.size(); i++)
        {
            Account category = categories.get(i);
            if (category.getCategoryName().equalsIgnoreCase(name))
            {
                category.addExpense(amount);
                System.out.printf("Added $%f expense to %s category.", amount, name);
            }
        }
    }


    //display categories method

}

