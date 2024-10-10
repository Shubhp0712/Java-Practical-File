public class practical_36 {
    public static void main(String[] args) {
        customthread t1 = new customthread("First Thread");
        customthread t2 = new customthread("Second Thread");
        customthread t3 = new customthread("Third Thread");

        t1.setPriority(3);
        t3.setPriority(7);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("23DCS092_Shubh");
    }

}

class customthread extends Thread {

    public customthread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Running thread :" + getName() + " with priority :" + getPriority());
    }
}
