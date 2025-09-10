package entities;

public class Carrello {
    private final String clientCode;
    private Articolo[] articles;
    private double totalSpent;

    // Costruttore
    public Carrello(String clientCode, Articolo[] articles) {
        this.clientCode = clientCode;
        this.articles = articles;
        for (Articolo article : articles) {
            this.totalSpent += article.getPrice();
        }
    }

    // Metodi

    // Getters


    public String getClientCode() {
        return clientCode;
    }

    public Articolo[] getArticles() {
        return articles;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    // Setters

    public void setArticles(Articolo[] articles) {
        this.articles = articles;
    }

    public void setTotalSpent(double totalSpent) {
        this.totalSpent = totalSpent;
    }
}
