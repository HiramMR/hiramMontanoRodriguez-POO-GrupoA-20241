import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String name="";
        String title="";
        User user = new User(name);
        Book book = new Book(title);


        while (true){

            System.out.println("1. Agregar usuario");
            System.out.println("2. Agregar libro");
            System.out.println("3. Rentar libro");
            System.out.println("4. Mostrar todos los usuarios");
            System.out.println("5. Mostrar todos los libros");
            System.out.println("6. Mostrar todos los usuarios que hayan rentado al menos un libro");
            System.out.println("7. Mostrar libros que no han sido rentados");
            System.out.println("8. Mostrar libros que han sido rentados");
            System.out.println("9. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                System.out.println("Ingrese el nombre del usuario: ");
                scanner.nextLine();
                 name = scanner.nextLine();
                 user = new User(name);
                library.agregarUsuario(user);
                System.out.println("Usuario agregado.\n");

                break;

                case 2:
                System.out.println("Ingrese el titulo del libro: ");
                scanner.nextLine();
                 title = scanner.nextLine();
                book = new Book(title);
                library.agregarLibro(book);
                System.out.println("Libro agregado.\n");
                break;

                case 3:
                System.out.println("Ingrese el usuario que rentará el libro: ");
                scanner.nextLine();
                String nameRent = scanner.nextLine();
                System.out.println("Ingrese el libro que rentará: ");
                String titleRent = scanner.nextLine();
                library.rentarLibro(nameRent, titleRent);
                break;

                case 4:
                System.out.println("******Usuarios de la libreria******");
                if (library.getUsers().isEmpty()) {
                    System.out.println("No hay usuarios registrados\n");
                }else{
                    library.mostrarUsuarios();
                }
                    
                break;

                case 5:
                System.out.println("******Libros de la libreria******");
                if (library.getBooks().isEmpty()) {
                    System.out.println("No hay libros registrados\n");
                }else{
                    library.mostrarLibros();
                }
                break;

                case 6:
                System.out.println("******Usuarios que han rentado al menos un libro******");
                if (library.getUsers().isEmpty()) {
                    System.out.println("No hay usuarios registrados\n");
                }else{
                    library.mostrarUsuariosQueHanRentado();
                }
                break;

                case 7:
                System.out.println("******Libros no rentados******");
                if (library.getBooks().isEmpty()) {
                    System.out.println("No hay libros registrados\n");
                }else{
                    library.mostrarLibrosNoRentados();
                }
                   
                break;

                case 8:
                System.out.println("******Libros rentados******");
                if (library.getBooks().isEmpty()) {
                    System.out.println("No hay libros registrados\n");
                }else{
                    library.mostrarLibrosRentados();
                }
                break;

                case 9:
                System.out.println("Fin.");
                System.exit(0);
                break;


            }




        }

    }
}
