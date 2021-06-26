import java.util.ArrayList;

public class Game {

    private String name;
    private int price;
    private String genre;

    public Game(String name, int price, String genre){
        this.name = name;
        this.price = price;
        this.genre = genre;
    }

    public int korting() {
        return this.price / 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
