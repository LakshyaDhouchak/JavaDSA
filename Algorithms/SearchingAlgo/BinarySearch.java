package Algorithms.SearchingAlgo;

import java.util.Scanner;
public class BinarySearch {
    // define the properties
    int flag =0;
    // define the Search() methord
    public int Search(int arr[],int l,int h,int key){
        int mid;
        if(l<h){
            mid = (l+h)/2;
            if(arr[mid] == key){
                flag =1;
                return flag;
            }
            else if(arr[mid]>key){
                Search(arr, l, mid-1, key);
            }
            else{
                Search(arr,mid+1,h,key);
            }
        } 
        return flag; 
    }
    public static void main(String[] args) {
        // define the properties
        int arr[];
        // calling the Scanner
        Scanner input = new Scanner(System.in);
        // calling the class Object
        BinarySearch bSearch =  new BinarySearch();

        System.out.println("Enter the size of an array is:");
        int size = input.nextInt();
        arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index "+i+" is:");
            int data = input.nextInt();
            arr[i] = data;
        }

        System.out.println("Enter the element to be searched:");
        int key = input.nextInt();
        // calling the class Object
        int pointer = bSearch.Search(arr, 0, size-1,key);
        if(pointer == 0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found");
        }

        // close the Scanner
        input.close();
    }
}
