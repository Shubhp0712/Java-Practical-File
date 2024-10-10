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
// import java.util.Scanner;

// public class practical_33 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number N : ");
//         int N = scanner.nextInt();

//         System.out.print("Enter the number of threads: ");
//         int numThreads = scanner.nextInt();

//         int sum = 0;
//         Thread[] threads = new Thread[numThreads];
//         Summation.sum = new int[numThreads];

//         for (int i = 0; i < numThreads; i++) {
//             threads[i] = new Thread(new Summation(N, i, numThreads));
//             threads[i].start();
//         }

//         for (int i = 0; i < numThreads; i++) {
//             try {
//                 threads[i].join();
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }

//         for (int i = 0; i < numThreads; i++) {
//             sum += Summation.sum[i];
//         }

//         System.out.println("Sum: " + sum);
//         System.out.println("23DCS092_Shubh");
//     }
// }

// class Summation implements Runnable {
//     static int[] sum;
//     int N, start, numThreads;

//     Summation(int N, int start, int numThreads) {
//         this.N = N;
//         this.start = start;
//         this.numThreads = numThreads;
//     }

//     @Override
//     public void run() {
//         for (int i = start + 1; i <= N; i += numThreads) {
//             sum[start] += i;
//         }
//     }
// }