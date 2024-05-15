package EMPLOY;

public class Employee {

    private double sal;
    public Employee(double sal){
        System.out.println("Salary is "+sal);
    }
    public void Increase(double a){
        sal += a;
    }
    public double getPay(){
        return sal;
    }
}
