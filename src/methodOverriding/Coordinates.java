package methodOverriding;
public class Coordinates {
    private final int xOrdinate;
    private final int yOrdinate;

    public Coordinates(int x, int y) {
        this.xOrdinate = x;
        this.yOrdinate = y;
    }

    @Override
    public String toString() {
        return "(" + xOrdinate + ", " + yOrdinate + ")";
    }
    
    public static void main(String[] args) {
    	
        Coordinates c1 = new Coordinates(10, 20);
        System.out.println("The object location is: " + c1);
    }
}