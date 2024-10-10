public class practical_34 {
    public static void main(String[] args) {
        RandomThread randomThread = new RandomThread();
        randomThread.start();

        System.out.println("23DCS092_Shubh");
    }
}

class RandomThread extends Thread {
    public int randomNum;

    public void run() {
        for (int i = 0; i < 10; i++) {
            randomNum = (int) (Math.random() * 100);
            System.out.println("Generated Random Number: " + randomNum);
            if (randomNum % 2 == 0) {
                EvenintegerThread evenThread = new EvenintegerThread();
                evenThread.number = randomNum;
                evenThread.start();
            } else {
                OddintegerThread oddThread = new OddintegerThread();
                oddThread.number = randomNum;
                oddThread.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class EvenintegerThread extends Thread {
    public int number;

    public void run() {
        if (number % 2 == 0) {
            int square = number * number;
            System.out.println("Square of " + number + " is: " + square);
        }
    }
}

class OddintegerThread extends Thread {
    public int number;

    public void run() {
        if (number % 2 != 0) {
            int cube = number * number * number;
            System.out.println("Cube of " + number + " is: " + cube);
        }
    }
}
