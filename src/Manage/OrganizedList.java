package Manage;

import expenses.Expense;

import java.util.Comparator;
import java.util.List;

public class OrganizedList  {

    public void sort(List<Expense> list, int sortType) {
        switch (sortType) {
            case 1:
                list.sort(Comparator.comparing(Expense::getValue));
                break;
            case 2:
                list.sort(Comparator.comparing(Expense::getDescription));
                break;
            case 3:
                list.sort(Comparator.comparing(Expense::getCategory));
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }

        System.out.println("Sorted list:");
        for (Expense e : list) {
            System.out.println(e);
        }
    }


}
