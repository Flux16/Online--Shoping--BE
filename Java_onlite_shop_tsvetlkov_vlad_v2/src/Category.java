import java.util.ArrayList;
import java.util.List;

public abstract class Category {
    protected int id;
    protected String title;
    protected String descripton;

    private static int nextId = 1;
    private static List<Category> categories = new ArrayList<>();

    public Category() { }

    public Category( int id, String title, String descripton){
        this.id = nextId++;
        this.title = title;
        this.descripton = descripton;
    }
        public abstract void showInfo();
        public abstract String getType();

        public int getId() {
            return  id;
        }
        public String getTitle() {
            return  title;
        }
        public String getDestription() {
            return descripton;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public void setDescripton ( String descripton){
            this.descripton = descripton;
        }
        public static void  addCategory(Category category) {
            categories.add(category);
            System.out.println(category.getTitle());
        }
        public static void showCategories() {
            if (categories.isEmpty()) {
                System.out.println("пустой список");
                return;
            }
        }
    }

