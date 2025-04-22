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
    }


    public void OrganizedList() {
        System.out.println("Sort by:");
        System.out.println("[1] Value");
        System.out.println("[2] Description");
        System.out.println("[3] Category");

        int choice = sc.nextInt();
        sc.nextLine();

        OrganizedList organization = new OrganizedList();
        organization.sort(expensive, choice);
    }


    public void filterByCategory() {
        System.out.println("funcionando");

    }

    public void calculateTotal(){
        System.out.println("Teste");
        Double total;
        total = 0.0;
        for(Expense e : expensive){
            System.out.println("Teste2");
            total += e.getValue();
        }
        // rever depois

    }

}
