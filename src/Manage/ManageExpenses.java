package Manage;
import expenses.Expense;
import java.util.*;

public class ManageExpenses {

    Scanner sc = new Scanner(System.in);
    List<Expense> expensive = new ArrayList<>();

    public void addExpense(){
        Double value = null;
        System.out.println("Welcome to the area to add expenses");
        System.out.println("please write the value: ");

        try {
            value = sc.nextDouble();
            sc.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid value. Please enter a number.");
            sc.nextLine();
        }


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


    public void organizedList() {
        int choice = 0;
        System.out.println("Sort by:");
        System.out.println("[1] Value");
        System.out.println("[2] Description");
        System.out.println("[3] Category");

        try {
            choice = sc.nextInt();
            sc.nextLine();
        }
        catch (InputMismatchException e ){
            System.out.println("Invalid value. Please enter a number.");
            sc.nextLine();
        }
        OrganizedList organization = new OrganizedList();
        organization.sort(expensive, choice);
    }


    public void filterByCategory() {
        boolean found = false;
        System.out.println("write the category name");
        String categoryName = sc.nextLine();
        for(Expense e : expensive){
            if(e.getCategory().equalsIgnoreCase(categoryName)){
                System.out.println(e);
                found = true;
            }

        }

        if (!found) {
            System.out.println("no categories found!");
        }

    }

    public void calculateTotal(){
        Double total;
        total = 0.0;
        for(Expense e : expensive){
            total += e.getValue();
        }

        System.out.printf("Total value: %.2f %n",total);
    }

}
