package Algorithms.SortingAlgorithms;

import java.util.Scanner;
public class QuickSort {
    // define the display() methord
    public void display(int[] arr){
        System.out.println("The elemenet present in an array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the swap() methord
    public void swap(int[] arr,int i,int j){
        int pointer = arr[i];
        arr[i] = arr[j];
        arr[j] = pointer;
    }

    // define the partion() methord
    public int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i= low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    // define the Sort(parameter) methord
    public void Sort(int[] arr,int l,int h){
        if(l<h){
            int mid = partition(arr, l, h);
            Sort(arr, l, mid-1);
            Sort(arr, mid+1, h);
        }
    }
    public static void main(String[] args) {
        // calling the Scanner 
        Scanner input =  new Scanner(System.in);
        // calling the class Object
        QuickSort qSort =  new QuickSort();

        System.out.println("Enter the size of an array is:");
        int size = input.nextInt();
        int[] arr =  new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index "+i+" is:");
            int data = input.nextInt();
            arr[i] = data;
        }
        qSort.display(arr);
        qSort.Sort(arr, 0, size-1);
        System.out.println("After sorting");
        qSort.display(arr);

        // close the Scanner
        input.close();
    }
}
