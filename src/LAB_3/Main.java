package LAB_3;

public class Main {
    public static void main(String[] args) {

        Music m1 = new Music("Dandelions", "2:30", "Classical", new Date(17, 9,2023) , new Singer("Ed Sheeran" , "Male" , "British",new Date(12,23,2020)));
        Music m2 = new Music("Night Changes", "2:30", "Classical", new Date(17, 9,2023) , new Singer("Ed Sheeran" , "Male" , "British",new Date(12,23,2020)));
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.equals(m2));
    }
}
