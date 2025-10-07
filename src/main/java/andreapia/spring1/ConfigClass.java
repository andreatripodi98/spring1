package andreapia.spring1;

import andreapia.spring1.entities.*;
import andreapia.spring1.enums.StatoTavoli;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigClass {

    @Bean(name = "MenuTotale")
    public Menu menuTotale(List<Pizza> pizza, List<Topping> toppings, List<Drink> drink) {
        return new Menu(pizza, toppings, drink);
    }

    @Bean(name = "PizzaMargherita")
    public Pizza pizzaMargherita() {
        return new Pizza("Pizza Margherita", 1004, 4.99);

    }

    @Bean(name = "PizzaHawaii")
    public Pizza pizzaHawaii() {
        return new Pizza("Hawaiian Pizza", 1024, 6.49);
    }

    @Bean(name = "PizzaSalami")
    public Pizza pizzaSalami() {
        return new Pizza("Salami Pizza", 1160, 5.99);
    }

    @Bean(name = "Cheese")
    public Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean(name = "Ham")
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(name = "Onions")
    public Topping onions() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean(name = "Pineapple")
    public Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(name = "Salami")
    public Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade(0.33l)", 128, 1.29);
    }

    @Bean
    public Drink water() {
        return new Drink("Water(0.5l)", 0, 1.29);
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine(0.75l, 13%)", 128, 1.29);
    }

    @Bean
    public Tavolo tavolo() {
        return new Tavolo(2, 4, StatoTavoli.OCCUPATO);
    }

}
