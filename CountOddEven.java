import java.util.Scanner;

class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even numbers count: " + even);
        System.out.println("Odd numbers count: " + odd);

        System.out.println("Aryaveer Sharma 24csu306");
    }
}
