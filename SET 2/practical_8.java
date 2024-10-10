
public class practical_8 {

    public static int arr_count9(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 9, 5, 9, 4, 7, 9};
        int[] arr2 = {1, 9, 5};
        int[] arr3 = {1, 9, 5, 9, 4, 7};

        System.out.println("Number 9's in arr1 :" + arr_count9(arr1));
        System.out.println("Number 9's in arr2 :" + arr_count9(arr2));
        System.out.println("Number 9's in arr3 :" + arr_count9(arr3));
        System.out.println("23DCS092_Shubh");
    }
}
