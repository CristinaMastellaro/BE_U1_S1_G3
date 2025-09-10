package es1;

import entities.Rettangolo;
import static entities.Rettangolo.stampaDueRettangoli;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(-8, 9);
        Rettangolo r2 = new Rettangolo(5, 17);

        r1.stampaRettangolo();
        r2.stampaRettangolo();

        stampaDueRettangoli(r1, r2);
    }
}
