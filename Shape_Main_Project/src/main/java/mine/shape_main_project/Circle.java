package mine.shape_main_project;
public class Circle implements Shape,Comparable<Circle>{
    
    private double raduis;   
    
    public Circle() {}
    
    public Circle(double raduis) {
        this.raduis = raduis;}

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }
     @Override
    public double getarea(){
    double area = Math.PI* Math.pow(raduis, 2);   
    return area;}
    
    @Override
    public double getPerimeter(){     
    double perimeter = 2*Math.PI*raduis;
    return perimeter;}
    
    @Override
    public int compareTo(Circle other) {
        if (this.getarea() < other.getarea()) {
            return -1;
        } else if (this.getarea() > other.getarea()) {
            return 1;
        } else {
            return 0;   }   }   }
