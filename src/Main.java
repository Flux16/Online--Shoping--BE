public class Main {
    public static void main(String[] args) {
        Catalog p1 = new Catalog(1, "телефон", 1451);
        Catalog p2 = new Catalog(12, "провод", 291);

        System.out.println(p1.getId()+ " " + p1.getTitle()+ " " + p1.getPrice()+ " ");
        System.out.println(p2.getId()+ " " + p2.getTitle()+ " " + p2.getPrice()+ " ");
    }
}


