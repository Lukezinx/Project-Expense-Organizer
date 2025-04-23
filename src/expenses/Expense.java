package expenses;


import java.util.Objects;

public class Expense {
    private  Double value;
    private  String description;
    private  String category;
//    private LocalDateTime date;

    //Colocar Id e data no futuro.
    //private static Integer id = 0;

    public Expense(Double value, String description, String category) {
        this.value = value;
        this.description = description;
        this.category = category;

    }

    public Double getValue() {
        return value;
    }


    public String getDescription() {
        return description;
    }


    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return Objects.equals(value, expense.value) && Objects.equals(description, expense.description) && Objects.equals(category, expense.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, description, category);
    }

    @Override
    public String toString() {
        return String.format("Description: %-15s | Category: %-10s | Value: R$ %.2f", description, category, value);
    }

}
