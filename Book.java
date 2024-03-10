import java.util.Random;
public class Book {
    private String title;
    private boolean isRented = false;
    private int id=0;
    Random random = new Random();

    public Book(String title) {
        this.id = random.nextInt(1,1000);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }

    


    
}
