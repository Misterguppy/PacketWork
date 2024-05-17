package CUBE;

public class CubeRunner {
    public static void main(String[] args){
        Cube steve = new Cube(3);
        double vol = steve.volume();
        double surf = steve.surfaceArea();
        steve.setSideForVolume(125);
        double side = steve.getSide();
        double surf2 = steve.surfaceArea();
        System.out.println("The surface area is "+surf+" sq. units");
        System.out.println("The volume is "+vol+" cu. units");
        System.out.println("The side is now "+side+" units");
        System.out.println("The surface area is "+surf2+" sq. units");

    }
}
