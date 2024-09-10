package DataStructure.ArrayDataStructure;
import java.util.Scanner;

public class StaticArray {

    // define the insert() methord
    public void insert(int[] arr){
        // calling the Scanner
        Scanner input = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data at index "+i+" is:");
            int data = input.nextInt();
            arr[i] = data;
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

    // define the Get() methord
    public void get(int[] arr){
        // callling the Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the index of an array:");
        int index = input.nextInt();
        if(index>= arr.length){
            System.out.println("Index out of range");
        }
        else{
            System.out.println("The element present at index "+index+" in an array is: "+arr[index]);
        }
        
    }

    // define the set methord
    public void set(int[] arr){
        // calling the Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the index of an array is:");
        int index = input.nextInt();
        if(index>=arr.length){
            System.out.println("Index out of range");
        }
        else{
            display(arr);
            System.out.println("Enter the data to be updated at index: "+index);
            int data = input.nextInt();
            arr[index] = data;
            System.out.println("After Update");
            display(arr);
        }
        
    }

    // define the max() methord
    public void max(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The max element present in an array is: "+ max);
    }

    // define the min() methord
    public void min(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The min element present in an array is: "+ min);
    }

    public static void main(String[] args) {
        // calling the class Object
        StaticArray aStaticArray =  new StaticArray();
        // calling the Scanner
        Scanner input =  new Scanner(System.in);
        // define the properties
        int choice;
        int size = 5;
        int[] arr =  new int[size];

        // define the do-while condition
        do{
            System.out.println("************CHOICE*************\n"+
                               " Case 1: Insert() methord\n"+
                               " Case 2: Display() methord\n"+
                               " Case 3: Get() methord\n"+
                               " Case 4: Set() mehord\n"+
                               " Case 5: Max() methord\n"+
                               " Case 6: Min() methord\n"+
                               " Case 7: Exit\n"+
                               "*******************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();
            
            // define the switch() case
            switch(choice){
                case 1:
                    aStaticArray.insert(arr);
                    break;
                case 2:
                    aStaticArray.display(arr);
                    break;
                case 3:
                    aStaticArray.get(arr);
                    break;
                case 4:
                    aStaticArray.set(arr);
                    break;
                case 5:
                    aStaticArray.max(arr);
                    break;
                case 6:
                    aStaticArray.min(arr);
                    break;
                case 7:
                    System.exit(0);
                    break;                        
            }
        }
        while(choice!=7);

        // close the Scanner
        input.close();
    }
}
