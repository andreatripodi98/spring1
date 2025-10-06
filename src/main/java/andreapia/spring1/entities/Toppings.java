package andreapia.spring1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Toppings {
    private String toppings;
    protected long calories;
    protected double price;

    @Override
    public String toString() {
        return "Toppings{" +
                "toppings='" + toppings + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
