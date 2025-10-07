package andreapia.spring1.entities;


import lombok.Getter;


import java.util.List;

@Getter

public class Pizza {
    private String name;

    protected long calories;
    protected double price;
    private List<Topping> toppings;

    public Pizza(String name, long calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.toppings = toppings;

    }


    @Override
    public String toString() {
        return "Pizze: " +
                name + '\'' +
                ", calorie: " + calories +
                ", prezzo: " + price;
    }
}
