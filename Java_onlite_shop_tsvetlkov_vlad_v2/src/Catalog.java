//этап 2 :
//шаг 1 : в классе продукт должен быть поле айди + титл + прайс и надо добавить descripton и продукст класс должен быть абстрактным
//в категории айди + титл + прайс и надо добавить descripton дожно быть
//должна быть автогенерация
//создаем новые наследники electonic and gardenitem
//еще новый класс мобайл-девайс является насделником электроник
//создаем несколько новых обьеков из новых классов
//в категории долден быть список арейлист(он должен сохранить список категорий)
//добавить в категрию 2 метода addкатегории show категорий
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
