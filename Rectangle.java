public class Rectangle {
    double width;
    double height;
    double area;
    double perim;

    public void areaPerimeter(){
        area=width*height;
        perim=width+width+height+height;
    }

    public Rectangle(double width, double height, double area, double perim){
        this.area = area;
        this.perim = perim;
        this.width = width;
        this.height = height;
    }

    public void printDiv3(){
        System.out.println("\n\n******* Part 3 *******");
    }
    public void printRectangle(){
        System.out.println("Width: "+width+"\nHeight: "+height+"\nArea: "+area+"\nPerimeter: "+perim+"\n**********************");
    }

}
