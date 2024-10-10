import java.util.Scanner;
class practical_6 {

    public static void main(String[] args) {
        int a ;
        int m=0,n=1;
        System.out.println("enter the number of days (n) for you want to generate their exercise routine.");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        
        for (int i = 0; i < a; i++) {
            System.out.print(" "+ m);
            int sum = m + n;
            m = n;
            n = sum;
            
        }
        System.out.println("\n23DCS092_Shubh");
    }
}
