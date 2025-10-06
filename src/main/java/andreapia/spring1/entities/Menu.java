package andreapia.spring1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
public class Menu {
    List<Pizze> pizze;
    List<Toppings> toppings;
    List<Bevande> bevande;

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", toppings=" + toppings +
                ", bevande=" + bevande +
                '}';
    }
}
