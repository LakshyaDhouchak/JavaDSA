package DataStructure.StackAndQueue;

import java.util.ArrayList;
import java.util.Scanner;
public class stackStructure {
    // define the properties
    int size =-1;
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the push() methord
    public void Push(ArrayList<Integer> arr){
        // define the properties
        int choice;
        do{
            System.out.println("Enter the data:");
            int data = input.nextInt();
            arr.add(data);
            size++;

            System.out.println("*******************CHOICE*******************\n"+
                                "  Case 1: Add more data in stack\n"+
                                "  Case 2: Don't add more data in stack\n"+
                                "*******************************************");
            System.out.println("Enter the choice:"); 
            choice = input.nextInt();                   
        }
        while(choice ==1);
    }

    // define the pop() methord
    public void pop(ArrayList<Integer> arr){
        System.out.println("The last element present in stack is: "+arr.get(size));
        size--;
        System.out.println("The last element is removed successfully");
    }

    // define the Peek() methord
    public void Peek(ArrayList<Integer> arr){
        System.out.println("The last element present in stack is: "+arr.get(size));
    }

    // define the IsEmpty() methord
    public void IsEmpty(){
        if(size == -1){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The stack is not empty");
        }
    }

    // define the Display() methord
    public void Display(ArrayList<Integer> arr){
        System.out.println("The element present in Stack is:");
        for(int i=0;i<=size;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // define the properties
        int choice;

        // calling the Scanner
        Scanner input =  new Scanner(System.in);
        //calling the ArrayList() methord
        ArrayList<Integer> aList =  new ArrayList<Integer>();
        //calling the class Object
        stackStructure stack = new stackStructure();

        do{
            System.out.println("***************CHOICE*****************\n"+
                               "    Case 1: Push() methord\n"+
                               "    Case 2: Pop() methord\n"+
                               "    Case 3: Peek() methord\n"+
                               "    Case 4: IsEmpty() methord\n"+
                               "    Case 5: Display() methord\n"+
                               "    Case 6: Exit\n"+
                               "*************************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    stack.Push(aList);
                    break;
                case 2:
                    stack.pop(aList);
                    break;
                case 3:
                    stack.Peek(aList);
                    break;
                case 4:
                    stack.IsEmpty();
                    break;
                case 5:
                    stack.Display(aList);
                    break;
                case 6:
                    System.exit(0);
                    break;                    
            }
        }
        while(choice<7&&choice>0);

        // close the Scanner
        input.close();
    }
}
