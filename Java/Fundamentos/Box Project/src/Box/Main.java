package Box;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.deep = 6;
        b1.width = 3;
        b1.high = 2;
        System.out.println("The volume of the box is: " + b1.calcVolume() + " square meter.");
        
        Box b2 = new Box(2, 6, 3);
        System.out.println("The volume of the box is: " + b1.calcVolume() + " square meter. ");
    }
}
