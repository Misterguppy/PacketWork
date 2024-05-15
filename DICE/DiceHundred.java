package DICE;

public class DiceHundred {
    
    public static void main(String[] args){
        int num = 0;
        int first = 0;
        int second = 0;
        while(num <=100){
            Dice d = new Dice();
            d.roll();
            int n = d.getTotal();
                if(n==7 || n == 11){
                    first +=1;
                }
                if(n==2 || n == 3 || n == 12){
                    second +=1;
                }
            num +=1;
        }
        System.out.println("You rolled a 7 or 11\t\t\b\b\b\b\b "+first+"% of the time.");
        System.out.println("You rolled a 2, 3, or 12    "+second+"% of the time.");
    }
    
}
