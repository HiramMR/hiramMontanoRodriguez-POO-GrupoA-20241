import java.util.ArrayList;
public class User {
    private String name;
    private boolean rentedABook=false;
    private ArrayList<Library> books;

    public User(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public boolean isRentedABook() {
        return rentedABook;
    }

    public void setRentedABook(boolean rentedABook) {
        this.rentedABook = rentedABook;
    }

   

   
    
}
