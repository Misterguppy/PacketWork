package DICE;

public class Dice {
    private int die1, die2;

    public Dice(){
        die1 = 0;
        die2 = 0;
    }
    public void roll(){
        die1 = (int)(6*Math.random())+1;
        die2 = (int)(6*Math.random())+1;
    }

    public int getTotal(){
        int t= die1+die2;
        return t;
    }
}
