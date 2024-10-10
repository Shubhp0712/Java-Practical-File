
public class practical_9 {

    private String st;

    public void double_char(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            System.out.print(s.charAt(i));

        }

    }

    public static void main(String[] args) {
        String st = "The";
        String st1 = "AAbb";
        String st2 = "Hi-there";
        practical_9 obj = new practical_9();
        // double_char(obj.st);
        // System.out.println();
        // double_char(st1);
        // System.out.println();
        // double_char(st2);
        obj.double_char(st);
        obj.double_char(st1);
        obj.double_char(st2);
        System.out.println("\n23DCS092_Shubh");
    }

}
