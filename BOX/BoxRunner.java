package BOX;

public class BoxRunner {
    public static void main(String[] args){
    Box bob = new Box(6,2);
    double area = bob.getArea();
    System.out.println(area);
    bob.bigger(2);
    double perimeter = bob.getPerimeter();
    System.out.println(perimeter);
    }

}
