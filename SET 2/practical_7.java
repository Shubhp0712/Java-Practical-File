import java.util.*;
public class practical_7 {

    public static void main(String[] args) {
        int a,b ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words of String 1 :");
        a = sc.nextInt();
        String st1 = "Chocolate";
        System.out.print("Enter the number of words of string 2:");
        b = sc.nextInt();
        String st2 = "Abc";
        for (int i = 0; i < a;i++) {
            System.out.print(st1.substring(0, 3));
        }
        System.out.println("");
        for (int i = 0; i < b;i++) {
            System.out.print(st2.substring(0, 3));
        }
        System.out.println("\n23DCS092_Shubh");
    }
}
