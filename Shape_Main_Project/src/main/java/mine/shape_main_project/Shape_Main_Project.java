package mine.shape_main_project;
public class Shape_Main_Project {
    public static void main(String[] args) {
        
    Rectangle r1= new Rectangle(5.2,4.1);
    r1.Display();
     
    Circle c1 = new Circle(8);
    Circle c2 = new Circle(6);
     
        System.out.println("Area of Circle whose raduis is " +c1.getRaduis()+ " = "+c1.getarea()+"\n");
        
        System.out.println("Area of Circle whose raduis is: " + c2.getRaduis()+" = "+c2.getarea()+"\n");
        
        System.out.println("Perimeter of Circle whose raduis is " +c1.getRaduis()+ " = "+c1.getPerimeter()+"\n");
        
        System.out.println("Perimter of Circle whose raduis is: " + c2.getRaduis()+" = "+c2.getPerimeter()+"\n");
        
        switch (c1.compareTo(c2)) {
            case 1:
                System.out.println("First Circle of raduis " + c1.getRaduis()+ " > Second Circle of raduis "+c2.getRaduis());
                break;
            case -1:
                System.out.println("Second Circle of raduis " + c2.getRaduis()+ " > First Circle of raduis " + c1.getRaduis());
                break;
            case 0:
                System.out.println("Two Circles have the same Area");
                break;
            default:
                break;  }   }   }
