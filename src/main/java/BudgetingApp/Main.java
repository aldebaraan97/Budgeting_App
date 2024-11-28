package BudgetingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> budgets = new ArrayList<>();
        Tracker tracker = new Tracker();
        boolean flag = true;
        Scanner keyboard = new Scanner(System.in);
        String input;

        while (flag) {
            System.out.println("----- Welcome to Budgeting App -----");
            System.out.println("Press Q at any point to quit.");
            if (budgets.isEmpty()) System.out.println("There are no budgets registered.");

            for (Account account : budgets) {
                account.displayDetails();
            }
            System.out.println("What operation would you like to do?");
            System.out.println("1. Add budget");
            System.out.println("2. Remove budget");
            System.out.println("3. See budget details");
            System.out.println("4. Add expense to a budget");
            System.out.println("Q. Exit\n");
            System.out.print("Enter your choice: ");

            input = keyboard.nextLine();
            if (input.equalsIgnoreCase("q")) {
                flag = false;
            }
            switch(input) {
                case "1" -> {
                    System.out.println("Enter budget name: \n");
                    String budgetName = keyboard.nextLine();
                    System.out.println("Enter budget amount: \n");
                    double budgetAmount = keyboard.nextDouble();
                    budgets.add(new Account(budgetName, budgetAmount));
                }

                case "2" -> {
                    System.out.println("Enter budget name: \n");
                    String budgetName = keyboard.nextLine();
                    for (int i = 0, budgetsSize = budgets.size(); i < budgetsSize; i++) {
                        Account account = budgets.get(i);
                        if (account.getCategoryName().equalsIgnoreCase(budgetName))
                            budgets.remove(account);
                    }
                    System.out.println(budgetName + " removed from budgets list.");
                }

                case "3" -> {
                    if (budgets.isEmpty()) System.out.println("There are no budgets registered.");
                    else {
                        Scanner keyboard2 = new Scanner(System.in);
                        String input2 = "";
                        System.out.println("Enter budget name: \n");
                        String budgetName = keyboard.nextLine();
                        Account account = new Account();

                        for (int i = 0, budgetsSize = budgets.size(); i < budgetsSize; i++) {
                            if (budgets.get(i).getCategoryName().equalsIgnoreCase(budgetName))
                                account = budgets.get(i);
                            else System.out.println("Invalid budget name.");
                        }
                        if (account == null) System.out.println("Invalid budget name.");
                        else {
                            account.displayDetails();
                            System.out.println("""
                                    What operation would you like to do?
                                    1. Change budget name
                                    2. Change amount budgeted
                                    3. Change amount spent
                                    4. Go back
                                    Q Exit program
                                    """);
                            input2 = keyboard2.nextLine();
                            switch (input2) {
                                case "1" -> {
                                    System.out.println("Enter new budget name: \n");
                                    input = keyboard.nextLine();
                                    account.setCategoryName(input);
                                }
                                case "2" -> {
                                    System.out.println("Enter new amount budgeted: \n");
                                    input = keyboard.nextLine();
                                    account.setAmountBudgeted(Double.parseDouble(input));
                                }
                                case "3" -> {
                                    System.out.println("Enter new amount spent: \n");
                                    input = keyboard.nextLine();
                                    account.setAmountSpent(Double.parseDouble(input));
                                }
                                case "4" -> {
                                    continue;
                                }
                                case "q" -> flag = false;
                            }
                        }
                    }
                }
                case "4" -> {
                    Account account = new Account();
                    if (budgets.isEmpty()) System.out.println("There are no budgets registered.");
                    else {
                        System.out.println("Enter budget name: \n");
                        String budgetName = keyboard.nextLine();
                        for (int i = 0, budgetsSize = budgets.size(); i < budgetsSize; i++) {
                            if (budgets.get(i).getCategoryName().equalsIgnoreCase(budgetName))
                                account = budgets.get(i);
                            else System.out.println("Invalid budget name.");
                        }
                        System.out.println("Enter expense amount: \n");
                        input = keyboard.nextLine();
                        account.addExpense(Double.parseDouble(input));
                    }
                }
            }
        }
    }
}
