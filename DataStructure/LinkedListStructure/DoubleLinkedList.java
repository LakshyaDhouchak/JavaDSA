package DataStructure.LinkedListStructure;

import java.util.Scanner;
public class DoubleLinkedList {
    // define the properties
    node head;
    node tail;
    node dup;
    // define the Scanner
    Scanner input =  new Scanner(System.in);

    // define the inner class node
    static class node{
        // define the properties
        int data;
        node left;
        node right;

        // define the constructor
        public node(int data){
            this.data =  data;
            this.left = null;
            this.right = null;
        }
    }

    // define the create() methord
    public void create(){
        // define the properties
        int choice;
        do{
            if(head == null){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the class node Object
                node node =  new node(data);

                head = node;
                tail = node;
            } 
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the class Object
                node node =  new node(data);
                node.left = tail;
                tail.right = node;
                tail = node;
            } 
            System.out.println("**************CHOICE************\n"+
                              "   Case 1: Add more node\n"+
                              "   Case 2: Don't add node\n"+
                              "*********************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();  
        }
        while(choice==1);

    }

    // define the display() methord
    public void Display(){
        dup = head;
        System.out.println("The element present in linkedList is:");
        while(dup!=null){
            System.out.print(dup.data+" ");
            dup =  dup.right;
        }
        System.out.println();
    }

    // define the reverseDisplay() methord
    public void ReverseDisplay(){
        dup = tail;
        System.out.println("The element present in linkedList is:");
        while(dup!= null){
            System.out.print(dup.data+" ");
            dup = dup.left;
        }
        System.out.println();
    }

    //define the Insert() methord
    public void Insert(){
        // define the properties
        int choice;
        do{
            System.out.println("***************CHOICE*****************\n"+
                               "     Case 1: Insert in starting\n"+
                               "     Case 2: Insert in end\n"+
                               "     Case 3: Insert in middle\n"+
                               "     Case 4: Exit\n"+
                               "**************************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();                   
            switch(choice){
                case 1:
                    System.out.println("Enter the data:");
                    int data = input.nextInt();
                    // calling the node object
                    node node = new node(data);

                    node.right = head;
                    head.left = node;
                    head = node;
                    break;
                case 2:
                    System.out.println("Enter the data:");
                    data = input.nextInt();
                    // calling the node class Object
                    node =  new node(data); 
                    
                    tail.right = node;
                    node.left = tail;
                    tail = node;
                    break;
                case 3:
                    dup = head;
                    System.out.println("Enter the before data:");
                    int BeforeData =input.nextInt();
                    while(dup!=null){
                        if(dup.data == BeforeData){
                            break;
                        }
                        dup = dup.right;
                    }    
                    if(dup == null){
                        System.out.println("Sorry element not found");
                    }
                    else{
                        System.out.println("Enter the data:");
                        data = input.nextInt();
                        // calling the node class Object
                        node =  new node(data);
                        node.right = dup.right;
                        dup.right.left = node;
                        dup.right = node;
                        node.left = node;

                    }
                    break;
            }                   
        }
        while(choice<4&& choice>0);
    }

    // define the delete() methord
    public void delete(){
        // define the properties
        int choice;
        do{
            System.out.println("***************CHOICE*****************\n"+
                               "     Case 1: Delete in starting\n"+
                               "     Case 2: Delete in end\n"+
                               "     Case 3: Delete in middle\n"+
                               "     Case 4: Exit\n"+
                               "**************************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();                   
            switch(choice){
                case 1:
                    head = head.right;
                    head.left= null;
                    break;
                case 2:
                    tail.left.right = null;
                    break;
                case 3:
                    dup =  head;
                    int flag =0;
                    System.out.println("Enter the data to be searched:");
                    int BeforeData = input.nextInt();
                    while(dup!=null){
                        if(dup.data == BeforeData){
                            dup.left.right = dup.right;
                            dup.right.left = dup.left;
                            flag =1;
                            break;
                        }
                        dup =  dup.right;
                    }
                    if(flag ==0){
                        System.out.println("Sorry can't inserted");
                    }    
                    break;
            }                   
        }
        while(choice<4&& choice>0);
    }

    public static void main(String[] args) {
        // define the properties
        int choice;
        // calling the Scanner
        Scanner input =  new Scanner(System.in);
        // calling the Class Object
        DoubleLinkedList dLinkedList = new DoubleLinkedList();
        do{
            System.out.println("***************CHOICE****************\n"+
                               "    Case 1: Create()  methord\n"+
                               "    Case 2: Insert()  methord\n"+
                               "    Case 3: Delete()  methord\n"+
                               "    Case 4: Display() methord\n"+
                               "    Case 5: Reverse() methord\n"+
                               "    Case 6: Exit\n"+
                               "**************************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();
            
            // define the Switch()
            switch(choice){
                case 1:
                    dLinkedList.create();
                    break;
                case 2:
                    dLinkedList.Insert();
                    break;
                case 3:
                    dLinkedList.delete();
                    break;
                case 4:
                    dLinkedList.Display();
                    break;
                case 5:
                    dLinkedList.ReverseDisplay();
                    break;  
                case 6:
                    System.exit(0);
                    break;                  
            }
        }
        while(choice!=6&&choice>0);
    }
}
