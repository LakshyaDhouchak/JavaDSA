package DataStructure.StackAndQueue;

import java.util.ArrayList;
import java.util.Scanner;
public class queueStructure {
    // define the properties
    int start = -1;
    int end = -1;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the Enqueue() methord
    public void Enqueue(){
        // define the properties
        int choice;
        do{
            if(start ==-1){
                System.out.println("Enter the data in queue:");
                int data = input.nextInt();
                arr.add(data);
                start++;
                end++;
            }
            else{
                System.out.println("Enter the data in queue:");
                int data = input.nextInt();
                arr.add(data);
                end++;
            }
            System.out.println("**************CHOICE*************\n"+
                               "   Case 1: Add more data\n"+
                               "   Case 2: Don't add more data\n"+
                               "*********************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();                   
        }
        while(choice==1);
    }

    // define the Dequeue() methord
    public void Dequeue(){
        System.out.println("The starting element of queue is: "+arr.get(start));
        System.out.println("The element is removed Successfully");
        for(int i=0;i<end;i++){
            arr.set(i, arr.get(i+1));
        }
        end--;
    }

    // define the IsEmpty() methord
    public void IsEmpty(){
        if(start == -1){
            System.out.println("The queue is empty");
        }
        else{
            System.out.println("The queue is not empty");
        }
    }

    // define the peek() methord
    public void peek(){
        System.out.println("The starting element of queue is: "+arr.get(start));
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in queue is:");
        for(int i=0;i<=end;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // define the properties
        int choice;

        // calling the class Object
        queueStructure queue = new queueStructure();
        //calling the Scanner
        Scanner input =  new Scanner(System.in);
        do{
            System.out.println("************CHOICE************\n"+
                               "  Case 1: Enqueue() methord\n"+
                               "  Case 2: Dequeue() methord\n"+
                               "  Case 3: IsEmpty() methord\n"+
                               "  Case 4: peek() methord\n"+
                               "  Case 5: Display() methord\n"+
                               "  Case 6: Exit\n"+
                               "******************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    queue.Enqueue();
                    break;
                case 2:
                    queue.Dequeue();
                    break;
                case 3:
                    queue.IsEmpty();
                    break;
                case 4:
                    queue.peek();
                    break;
                case 5:
                    queue.display();
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
