package BudgetingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> budgets = new ArrayList<>();
        boolean flag = true;
        Scanner keyboard = new Scanner(System.in);
        String input;

        while (flag) {
            System.out.println("Press Q at any point to quit.");
            if (budgets.isEmpty()) System.out.println("There are no budgets registered.");

            for (Account account : budgets) {
                System.out.println(account.getCategoryName());
                System.out.println(account.getRemainingBudget());
            }
            System.out.println("What operation would you like to do?");
            System.out.println("1. Add budget");
            System.out.println("2. Remove budget");
            System.out.println("3. Display budgets");
            System.out.println("4. Add expense to a budget");
            System.out.println("Q. Exit\n");
            input = keyboard.nextLine();
            if (input.equalsIgnoreCase("q")) {
                flag = false;
            }

        }
    }
}
