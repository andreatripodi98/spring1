package andreapia.spring1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Bevande {
    private String bevande;
    protected long calories;
    protected double price;

    @Override
    public String toString() {
        return "Bevande{" +
                "bevande='" + bevande + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
