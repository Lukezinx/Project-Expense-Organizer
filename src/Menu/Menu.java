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
            break;

        } while(option == 0);
    }

    private void showOptions() {
        System.out.println("Select one option");
        System.out.println();
        System.out.println("[1] - Add expenses");
        System.out.println("[2] - List expenses");
        System.out.println("[0] - Exit");
    }

    public void processOption(int option) {
        switch (option) {
            case 1:
                manage.addExpense();
                System.out.println("Expense Add!!");
                break;

            case 2:
                manage.listExpense();
                break;

            case 0:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("invalid option");

        }
    }
}
