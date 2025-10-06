package andreapia.spring1;

import andreapia.spring1.entities.Bevande;
import andreapia.spring1.entities.Menu;
import andreapia.spring1.entities.Pizze;
import andreapia.spring1.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Driver;
import java.util.List;

@Configuration
public class ConfigClass {

    @Bean(name = "MenuTotale")
    public Menu menuTotale(List<Pizze> pizze, List<Toppings> toppings, List<Bevande> bevande){
        return new Menu(pizze, toppings, bevande);
    }

    @Bean
    public Pizze pizzaMargherita() {
        return new Pizze("Pizza Margherita", 1004, 4.99);

    }

    @Bean
    public Pizze pizzaHawaii() {
        return new Pizze("Hawaiian Pizza", 1024, 6.49);
    }

    @Bean
    public Pizze pizzaSalami() {
        return new Pizze("Salami Pizza", 1160, 5.99);
    }

    @Bean
    public Toppings cheese() {
        return new Toppings("Cheese", 92, 0.69);
    }

    @Bean
    public Toppings ham() {
        return new Toppings("Ham", 35, 0.99);
    }

    @Bean
    public Toppings onions() {
        return new Toppings("Onions", 22, 0.69);
    }

    @Bean
    public Toppings pineapple() {
        return new Toppings("Pineapple", 24, 0.79);
    }

    @Bean
    public Toppings salami() {
        return new Toppings("Salami", 86, 0.99);
    }

    @Bean
    public Bevande lemonade() {
        return new Bevande("Lemonade(0.33l)", 128, 1.29);
    }

    @Bean
    public Bevande water() {
        return new Bevande("Water(0.5l)", 0, 1.29);
    }

    @Bean
    public Bevande wine() {
        return new Bevande("Wine(0.75l, 13%)", 128, 1.29);
    }

}
