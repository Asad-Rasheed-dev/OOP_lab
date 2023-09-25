package LAb_2;

public class Rectangle {
    private double length;
    private double width;
    private int x;
    private int y;

    public Rectangle(double length, double width, int x, int y) {
        this.length = length;
        setLength(length);
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Rectangle() {

    }


    public void setLength(double length) {
        if (length > 0) {

            this.length = length;
        }
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getWidth() {

        return width;
    }


    public  double CalArea() {

        return length * width;

    }
    public void displayArea() {
        System.out.println("The Area of Rectangle is: "+CalArea());
    }

    public double CalParameter() {

        return 2 * (length + width);
    }
    public void displayParameter() {
        System.out.println("The Parameter of Rectangle is: "+CalParameter());
    }

    public static Rectangle minRect (Rectangle Rec1, Rectangle Rec2) {
        if (Rec1.CalArea() < Rec2.CalArea()) {
            System.out.println("Rectangle 1 is Smaller!");
            return Rec1;
        } else {
            System.out.println("Rectangle 2 is Smaller!");
            return Rec2;
        }

    }

    public static boolean showOverlap (Rectangle Rec1, Rectangle Rec2) {
        if ((Rec1.x + Rec1.length) > Rec2.x && (Rec1.y + Rec2.width) > Rec2.y) {
            System.out.println("Rectangle is Overlapping!");
            return true;
        }
        else {
            System.out.println("Rectangle is not Overlapping!");
            return false;

        }
    }
}
