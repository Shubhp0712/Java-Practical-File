
import java.util.Scanner;

public class practical_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        int l = sc.nextInt();

        System.out.println("Enter breadth of rectangle: ");
        int b = sc.nextInt();

        area a = new area(l,b);
        System.out.println("Area of rectangle is: " + a.returnArea());

        System.out.println("23DCS092_Shubh");
    }
}

class area {
    int length;
    int breadth;

    public area(int l, int b) {
        length = l;
        breadth = b;
    }

    public int returnArea() {
        return length * breadth;
    }
}