package BudgetingApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Account class needs a constructor that takes no arguments and
        // initializes an account with "default" for name and $0 for balance
        ArrayList<Account> accounts = new ArrayList<>();
        double depositAmount;

        // Default accounts named default and with $0 balance
        Account credit = accounts.getFirst();
        Account debit = accounts.get(1);
        Account savings = accounts.get(2);

        // we need a deposit/withdraw methods that take a double as an argument
        credit.deposit(1000);
        credit.withdraw(500);

        // This method will make a withdrawal from debit and then that same amount
        // will be deposited into the target account.
        // This method should take an account type and a double type as arguments.
        debit.transfer(depositAmount, savings);


    }
}
