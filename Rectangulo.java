import java.util.Scanner;

public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    double base;
    double height;
    
    public Rectangulo(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double Area(){
        return base*height;
        
    }

    public int Area(int base, int height){
        return base*height;
        
    }

    public double Perim(){
        return 2*(base+height);
        
    }

    public int Perim(int base, int height){
        return 2*(base+height);
        
    }

}
