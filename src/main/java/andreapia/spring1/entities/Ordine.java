package andreapia.spring1.entities;

import andreapia.spring1.enums.StatoOrdine;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ordine {
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numCoperti;
    private LocalTime oraAcquisizione;
    private List<Item> orderedProducts;
    private Tavolo tavolo;

    public Ordine(int numCoperti, Tavolo tavolo) {
        Random rndm = new Random();
        if (tavolo.getNumMaxCoperti() <= numCoperti)
            throw new RuntimeException("Numero coperti maggiore di numero massimo posti sul tavolo!");
        this.numeroOrdine = rndm.nextInt(1000, 100000);
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = LocalTime.now();
        this.orderedProducts = new ArrayList<>();
        this.tavolo = tavolo;
    }

    public void addItem(Item item) {
        this.orderedProducts.add(item);
    }

    public double getTotal() {
        return this.orderedProducts.stream().mapToDouble(Item::getPrice).sum() + (this.tavolo.getCostoCoperto() * this.numCoperti);
    }

    public void print() {
        System.out.println("id ordine--> " + this.numeroOrdine);
        System.out.println("stato--> " + this.statoOrdine);
        System.out.println("numero coperti--> " + this.numCoperti);
        System.out.println("ora acquisizione--> " + this.oraAcquisizione);
        System.out.println("numero tavolo--> " + this.tavolo.getNumTavolo());
        System.out.println("Lista: ");
        this.orderedProducts.forEach(System.out::println);
        System.out.println("totale--> " + this.getTotal());

    }
}
