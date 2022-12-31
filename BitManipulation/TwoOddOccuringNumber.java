package BitManipulation;

public class TwoOddOccuringNumber {
    public static void Number(int arr[]) {
        int res = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        int res2 = res & (~(res - 1));
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & res2) != 0) {
                one ^= arr[i];
            } else {
                two ^= arr[i];
            }
        }
        System.out.println(one + " " + two);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 7, 8, 8, 10 };
        Number(arr);
    }
}
