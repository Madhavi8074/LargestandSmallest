import java.util.Scanner;

public class LargestandSmallest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int largest = array[0];
        int smallest = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The smallest element in the array is: " + smallest);
        sc.close();
    }
}
