package andreapia.spring1.entities;

import andreapia.spring1.enums.StatoTavoli;

import java.util.List;

public class Tavolo {
    private long numeroTavolo;
    private long numeroCoperti;
    private StatoTavoli statoTavoli;

    public Tavolo(long numeroTavolo, long numeroCoperti, StatoTavoli stato) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCoperti = numeroCoperti;
        this.statoTavoli = statoTavoli;
    }

    public StatoTavoli getStatoTavoli() {
        return statoTavoli;
    }

    public long getNumeroCorperti() {
        return numeroCoperti;
    }

    public void setNumeroCorperti(long numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public long getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(long numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public void setStatoTavoli(StatoTavoli statoTavoli) {
        this.statoTavoli = statoTavoli;
    }

    @Override
    public String toString() {
        return "Tavolo n: " + numeroTavolo +
                ", Numero Coperti: " + numeroCoperti +
                ", stato: " + statoTavoli;
    }
}
