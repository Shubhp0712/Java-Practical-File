import java.util.*;
public class practical_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start and end value: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sumthread st = new sumthread(x,y);
        st.start();
    }
}

class sumthread extends Thread {
    private int start, end;
    int sum = 0;

    public sumthread(int a, int b) {
        start = a;
        end = b;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum of start to end is: " + sum);
    }
}
