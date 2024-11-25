package BudgetingApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Account class needs a constructor that takes no arguments and
        // initializes an account with "default" for name and $0 for balance
        ArrayList<Account> accounts = new ArrayList<>();
        double depositAmount = 0;
        double netWorth = 0;

        // Default accounts named default and with $0 balance
        Account credit = new Account("Credit", -500);
        Account debit = new Account("Debit", 500);
        Account savings = new Account("Savings", 500);

        accounts.add(credit);
        accounts.add(debit);
        accounts.add(savings);

        // we need a deposit/withdraw methods that take a double as an argument
        credit.setAmountBudgeted(1000);
        credit.addExpense(500);

        // This static method will make a withdrawal from debit and then that same amount
        // will be deposited into the target account.
        // This method should take an account type and a double type as arguments.
//        debit.transfer(savings, depositAmount);

        // Calculates net worth by adding the balance of each account
        for (Account account : accounts) {
           netWorth += account.getAmountBudgeted();
           netWorth -= account.getAmountSpent();
        }

        System.out.println("Enter 'Q' at any moment to quit.");
        System.out.println("Net worth is: " + netWorth);

        // geName() should return a String with the name of the account
        for (Account account : accounts) {
            System.out.println(account.getCategoryName() + " balance is " + account.getAmountBudgeted());
        }
        System.out.println("What operation do you want to today?: ");
    }
}
