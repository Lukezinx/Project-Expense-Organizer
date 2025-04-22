package Menu;
import Manage.ManageExpenses;
import java.util.*;

public class Menu {
    ManageExpenses manage = new ManageExpenses();
    Scanner sc = new Scanner(System.in);
    int option;

    public void menu() {
        do{
            showOptions();
            option = sc.nextInt();
            processOption(option);


        } while(option != 0);
    }

    private void showOptions() {
        System.out.println("Select one option");
        System.out.println();
        System.out.println("[1] - Add expenses");
        System.out.println("[2] - List expenses");
        System.out.println("[3] - calculate total value in list");

        System.out.println("[0] - Exit");
    }

    public void processOption(int option) {
        switch (option) {
            case 1:
                manage.addExpense();
                System.out.println("Expense Add!!");
                menu();
                break;

            case 2:
                manage.listExpense();
                System.out.println();
                System.out.println("do you want to sort the list?");
                int chose;
                do{
                    System.out.println("[1] - yes");
                    System.out.println("[2] - no");
                    chose = sc.nextInt();
                    break;
                } while(chose != 2);

                if (chose == 1) {
                    manage.OrganizedList();
                } else {
                    System.out.println("invalid option");
                }
                break;

            case 3:
                manage.calculateTotal();
                break;

            case 0:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("invalid option");

        }
    }
}
