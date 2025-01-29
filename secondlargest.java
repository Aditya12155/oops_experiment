import java.util.*;
public class secondlargest {
    public static int findSecondLargest(int[] arr) {
        
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array you want to enter");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter the element of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Second largest element: " + findSecondLargest(arr));
    }
}   