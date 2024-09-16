package Algorithms.SortingAlgorithms;

import java.util.Scanner;
public class InsertionSort {
    // define the sort() methord
    public void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int element = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>element){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = element;
        }
    }

    // define the display() methord
    public void display(int arr[]){
        System.out.println("The element present in array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // calling the Scanner
        Scanner input =  new Scanner(System.in);
        // calling the class Object
        InsertionSort iSort =  new InsertionSort();

        System.out.println("Enter the size of an array is:");
        int size = input.nextInt();

        int[] arr =  new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index "+i+" is:");
            int data = input.nextInt();
            arr[i] = data;
        }
        iSort.display(arr);
        iSort.sort(arr);
        System.out.println("After sorting");
        iSort.display(arr);

        // close the Scanner
        input.close();
    }
}
