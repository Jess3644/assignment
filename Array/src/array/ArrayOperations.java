import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Scanner sc = new Scanner(System.in);

        // Taking input from user and storing in the array
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Printing the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Checking if a number is present in the array
        System.out.print("Enter a number to check if it's present in the array: ");
        int num = sc.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < 15; i++) {
            if (arr[i] == num) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // Creating a new array with elements in reverse order
        int[] reverseArr = new int[15];
        for (int i = 0; i < 15; i++) {
            reverseArr[i] = arr[14 - i];
        }

        // Printing the elements of the new array
        System.out.println("Elements of the new array (in reverse order):");
        for (int i = 0; i < 15; i++) {
            System.out.print(reverseArr[i] + " ");
        }
        System.out.println();

        // Getting the sum and product of elements of the array
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 15; i++) {
            sum += arr[i];
            product *= arr[i];
        }

        // Printing the sum and product
        System.out.println("Sum of elements: " + sum);
        System.out.println("Product of elements: " + product);
    }
}