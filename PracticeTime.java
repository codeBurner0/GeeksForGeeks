public class PracticeTime {
    public static int digit(int n) {
        int dig = 0;
        while (n > 0) {
            dig += n % 10;
            n = n / 10;
        }
        return dig;
    }

    public static int differenceOfSum(int[] arr) {
        int sum = 0;
        int dig = 0;
        for (int i = 0; i < arr.length; i++) {
            dig += digit(arr[i]);
            sum += arr[i];
        }
        return Math.abs(dig - sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4};

        System.out.println(differenceOfSum(arr));
    }
}