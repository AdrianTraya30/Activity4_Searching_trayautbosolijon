
import java.util.Scanner;

public class  App{

   
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Choose a searching algorithm to perform:\n");
        System.out.println("1. Linear Search\n");
        System.out.println("2. Binary Search\n");
        System.out.println("3. Jump Search\n");
        System.out.println("4. Exponential Search\n");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter no. of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                int result = linearSearch(arr, target);
                if (result != -1) {
                    System.out.println("Case 1: Found");
                    System.out.println("Element " + target + " is found at index " + result + ".");
                } else {
                    System.out.println("Case 2: Not Found");
                    System.out.println("Element " + target + " is not found in the array.");
                }
                break;

            case 2:
            case 3:
            case 4:
                System.out.println("Only Linear Search is implemented.");
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

        scanner.close();
    }
}
