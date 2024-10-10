public class practical_32{

    static class HelloThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello World from thread class!");
        }
    }
    static class HelloRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("Hello World Runnable interface!");
        }
    }

    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        HelloRunnable helloRunnable = new HelloRunnable();
        helloThread.start();
        Thread thread = new Thread(helloRunnable);
        thread.start();

        System.out.println("\n23DCS092_Shubh");
    }
}