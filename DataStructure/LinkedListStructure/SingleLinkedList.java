package DataStructure.LinkedListStructure;

import java.util.Scanner;
public class SingleLinkedList {
    // define the Properties
    node head = null;
    node dup =  head;

    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // calling the inner class node
    static class node
    {
        // define the properties
        int data;
        node next;

        // define the contructor
        public node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // define the Create() methord
    public void Create()
    {
        // define the properties
        int choice;
        do{
            if(head ==null){
                System.out.println("Enter the data:");
                int data =input.nextInt();

                // calling the node class Object
                node node = new node(data);
                head =  node;
                dup = node;
            }
            else{
                System.out.println("Enter the data:");
                int data =  input.nextInt();
                // calling the class Object
                node node =  new node(data);
                dup.next = node;
                dup =  node;
            }
            System.out.println("**************CHOICE***************\n"+
                               "   Case 1: Insert more data\n"+
                               "   Case 2: Don't insert more data\n"+
                               "***********************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();                   
        } 
        while(choice==1);   
    }

    // define the Display() methord
    public void Display(){
        dup =  head;
        System.out.println("The element present in linkedList is:");
        while(dup!= null){
            System.out.print(dup.data+" ");
            dup =  dup.next;
        }
        System.out.println();
    }

    // define the Insert() methord
    public void Insert(){
        System.out.println("**************CHOICE*************\n"+
                           "   Case 1: Insert from stating\n"+
                           "   Case 2: Insert from end\n"+
                           "   Case 3: Insert from middle\n"+
                           "*********************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        // define the Switch() case
        switch(choice){
            case 1:
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                node node =  new node(data);
                node.next = head;
                head = node;
                break;
            case 2:
                System.out.println("Enter the data:");
                data =  input.nextInt();
                // calling the node class Object  
                node =  new node(data);
                dup =  head;
                while(dup.next!= null){
                    dup =  dup.next;
                }
                dup.next = node;
                break;
            case 3:
                dup = head;
                System.out.println("Enter the before data :");
                int beforeData = input.nextInt();
                while(dup!= null){
                    if(dup.data == beforeData){
                        break;
                    }
                    dup =  dup.next;
                }
                if(dup!= null){
                    System.out.println("Enter the data to be inserted:");
                    data = input.nextInt();
                    // calling the class Object 
                    node =  new node(data);
                    node.next = dup.next;
                    dup.next = node;
                }
                else{
                    System.out.println("Sorry can't inserted");
                }    
                break;
        }
    }

    // define the delete() methord
    public void Delete(){
        System.out.println("***************CHOICE**************\n"+
                           "   Case 1: Delete from starting\n"+
                           "   Case 2: Delete from end\n"+
                           "   Case 3: Delete from middle\n"+
                           "***********************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        // define the Switch()
        switch(choice){
            case 1:
                head =head.next;
                break;
            case 2:
                dup =  head;
                while(dup!= null){
                    if(dup.next.next == null){
                        dup.next = null;
                    }
                    dup =  dup.next;
                } 
                break;
            case 3:
                dup = head;
                node dup1 = head;
                int count=0;
                System.out.println("Enter the data to be deleted:");
                int DeleteData = input.nextInt();  
                while(dup!= null){
                    if(dup.data == DeleteData){
                        break;
                    }
                    count++;
                    dup = dup.next;
                }
                if(dup== null){
                    System.out.println("Sorry element not found");
                }
                else{
                    if(count == 0){
                        head = null;
                    }
                    else{
                        for(int i=0;i<count-1;i++){
                            dup1 = dup1.next;
                        }
                        dup1.next = dup1.next.next;
                    }
                }       
                break;
        }
    }

    // define the IsEmpty() methord
    public void IsEmpty(){
        if( head == null){
            System.out.println("The linkedList is Empty");
        }
        else{
            System.out.println("The linkedList is not empty");
        }
    }

    // define the max() methord
    public void MaxElement(){
        dup = head;
        int max = dup.data;
        while(dup!= null){
            if(dup.data >max){
                max = dup.data;
            }
            dup =  dup.next;
        }

        System.out.println("The max element present in linkedList is: "+max);
    }

    // define the min() methord
    public void MinElement(){
        dup =  head;
        int min = dup.data;
        while(dup!= null){
            if(dup.data<min){
                min = dup.data; 
            }
            dup =  dup.next;
        }

        System.out.println("The min element present in an array is: "+min);
    }

    public static void main(String[] args)
    {
        // define the properties
        int wish;
        // calling the class Object
        SingleLinkedList sLinkedList =  new SingleLinkedList();
        // calling the Scanner
        Scanner input = new Scanner(System.in);
        
        do
        {
            System.out.println("*************CHOICE***************\n"+
                               "    Case 1: Create() methord\n"+
                               "    Case 2: Insert() methord\n"+
                               "    Case 3: Delete() methord\n"+
                               "    Case 4: IsEmpty() methord\n"+
                               "    Case 5: Max() methord\n"+
                               "    Case 6: Min() methord\n"+
                               "    Case 7: Display() methord\n"+
                               "    Case 8: Exit\n"+
                               "**********************************");

            System.out.println("Enter the choice:"); 
            wish = input.nextInt();

            switch(wish)
            {
                case 1:
                    sLinkedList.Create();
                    break;
                case 2:
                    sLinkedList.Insert();
                    break;
                case 3:
                    sLinkedList.Delete();
                    break;
                case 4:
                    sLinkedList.IsEmpty();
                    break;
                case 5:
                    sLinkedList.MaxElement();
                    break;
                case 6:
                    sLinkedList.MinElement();
                    break;
                case 7:
                    sLinkedList.Display();
                    break;    
                case 8:
                    System.exit(0);
                    break;                        
            }
        } 
        while(wish!=8&&wish>0);                     
    }
}
