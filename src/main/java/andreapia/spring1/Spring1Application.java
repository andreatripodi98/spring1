package andreapia.spring1;

import andreapia.spring1.entities.Menu;
import andreapia.spring1.entities.Pizze;
import andreapia.spring1.entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring1Application {

    public static void main(String[] args) {

        SpringApplication.run(Spring1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
        Menu menu1 = (Menu) ctx.getBean("MenuTotale");
        System.out.println(menu1);
        Pizze pizza1 = (Pizze) ctx.getBean("PizzaMargherita");
        Toppings topping = (Toppings) ctx.getBean("Ham");
        System.out.println(pizza1 + " + " + topping);




    }

}
