package DataStructure.LinkedListStructure;

import java.util.Scanner;
public class CircularLinkedList {
    // define the properties
    node head = null;
    node dup = head;
    node dup1 = null;
    int size =0;
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // calling the node class Object
    static class node{
        // define the properties
        int data;
        node next;

        // define the constructor
        public node(int data){
            this.data =  data;
            this.next = null;
        }
    }

    // define the Create() methord
    public void Create(){
        // define the properties
        int choice;
        do{
            if(head == null){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                node node = new node(data);
                head = node;
                node.next = head;
                dup = node;
                size++;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                node node =  new node(data);
                dup.next = node;
                dup = node;
                dup.next = head;
                size++;
            }
            System.out.println("************CHOICE*************\n"+
                               "   Case 1: Add more node\n"+
                               "   Case 2: Don't add node\n"+
                               "*******************************");
            System.out.println("Enter the choice:"); 
            choice = input.nextInt();                  
        } 
        while(choice == 1);   
    }

    // define the display() methord
    public void Display(){
        dup = head;
        System.out.println("The element present in circular linkedList is: ");
        for(int i=0;i<size;i++){
            System.out.print(dup.data+" ");
            dup = dup.next;
        }
        System.out.println();
        
    }

    // define the Insert() methord
    public void Insert(){
        // define the properties
        int choice;
        do{
            System.out.println("***********CHOICE************\n"+
                               "  Case 1: Insert in starting\n"+
                               "  Case 2: Insert in end\n"+
                               "  Case 3: Insert in middle\n"+
                               "  Case 4: Exit\n"+
                               "*****************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    dup = head;
                    System.out.println("Enter the data:");
                    int data = input.nextInt();
                    // calling the node class Object
                    node node =  new node(data);
                    node.next = head;
                    head = node;
                    for(int i=0;i<size;i++){
                        dup = dup.next;
                    }
                    dup.next = node;
                    size++;
                    break;
                case 2:
                    dup = head;
                    System.out.println("Enter the data to be inserted:");
                    data = input.nextInt();
                    // calling the node class Object
                    node = new node(data);
                    for(int i=0;i<size;i++){
                        dup =  dup.next;
                    }
                    dup.next = node;
                    node.next = head;
                    size++;
                    break;
                case 3:
                    dup = head;
                    System.out.println("Enter the before data:");
                    int beforedata = input.nextInt();  
                    for(int i=0;i<size;i++){
                        if(dup.data == beforedata){
                            break;
                        }
                        dup = dup.next;
                    }  
                    System.out.println("Enter the data to be inserted :");
                    data = input.nextInt();
                    // calling the node class Object
                    node =  new node(data);
                    node.next = dup.next;
                    dup.next = node;
                    size++;
                    break;
            }
        }
        while(choice<4&&choice>0);
    }

    // define the delete() methord
    public void delete(){
        // define the properties
        int choice;
        do{
            System.out.println("***********CHOICE************\n"+
                               "  Case 1: Delete in starting\n"+
                               "  Case 2: Delete in end\n"+
                               "  Case 3: Delete in middle\n"+
                               "  Case 4: Exit\n"+
                               "*****************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt(); 

            switch(choice){
                case 1:
                    dup = head;
                    head = head.next;
                    for(int i=0;i<size;i++){
                        dup = dup.next;
                    }
                    dup.next = head;
                    size--;
                    break;
                case 2:
                    dup = head;
                    for(int i=0;i<size-1;i++){
                        dup =  dup.next;
                    } 
                    dup.next =head;
                    size--;  
                    break;
                case 3:
                    dup =  head;
                    dup1 =  head;
                    int position = 0;
                    System.out.println("Enter the data:");
                    int data = input.nextInt();
                    for(int i=0;i<size;i++){
                        if(dup.data == data){
                            break;
                        }
                        position++;
                        dup = dup.next;
                    } 
                    for(int i=0;i<position-1;i++){
                        dup1 = dup1.next;
                    } 
                    dup1.next = dup.next;
                    size--;
                    break;

            }
        }
        while(choice<4&& choice>0);
    }

    // define the IsEmpty() methord
    public void IsEmpty(){
        if(head == null){
            System.out.println("The circular linkedList is empty");
        }
        else{
            System.out.println("The circular linkedList is not empty");
        }
    }

    public static void main(String[] args) {
        // define the properties
        int choice;

        // calling the Scanner
        Scanner input =  new Scanner(System.in);
        // calling the Class Object
        CircularLinkedList cLinkedList =  new CircularLinkedList();

        do{
            System.out.println("****************CHOICE***************\n"+
                               "     Case 1: Create() methord\n"+
                               "     Case 2: Insert() methord\n"+
                               "     Case 3: Delete() methord\n"+
                               "     Case 4: Display() methord\n"+
                               "     Case 5: IsEmpty() methord\n"+
                               "     Case 6: Exit\n"+
                               "*************************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    cLinkedList.Create();
                    break;
                case 2:
                    cLinkedList.Insert();
                    break;
                case 3:
                    cLinkedList.delete();
                    break;
                case 4:
                    cLinkedList.Display();
                    break;
                case 5:
                    cLinkedList.IsEmpty();
                    break;     
                case 6:
                    System.exit(0);
                    break;                
            }
        }
        while(choice<6&&choice>0);

        // close the Scanner
        input.close();
    }
}
