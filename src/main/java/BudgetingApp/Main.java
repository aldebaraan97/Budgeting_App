package BudgetingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> budgets = new ArrayList<>();
        Account account;
        Tracker tracker = new Tracker();
        boolean flag = true;
        Scanner keyboard = new Scanner(System.in);
        String input;

        while (flag) {
            System.out.println("----- Welcome to The Budgeting App by Kristina & Alde -----");
            System.out.println("Press Q at any point to quit.");
            if (budgets.isEmpty()) {
                System.out.println("There are no budgets registered.");
                System.out.println("Enter 1 to add new budget or \"q\" to exit.");
                System.out.print("Enter your choice: ");
                input = keyboard.nextLine();
                if (input.equalsIgnoreCase("q")) flag = false;
                else if (!input.equalsIgnoreCase("1"))
                    System.out.println("Invalid input. Try again.");
                else {
                    System.out.println("Enter budget name: \n");
                    String budgetName = keyboard.nextLine();
                    System.out.println("Enter budget amount: \n");
                    double budgetAmount = keyboard.nextDouble();
                    budgets.add(new Account(budgetName, budgetAmount));
                }
            }
            else {
                for (Account budget : budgets) budget.displayDetails();
                System.out.println("What operation would you like to do?");
                System.out.println("1. Add budget");
                System.out.println("2. Remove budget");
                System.out.println("3. Open budget options");
                System.out.println("4. Add expense to a budget");
                System.out.println("Q. Exit\n");
                System.out.print("Enter your choice: ");

                input = keyboard.nextLine();
                if (input.equalsIgnoreCase("q")) flag = false;

                switch(input) {
                    case "1" -> {
                        System.out.println("Enter budget name: \n");
                        String budgetName = keyboard.nextLine();
                        System.out.println("Enter budget amount: \n");
                        double budgetAmount = keyboard.nextDouble();
                        budgets.add(new Account(budgetName, budgetAmount));
                    }
                    case "2" -> {
                        int budgetToBeRemoved;
                        System.out.println("Active budgets: \n");
                        for (Account budget : budgets) System.out.println((budgets.indexOf(budget) + 1) + " " + budget.getCategoryName());
                        System.out.println("Enter budget option: \n");
                        budgetToBeRemoved = keyboard.nextInt();
                        keyboard.nextLine();
                        Account budget = budgets.get(budgetToBeRemoved - 1);
                        budgets.remove(budgetToBeRemoved - 1);
                        System.out.println("Budget " + budget.getCategoryName() + " removed.");
                    }
                    case "3" -> {
                        System.out.println("Active budgets: ");
                        for (Account budget : budgets) System.out.println((budgets.indexOf(budget) + 1) + " " + budget.getCategoryName());
                        System.out.println("""
                                    What operation would you like to do?
                                    1. Change budget name
                                    2. Change amount budgeted
                                    3. Change amount spent
                                    4. Go back
                                    Q Exit program
                                    """);
                        System.out.print("Enter your choice: ");
                        input = keyboard.nextLine();

                        if (input.equalsIgnoreCase("q")) flag = false;
                        if (input.equalsIgnoreCase("4")) {continue;}
                        else {

                            switch (input) {
                                case "1" -> {
                                    account = budgets.get(Integer.parseInt(input) - 1);
                                    System.out.println("Enter new budget name: \n");
                                    input = keyboard.nextLine();
                                    account.setCategoryName(input);
                                }
                                case "2" -> {
                                    account = budgets.get(Integer.parseInt(input) - 1);
                                    System.out.println("Enter new amount budgeted: \n");
                                    input = keyboard.nextLine();
                                    account.setAmountBudgeted(Double.parseDouble(input));
                                }
                                case "3" -> {
                                    account = budgets.get(Integer.parseInt(input) - 1);
                                    System.out.println("Enter new amount spent: \n");
                                    input = keyboard.nextLine();
                                    account.setAmountSpent(Double.parseDouble(input));
                                }
                                default -> System.out.println("Invalid option.");
                            }
                        }
                    }
                    case "4" -> {
                        int budgetToAddExpense;
                        System.out.println("Active budgets: \n");
                        for (Account budget : budgets) System.out.println((budgets.indexOf(budget) + 1) + " " + budget.getCategoryName());
                        System.out.println("Enter budget option: \n");
                        budgetToAddExpense = keyboard.nextInt();
                        keyboard.nextLine();
                        Account budget = budgets.get(budgetToAddExpense - 1);
                        System.out.println("Enter expense amount: \n");
                        input = keyboard.nextLine();
                        budget.addExpense(Double.parseDouble(input));
                    }
                    default -> System.out.println("Invalid option.");
                }
            }
        }
    }
}
