public class practical_26_1 {

    static void checkage(int age) throws MyException {
        if (age > 100) {
            throw new MyException();
        }
        System.out.println("Age is acceptable: " + age);
    }
    public static void main(String[] args) {
        try {
            checkage(5);
            checkage(15);
            checkage(105);

        } catch (MyException e) {
            System.out.println("Caught exception: ");
        }

        System.out.println("23DCS092_Shubh");
    }
}

class MyException extends Exception {
    public MyException() {
        System.out.println("Exepction Caught");
    }
}
