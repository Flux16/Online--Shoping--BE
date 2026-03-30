public class Catalog {
    int id;
    String title;
    double price;

    public Catalog(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    int getId() {
        return this.id;
    }

    String getTitle() {
        return this.title;
    }

    double getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

