import java.util.Scanner;
public class practical_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        numberthread nt = new numberthread(x);
        nt.start();

        System.out.println("23DCS092_Shubh");
    }
}

class numberthread extends Thread{
    public int number;

    numberthread (int n){
        number = n;
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            number++;
            System.out.println("Number: " + number);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
