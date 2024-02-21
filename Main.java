
public class Main {

    public static void main(String[] args) {
        

        Person person1 = new Person("Hiram", 19, "Male");

        person1.printPerson();

        Person person2 = new Person("Maky", 18, "Female");

        person2.printPersonE();

        Person person3 = new Person("Maya", 12, "Female");

        person3.printPersonE();
        Person person4 = new Person("Laika", 11, "Female");

        person4.printPersonE();

///////////////////////////////////////////////////////////////////////////////////
        Book book = new Book();

        book.genre ="Science fiction";
        book.NumPages=320;
        book.lang="English";

        book.printBook();


        Book book2 = new Book();

        book2.genre2 ="Science fiction";
        book2.NumPages2=357;
        book2.lang2="English";

        book2.printBook2();


        Book book3 = new Book();

        book3.genre3 ="Science fiction";
        book3.NumPages3=180;
        book3.lang3="English";

        book3.printBook3();


        Book book4 = new Book();

        book4.genre4 ="Science fiction";
        book4.NumPages4=301;
        book4.lang4="English";

        book4.printBook4();
///////////////////////////////////////////////////////////////////////////////////
        Rectangle rectangle = new Rectangle(20, 60, 0, 0);
        rectangle.printDiv3();
        rectangle.areaPerimeter();
        rectangle.printRectangle();

        Rectangle rectangle2 = new Rectangle(30, 90, 0, 0);
        rectangle2.areaPerimeter();
        rectangle2.printRectangle();

        Rectangle rectangle3 = new Rectangle(5.5, 18.67, 0, 0);
        rectangle3.areaPerimeter();
        rectangle3.printRectangle();

        Rectangle rectangle4 = new Rectangle(130.55, 220, 0, 0);
        rectangle4.areaPerimeter();
        rectangle4.printRectangle();
    }
}