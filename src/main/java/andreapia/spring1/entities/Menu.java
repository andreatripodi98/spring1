package andreapia.spring1.entities;

import lombok.*;

import java.util.List;


@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    List<Pizza> pizze;
    List<Topping> toppings;
    List<Drink> drinks;

    public void printMenu() {
        System.out.println("----- EPI MENU-----");
        System.out.println("Pizze");
        this.pizze.forEach(System.out::println);
        System.out.println();

        System.out.println("Toppings");
        this.toppings.forEach(System.out::println);
        System.out.println();

        System.out.println("Drinks");
        this.drinks.forEach(System.out::println);
        System.out.println();
    }
}
