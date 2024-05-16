package TRAVEL;

public class TravelRunner {
    
    public static void main(String[] args){
        int num = 0;
        int num2 = 6;
        
        while(num <= 21){
            Travel poeple = new Travel(num2);
            int v = poeple.goByVan();
            int c = poeple.goByCanoe();
            int p = poeple.goByPlane();
            System.out.println("people = "+num2+", vans = "+ v+", canoes = "+c+", planes = "+p);
            num += 1;
            num2 += 2;

    
        }
    }
}
