import java.util.Scanner;

class SumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int sumAll = 0, sumAlternate = 0;
        for (int i = 0; i < n; i++) {
            sumAll += arr[i];
            if (i % 2 == 0) sumAlternate += arr[i]; 
        }

        System.out.println("Sum of all elements = " + sumAll);
        System.out.println("Sum of alternate elements = " + sumAlternate);

        System.out.println("Aryaveer Sharma 24csu306");
    }
}
