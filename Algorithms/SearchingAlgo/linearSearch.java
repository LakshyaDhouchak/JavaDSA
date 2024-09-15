package Algorithms.SearchingAlgo;

import java.util.Scanner;
public class linearSearch {
    // define the properties
    static int arr[];
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the LinearSearch() methord
    public int LinearSearched(int arr[]){
        // define the properties
        int length = arr.length;
        int flag =0;
        System.out.println("Enter the element to be searched:");
        int key = input.nextInt();

        for(int i=0;i<length;i++){
            if(arr[i] == key){
                flag =1;
                break;
            }
        }
        return flag;
    }

    // define the insert() methord
    public void insert(){
        // define the size of an array
        System.out.println("Enter the size of an array is:");
        int size = input.nextInt();
        //declaration of an array
        arr =  new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data at index "+i+" is:");
            int data = input.nextInt();
            arr[i] = data;
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
        linearSearch lSearch =  new linearSearch();

        // calling the methord
        lSearch.insert();
        lSearch.display(arr);
        int search =lSearch.LinearSearched(arr);
        if(search ==0){
            System.out.println("The element is not found");
        }
        else{
            System.out.println("The element is found");
        }

        // close the Scanner
        input.close();

    }
}
