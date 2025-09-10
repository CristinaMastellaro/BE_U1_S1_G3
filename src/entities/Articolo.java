package entities;

public class Articolo {

    // Attributi
    private final long articleCode;
    private String description;
    private double price;
    private int piecesInWarehouse;

    // Costruttore
    public Articolo(long articleCode, String description, double price, int piecesInWarehouse) {
        this.articleCode = articleCode;
        this.description = description;
        this.piecesInWarehouse = piecesInWarehouse;

        if (price < 0) System.out.println("Prezzo invalido");
        else this.price = price;
    }

    // Metodi

    public double getPrice() {
        return price;
    }

    public long getArticleCode() {
        return articleCode;
    }

    public String getDescription() {
        return description;
    }

    public int getPiecesInWarehouse() {
        return piecesInWarehouse;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        if (price < 0) System.out.println("Prezzo invalido");
        else this.price = price;
    }

    public void setPiecesInWarehouse(int piecesInWarehouse) {
        this.piecesInWarehouse = piecesInWarehouse;
    }
}
