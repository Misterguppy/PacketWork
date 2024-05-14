package CIRCLE;

public class CircleRunner {
    public static void main(String[] args){
    Circle Cameron = new Circle(3);
    double c = Cameron.getC();
    System.out.println(c);
    double area = Cameron.getArea();
    System.out.println(area);
    Cameron.changeR(1);
    double newarea = Cameron.getArea();
    System.out.println(newarea);
    }

}
