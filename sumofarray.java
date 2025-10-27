package arrays;
import java.util.Scanner;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 10, 15, 20, 25, 30, 35};
        int sum = 0;
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if (n > arr.length) {
            System.out.println("you enter a number greater than array length");
        } else {
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}

