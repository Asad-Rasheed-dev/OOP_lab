package LAb_2;

public class Main {
    public static void main(String[] args) {

        Rectangle Rec1 = new Rectangle(12, 2, 0, 0);
        Rectangle Rec2 = new Rectangle(11, 2, 50, 50);

        Rec1.displayArea();
        Rec1.displayParameter();

        Rec2.displayArea();
        Rec2.displayParameter();

        Rectangle.minRect(Rec1, Rec2);

        Rectangle.showOverlap(Rec1, Rec2);

    }
}
