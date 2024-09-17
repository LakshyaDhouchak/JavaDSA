package Algorithms.SortingAlgorithms;

import java.util.Scanner;
public class MergeSort {
    // define the merge() methord
    public void merge(int[] arr,int l,int h){
        int mid;
        if(l<h){
            mid =(l+h)/2;
            merge(arr,l,mid);
            merge(arr,mid+1,h);
            sort(arr,l,h,mid);
        }
    }

    // define the display() methord
    public void display(int[] arr){
        System.out.println("The element present in an array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the Sort() methord
    public void sort(int[] arr,int l,int h,int mid){
        int l1 = mid -l+1;
        int l2 = h-mid;
        int[] left = new int[l1];
        int[] right =  new int[l2];

        for(int i=0;i<l1;i++){
            left[i] = arr[l+i];
        }
        for(int j=0;j<l2;j++){
            right[j] = arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i<l1&&j<l2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }
            else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while(i<l1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<l2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        // calling the Scanner
        Scanner input = new Scanner(System.in);
        // calling the class Object
        MergeSort mSort =  new MergeSort();

        System.out.println("Enter the size of an array is:");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index "+i+" is:");
            int data = input.nextInt();
            arr[i] = data;
        }

        mSort.display(arr);
        mSort.merge(arr, 0, size-1);
        System.out.println("After sorting");
        mSort.display(arr);

        // close the Scanner
        input.close();

    }
}
