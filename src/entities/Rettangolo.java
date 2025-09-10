package entities;

public class Rettangolo {

    // Attributi
    private int altezza;
    private int base;

    // Costruttore
    public Rettangolo(int h, int b) {
        if (h < 0) System.out.println("L'altezza selezionata non è valida");
        else altezza = h;

        if (b < 0) System.out.println("La base selezionata non è valida");
        else base = b;
    }

    // Metodi

    // Getters


    public int getAltezza() {
        return altezza;
    }

    public int getBase() {
        return base;
    }

    // Setters


    public void setAltezza(int altezza) {
        if (altezza < 0) System.out.println("L'altezza selezionata non è valida");
         else this.altezza = altezza;
    }

    public void setBase(int base) {
        if (base < 0) System.out.println("La base selezionata non è valida");
        else this.base = base;
    }

    // Altri metodi

    public int getPerimeter() {
        return (altezza+base)*2;
    }

    public int getArea() {
        return altezza*base;
    }

    public void stampaRettangolo() {
        System.out.println("\nIl perimetro del rettangolo è " + this.getPerimeter());
        System.out.println("L'area del rettangolo è " + this.getArea());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        r1.stampaRettangolo();
        r2.stampaRettangolo();
        System.out.println("\nLa somma dei perimetri è " + (r1.getPerimeter() + r2.getPerimeter()));
        System.out.println("La somma delle aree è " + (r1.getArea() + r2.getArea()));
    }

}
