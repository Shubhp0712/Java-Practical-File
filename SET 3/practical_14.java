import java.util.*;
class practical_14 {
    public static void main(String[] args) {
        int d=0 , m=0 , y = 0;
        date d1 = new date(d,m,y);
        d1.getdata();
        System.err.println("Initial date :");
        d1.display();
        
        System.err.println("Enter the New date :");
        d1.update();
        System.err.println("Updated date :");
        d1.display();

        System.out.println("23DCS092_Shubh");
    }
}

class date{
    int day, month, year;
    date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        this.day = sc.nextInt();
        System.out.println("Enter the month: ");
        this.month = sc.nextInt();
        System.out.println("Enter the year: ");
        this.year = sc.nextInt();
    }

    void update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        this.day = sc.nextInt();
        System.out.println("Enter the month: ");
        this.month = sc.nextInt();
        System.out.println("Enter the year: ");
        this.year = sc.nextInt();
    }

    void display(){
        System.out.println("Date: "+day+"/"+month+"/"+year);
    }
}