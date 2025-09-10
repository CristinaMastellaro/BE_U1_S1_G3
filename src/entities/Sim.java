package entities;

import java.util.Arrays;

public class Sim {

    // Attributi
    private long numTel;
    private double creditoDisponibile;
    private Chiamata[] ultimeCinqueChiamate;

    // Costruttore
    public Sim(long numTel) {
        this.numTel = numTel;
        creditoDisponibile = 0;
        ultimeCinqueChiamate = new Chiamata[5];
    }

    // Metodi

    // Getters

    public long getNumTel() {
        return numTel;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public Chiamata[] getUltimeCinqueChiamate() {
        return ultimeCinqueChiamate;
    }

    // Setters


    public void setNumTel(long numTel) {
        if (Long.toString(numTel).length() != 10) System.out.println("Il numero selezionato non ha la lunghezza giusta");
        else this.numTel = numTel;
    }

    public void setCreditoDisponibile(double creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public void setUltimeCinqueChiamate(Chiamata[] ultimeCinqueChiamate) {
        this.ultimeCinqueChiamate = ultimeCinqueChiamate;
    }

    // Altri metodi

    @Override
    public String toString() {
        return "Sim{" +
                "numTel=" + numTel +
                ", creditoDisponibile=" + creditoDisponibile +
                "€, ultimeCinqueChiamate=" + Arrays.toString(ultimeCinqueChiamate) +
                '}';
    }

}
