public class Person {

    String name;
    int age;
    String genre;

    public Person(String name, int age, String genre){
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public void printPerson(){
        System.out.println("******* Part 1 *******"+"\nName: "+name+"\nAge: "+age+"\nGenre: "+genre+"\n**********************");
    }
    public void printPersonE(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nGenre: "+genre+"\n**********************");
    }

}