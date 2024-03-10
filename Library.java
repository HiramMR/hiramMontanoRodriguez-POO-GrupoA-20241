import java.util.ArrayList;
public class Library {
    private ArrayList<User> users;
    private ArrayList<Book> books;
    private ArrayList<Book> notRentedBooks;
    private ArrayList<Book> rentedBooks;

    public Library(){
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
            return users;
        
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> getNotRentedBooks(){
        return notRentedBooks;
    }

    public ArrayList<Book> getRentedBooks(){
        return rentedBooks;
    }


    public void agregarUsuario(User user){
        users.add(user);
    }

    public void agregarLibro(Book book){
        books.add(book);
        
    }

    public void mostrarUsuarios(){
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    public void mostrarLibros(){
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void mostrarLibrosNoRentados(){
        for (Book book : books) {
           if (book.isRented()== false) {
            System.out.println(book.getTitle());
           }
        }
    }

    
    public void mostrarLibrosRentados(){
        for (Book book : books) {
           if (book.isRented()== true) {
            System.out.println(book.getTitle());
           }
        }
    }

    public void mostrarUsuariosQueHanRentado(){
        for (User user : users) {
           if (user.isRentedABook()== true) {
            System.out.println(user.getName());
           }
        }
    }

    public void rentarLibro(String name, String title) {
        User user = null;
        Book book = null;
        boolean userFound = false;
        boolean bookFound = false;
    
        for (User u : users) {
            if (u.getName().equals(name)) {
                user = u;
                userFound = true;
                break;
            }
        }
    
       
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                book = b;
                bookFound = true;
                break;
            }
        }
    
        if (userFound && bookFound) {
            if (!book.isRented()) {
                book.setRented(true);
                user.setRentedABook(true);
                System.out.println("Libro rentado por el usuario " + name);
            } else {
                System.out.println("El libro ya está rentado.");
            }
        } else {
            System.out.println("El usuario o el libro no existen en la librería.");
        }
    }

}
