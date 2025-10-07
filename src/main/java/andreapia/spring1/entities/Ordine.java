package andreapia.spring1.entities;

import andreapia.spring1.enums.StatoOrdine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ordine {
    @Autowired
    private Tavolo tavolo;


    @Value("${costo.coperto}")
    private double costoCoperto;

    private StatoOrdine statoOrdine;
    private double somma;

    public Ordine(Tavolo tavolo, double costoCoperto, StatoOrdine statoOrdine, double somma) {
        this.tavolo = tavolo;
        this.costoCoperto = costoCoperto;
        this.statoOrdine = statoOrdine;
        this.somma = somma;
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }

    public void setCostoCoperto(double costoCoperto) {
        this.costoCoperto = costoCoperto;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public double getSomma() {
        return somma;
    }


    public void setSomma(double somma) {
        this.somma = somma;
    }


    public double totale() {
        return somma + (tavolo.getNumeroCorperti() * costoCoperto);
    }

    @Override
    public String toString() {
        return "Ordine " +
                "tavolo n: " + tavolo +
                ", Stato ordine: " + statoOrdine +
                ", Totale + coperto: " + somma + " + " + costoCoperto;
    }
}
