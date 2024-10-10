
import java.util.Scanner;

public class practical_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] ex = new int[100];
        float sum = 0;
        System.out.println("Enter the number of Days's Expenses: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {
            ex[i] = sc.nextInt();
            sum = sum + ex[i];
        }
        System.out.println("Total expenses of 30 Days is " + sum);
        System.out.println("23DCS092_Shubh");
            
        }

        
    }


