import java.util.*;

class node{
    int data;
    node next;
    public node(int data){
        this.data=data;
        next=null;
    }
}



public class LinkedList{

    public static node head;

    public LinkedList(){
        head=null; 
    }


    public void insert(int data){
        if(head==null){
            head=new node(data);
        }
        else{
            node temp=new node(data);
            temp.next=head;
            head=temp;
        }
    }

    public void printlist(node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static boolean searchLinkedList(node head,int data){
        node temp=head;

        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }


    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.printlist(ll.head);
        if(ll.searchLinkedList(head, 3)){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}