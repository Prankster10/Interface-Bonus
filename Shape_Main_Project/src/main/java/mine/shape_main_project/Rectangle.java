package mine.shape_main_project;
public class Rectangle implements Shape {
    
    private double width;
    private double length;

    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getarea(){
    double area = width*length;   
    return area;}
    
    @Override
    public double getPerimeter(){     
    double perimeter = 2*(width + length);
    return perimeter;}
    
    public void Display(){
        System.out.println("The Area of the rectangle is: " + getarea()+"\n");    
        System.out.println("The Perimeter of the Rectangle is: " + getPerimeter()+"\n");    }   }
