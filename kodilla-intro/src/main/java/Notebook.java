public class Notebook { // klasa (szablon)
    int weight;
    int price;
    int year;
    String colour; // zmienne

    public Notebook(int weight, int price, int year, String colour) {  // konstruktor (taka sama nazwa co klasy) i argumenty obiektów
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.colour = colour;
    }

    public void checkPrice() { // metoda (działanie obiektów)
        if (this.price < 600) { // instrukcja warunkowa
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }

    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This is very light notebook.");
        } else if (this.weight > 1000 && this.weight < 2000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }

    }

    public void yearAndPrice() {
        if (this.year > 2018 && this.price < 600) {
            System.out.println("This is the best notebook ever!");
        } else if (this.year > 2018 && this.price > 600 && this.price < 1000) {
            System.out.println("This is not a low price but OK");
        } else if (this.year > 2018 && this.price >= 1000) {
            System.out.println("Find something cheaper.");
        } else {
            System.out.println("This notebook is too old!");
        }
    }

    public void colour() {
        if (this.colour == "pink") {
            System.out.println("You are a man! Don't buy a pink notebook! Unless for your little sister.");
        } else {
            System.out.println("Thank God it's not pink...");
        }
    }

}