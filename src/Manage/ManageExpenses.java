package Manage;
import expenses.Expense;
import java.util.*;

public class ManageExpenses {
    Scanner sc = new Scanner(System.in);
    List<Expense> expensive = new ArrayList<>();

    public void addExpense(){
        System.out.println("Welcome to the area to add expenses");
        System.out.println("please write the value: ");

        Double value = sc.nextDouble();
        sc.nextLine();

        System.out.println("write the description: ");

        String description = sc.nextLine();

        System.out.println("Write the category");

        String category = sc.nextLine();
        Expense expense = new Expense(value, description,category);
        expensive.add(expense);
    }

    public void listExpense() {
        System.out.println("Printing the list, please wait.");
        System.out.println(expensive);

        // acho que nao deveria esta aqui, mas sim na classe Menu.
        System.out.println("do you want to sort the list?");
        int option;
        do{
            System.out.println("[1] - yes");
            System.out.println("[2] - no");
            option =sc.nextInt();
            break;
        } while(option != 2);

        if (option == 1) {
            filterByCategory();
        } else {
            System.out.println("invalid option");
        }
        // ate aqui.
    }

    public void filterByCategory() {



    }

    public void calculateTotal(){
        System.out.println("Funcionand");
    }


}
