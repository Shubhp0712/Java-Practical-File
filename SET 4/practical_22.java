import java.util.Scanner;

public class practical_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("Enter the number for divisor: ");
        int divisor = sc.nextInt();
        int x = my_calculator.divisor_sum(divisor);
        System.out.println("The sum of Divisor :" + x);
        System.out.println("23DCS092_Shubh");
    }
}

interface AdvanceAerithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvanceAerithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}