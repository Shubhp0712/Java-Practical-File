
import java.util.Scanner;

public class practical_3 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("Enter the Distsnce in meters :");
        float Distsnce = a.nextFloat();

        System.out.print("Enter the Time in (hour) :");
        float hour = a.nextFloat();
        System.out.print("Enter the Time in (minutes) :");
        float minutes = a.nextFloat();
        System.out.print("Enter the Time in (seconds) :");
        float seconds = a.nextFloat();

        float totaltime = seconds + (60 * minutes) + (3600 * hour);

        float speed1 = Distsnce / totaltime;
        float speed2 = (Distsnce / 1000) / (totaltime / 3600);
        float speed3 = (Distsnce / 1609) / (totaltime / 3600);

        System.out.println("Speed 1 " + speed1);
        System.out.println("Speed 2 " + speed2);
        System.out.println("Speed 3 " + speed3);

        System.out.println("23DCS092_Shubh");
    }
}
