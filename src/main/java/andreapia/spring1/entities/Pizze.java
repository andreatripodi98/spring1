package andreapia.spring1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Pizze {
    private String pizze;
    protected long calories;
    protected double price;



    @Override
    public String toString() {
        return "Pizze{" +
                "pizze='" + pizze + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
