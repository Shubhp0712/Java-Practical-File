import java.util.*;
public class p12{
    public static void main(String[] args){
        double pounds;
        double rupees = 0;
        Scanner sc = new Scanner(System.in);
       
        if(args.length > 0 ){
            pounds = Double.parseDouble(args[0]);
            rupees = 100*pounds;
            System.out.println("The amount in pound converted into " + rupees + " rupees.");
            return;
        
        }
        else{

            System.out.println("Enter the amount in pounds: ");
            pounds = sc.nextDouble();
            rupees = 100*pounds;
            
            System.out.println("The amount in rupees is: "+rupees);
        }
        System.out.println("23DCS092_Shubh");
    }
}