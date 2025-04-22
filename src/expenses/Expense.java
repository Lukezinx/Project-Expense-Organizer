package expenses;

import java.time.LocalDateTime;

public class Expense {
    private Double value;
    private String description;
    private String category;
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

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Expense{" +
                "value=" + value +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

}
