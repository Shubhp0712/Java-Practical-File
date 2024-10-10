
import java.util.Scanner;

class practical_5 {

    public static void main(String[] args) {
        int a;

        int price[] = {200, 550, 100, 170, 220};
        int itemcode[] = {1, 2, 3, 4, 5};
        System.out.println("1-Motor\n2-Fan\n3-Tube\n4-wires\n5-All other item");
        System.out.print("Enter your choice :");
        Scanner b = new Scanner(System.in);
        a = b.nextInt();

        switch (a) {
            case 1:
                System.out.println("The price of the Motor is :" + (price[0] + price[0] * 0.08f));
                break;

            case 2:
                System.out.println("The price of the Fan is :" + (price[1] + price[1] * 0.12f));
                break;
            case 3:
                System.out.println("The price of the Tubes is :" + (price[2] + price[2] * 0.075f));
                break;
            case 4:
                System.out.println("The price of the wires is :" + (price[3] + price[3] * 0.03f));
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("23DCS092_Shubh");
    }
}
