package BudgetingApp;

public class Tracker
{
    //fields
    //budget categories array "categories"
    // array of all transactions "transactions"

    //constructor
    public Tracker()
    {
        // initialize the 2 arrays
    }

    //methods
    public void addCategory(String name, double amount)
    {
        Account category = new Account(name, amount);
        //categories.add(category);
        System.out.printf("Category %s added.", name);
    }
    public void addTransaction(String name, String type, double amount)
    {
        //finds category by name.
        //creates a new transaction and adds it to the transactions list
        //updates the spentAmount in the category
        //displays an error if the category is not found
    }

    //private Account findCategoryByName(String name)
        //loop through categories
   // for (int i = 0; i < categories.length; i++)
    {
        //if(category name == name)
        {
            //return category;
        }
        //return null
    }

    //display all category details()
    // display all transaction details()
}

