package Manage;
import expenses.Expense;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("funcionando");
    }

    public void filterByCategory() {
        System.out.println("funcionando");
    }

    public void calculateTotal(){
        System.out.println("Funcionand");
    }


}
