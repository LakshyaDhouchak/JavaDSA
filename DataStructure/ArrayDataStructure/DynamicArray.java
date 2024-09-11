package DataStructure.ArrayDataStructure;

import java.util.Scanner;

public class DynamicArray {
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the properties
    int[] arr;
    int index;
    int capacity;

    // define the constructor
    public DynamicArray(int initialCapacity){
        this.arr = new int[initialCapacity];
        this.capacity = initialCapacity;
        this.index =0;
    }

    // define the Insert() methord
    public void Add(int data){
        if(index == capacity){
            resize();
        }
        arr[index] = data;
        index++;
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in an array is:");
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the isEmpty() methord
    public void IsEmpty(){
        if(index == 0){
            System.out.println("The array is Empty");
        }
        else{
            System.out.println("The array is not Empty");
        }
    }

    // define the Insert() methord
    public void Insert(){
        System.out.println("*************CHOICE**************\n"+
                           "   Case 1: Insert in starting\n"+
                           "   Case 2: Insert in middle\n"+
                           "   Case 3: Insert in end\n"+
                           "*********************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                int i;
                if(index == capacity){
                    resize();
                }
                System.out.println("Enter the element to be inserted :");
                int element = input.nextInt();
                for(i=index;i>=0;i--){
                    arr[i+1] = arr[i];
                }
                arr[0] = element;
                index++;
                break;
            case 2:
                System.out.println("Enter the index at which element will insert:");
                int index1 = input.nextInt();
                if(index1<index){
                    System.out.println("Enter the element to be inserted:");
                    element = input.nextInt();
                    if(index == capacity){
                        resize();
                    }
                    for(i =index;i>=index1;i--){
                        arr[i+1] = arr[i];
                    }
                    arr[index1] = element;
                    index++;
                
                } 
                else{
                    System.out.println("Index out of range");
                }
                break;
            case 3:
                if(index == capacity){
                    resize();
                }
                System.out.println("Enter the element to be Inserted:"); 
                element = input.nextInt();
                arr[index] = element;
                index++;
                break;      
        }
    }
// define the Insert() methord
public void Delete(){
    System.out.println("*************CHOICE**************\n"+
                       "   Case 1: Delete in starting\n"+
                       "   Case 2: Delete in middle\n"+
                       "   Case 3: Delete in end\n"+
                       "*********************************");
    System.out.println("Enter the choice:");
    int choice = input.nextInt();
    
    switch(choice){
        case 1:
            int i;
            for(i=0;i<index;i++){
                arr[i] = arr[i+1];
            }
            index--;
            break;
        case 2:
            System.out.println("Enter the index at which element will remove:");
            int index1 = input.nextInt();
            if(index1<index){
                for(i = index1;i<index;i++){
                    arr[i] = arr[i+1];
                }
                index--;
                break;
            
            } 
            else{
                System.out.println("Index out of range");
            }
            break;
        case 3: 
            index--;
            break;      
    }
}

    // define the resize() methord
    public void resize(){
        capacity = 2*capacity;
        int[] dup = new int[capacity];
        for(int i=0;i<index;i++){
            dup[i] = arr[i];
        }
        arr =  dup;
        dup = null;
    }
    public static void main(String[] args) {
        // define the propeties
        int choice;

        // calling the Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initialCapacity of an array is:");
        int initialCapacity = input.nextInt();

        // calling the class Object
        DynamicArray dArray =  new DynamicArray(initialCapacity);

        System.out.println("********** CONGRATULATIONS ***********\n"+
                           "  Array is initialized successfully\n"+
                           "             by : " +initialCapacity);
        System.out.println("************************************"); 

        // defining the do-while loop
        do{
            System.out.println("************CHOICE*************\n"+
                               " Case 1: Add() methord\n"+
                               " Case 2: Display() methord\n"+
                               " Case 3: Insert() methord\n"+
                               " Case 4: Delete() mehord\n"+
                               " Case 5: IsEmpty() methord\n"+
                               " Case 6: Exit\n"+
                               "*******************************"); 
            System.out.println("Enter the choice:");
            choice = input.nextInt();
            
            // define the switch case
            switch(choice){
                case 1:
                    System.out.println("Enter the data to be add in array is:");
                    int data = input.nextInt();
                    // calling the class Object
                    dArray.Add(data);
                    break;
                case 2:
                    dArray.display();
                    break;
                case 3:
                    dArray.Insert();
                    break;
                case 4:
                    dArray.Delete();
                    break;
                case 5:
                    dArray.IsEmpty();
                    break;
                case 6:
                    System.exit(0);
                    break;                     

            }
        }
        while(choice!=6&&choice>0);
        
        // close the Scanner
        input.close();
    }
}
