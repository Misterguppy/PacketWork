package TRAVEL;

public class Travel {
    private int people;

    public Travel( int n){
        people = n;
    }

    public int goByVan(){
        int van = (people+(8- (people%8)))/8;
        return van;
    }

    public int goByCanoe(){
        int canoe = (people+(3- (people%3)))/3;
        return canoe;
    }

    public int goByPlane(){
        int plane = (people+(12- (people%12)))/12;
        return plane;
    }
}
