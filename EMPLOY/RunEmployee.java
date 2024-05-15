package EMPLOY;

public class RunEmployee {
    public static void main(String[] args){
        Employee e = new Employee(40000.0);
        e.Increase(2000.0);
        double p = e.getPay();
        System.out.println("Salary is" + p);

        e.Increase(-500.0);
        p = e.getPay();
        System.out.println("Salary is" + p);

        e.Increase(3000.0);
        p = e.getPay();
        System.out.println("Salary is" + p);

    }
}
