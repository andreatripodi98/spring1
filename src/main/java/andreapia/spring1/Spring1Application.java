package andreapia.spring1;

import andreapia.spring1.entities.Menu;
import andreapia.spring1.entities.Ordine;
import andreapia.spring1.entities.Pizza;
import andreapia.spring1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring1Application {

    public static void main(String[] args) {

        SpringApplication.run(Spring1Application.class, args);

    }

}
