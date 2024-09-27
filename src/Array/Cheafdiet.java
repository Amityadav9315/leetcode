import java.util.*;
import java.lang.*;
class Cheafdiet {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        // int d=0;
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] >= k) {
                count++;
                int c = arr[i] - k;
                arr[i + 1] = c + arr[i];

            } else if (arr[i] < k) {
                count = 0;
                int d = arr[i];

            }

        }
        if (count == n) {
            System.out.println("Yes");
        }
        if (count == 0) {
            System.out.println("No" );
        }
        // your code goes here

    }
}


