package BudgetingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This is a github test
        ArrayList<Account> budgets = new ArrayList<>();
        Account account;
        //Tracker tracker = new Tracker();
        boolean flag = true;
        Scanner keyboard = new Scanner(System.in);
        String input;

        while (flag) {
            System.out.println("""
                    ----- Welcome to The Budgeting App by Kristina & Alde -----
                    Press Q at any point to quit.
                    """);
            // Default interface when no account have been registered
            if (budgets.isEmpty()) {
                System.out.println("""
                        There are no budgets registered.
                        Enter 1 to add new budget or \"q\" to exit.
                        """);
                System.out.print("Enter your choice: ");
                input = keyboard.nextLine();

                if (input.equalsIgnoreCase("q")) flag = false;
                else if (input.equals("1"))
                {
                    System.out.println("Enter budget name: ");
                    String budgetName = keyboard.nextLine();
                    System.out.println("Enter budget amount: ");
                    double budgetAmount = keyboard.nextDouble();
                    keyboard.nextLine();
                    budgets.add(new Account(budgetName, budgetAmount));
                    System.out.println("Budget added successfully!");
                }
                else System.out.println("Invalid input. Try again.");
            }
            // Interface with budget options
            else {
                System.out.println("Active budgets:");
                for (Account budget : budgets) budget.displayDetails();
                for (int i = 0; i < budgets.size(); i++)

                System.out.println("""
                        What operation would you like to do?
                        1. Add budget
                        2. Remove budget
                        3. Open budget options
                        4. Add expense to a budget
                        Q. Exit
                        """);
                System.out.print("Enter your choice: ");
                input = keyboard.nextLine();
                Account selectedBudget = new Account();

                switch(input.toLowerCase()) {
                    case "q" -> flag = false;
                    case "1" -> {
                        System.out.print("Enter budget name: ");
                        String budgetName = keyboard.nextLine();
                        System.out.print("Enter budget amount: ");
                        double budgetAmount = keyboard.nextDouble();
                        budgets.add(new Account(budgetName, budgetAmount));
                    }
                    case "2" -> {
                        System.out.print("Enter the number of the budget to remove: ");
                        int budgetToBeRemoved = keyboard.nextInt() - 1;
                        if (budgetToBeRemoved >= 0 && budgetToBeRemoved < budgets.size()) {
                            Account removed = budgets.remove(budgetToBeRemoved);
                            System.out.println("Budget " + removed.getCategoryName() + " removed successfully!");
                        } else {
                            System.out.println("Invalid index. Try again.");
                        }
                    }
                    case "3" -> {
                        System.out.println("Active budgets: ");
                        for (Account budget : budgets) System.out.println((budgets.indexOf(budget) + 1) + " " + budget.getCategoryName());
                        System.out.print("Enter budget number to open budget options: ");
                        int budgetOption = keyboard.nextInt() - 1;
                        if(budgetOption >= 0 && budgetOption < budgets.size())
                        {
                            selectedBudget = budgets.get(budgetOption);
                        }
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
                                    System.out.print("Enter new budget name: ");
                                    input = keyboard.nextLine();
                                    selectedBudget.setCategoryName(input);
                                    System.out.println("Budget name updated!");
                                }
                                case "2" -> {
                                    System.out.print("Enter new amount budgeted: ");
                                    input = keyboard.nextLine();
                                    selectedBudget.setAmountBudgeted(Double.parseDouble(input));
                                    System.out.println("Budgeted amount updated!");
                                }
                                case "3" -> {
                                    System.out.print("Enter new amount spent: ");
                                    input = keyboard.nextLine();
                                    selectedBudget.setAmountSpent(Double.parseDouble(input));
                                    System.out.println("Amount spent updated!");
                                }
                                default -> System.out.println("Invalid option. try again.");
                            }
                        }
                    }
                    case "4" -> {
                        int budgetToAddExpense;
                        System.out.println("Active budgets: ");
                        for (Account budget : budgets) System.out.println((budgets.indexOf(budget) + 1) + " " + budget.getCategoryName());
                        System.out.print("Enter budget number to add an expense: ");
                        budgetToAddExpense = keyboard.nextInt() - 1;
                        keyboard.nextLine();
                        if (budgetToAddExpense > budgets.size() || budgetToAddExpense < 0) System.out.println("Invalid amount. Try again.");
                        else{
                                selectedBudget = budgets.get(budgetToAddExpense);
                                System.out.print("Enter expense amount: ");
                                input = keyboard.nextLine();
                                selectedBudget.addExpense(Double.parseDouble(input));
                                System.out.println("Expense added successfully!");
                            }
                    }
                    default -> System.out.println("Invalid option. Try again.");
                }
            }
        }
        System.out.println("Thank you for using our budgeting app!");
    }
}
