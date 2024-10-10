import java.util.Arrays;

public class practical_10 {
    public static void main(String[] args) {
        String st = "My name is Shubh";

        int length = st.length();
        System.out.println("Length of the string is: " + length);

        String uppercase = st.toUpperCase();
        System.out.println("Uppercase of the string is: " + uppercase);

        String lowercase = st.toLowerCase();
        System.out.println("Lowercase of the string is: " + lowercase);

        String reverse = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            reverse = reverse + st.charAt(i);
        }
        System.out.println("Reverse of the string is: " + reverse);

        char[] charArray = st.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Sorted string is: " + sortedString);

        System.out.println("23DCS092_Shubh");
    }
}