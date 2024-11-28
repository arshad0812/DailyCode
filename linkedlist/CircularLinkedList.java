class node{
    int data;
    node next;
    public node(int data){
        this.data=data;
        next=null;
    }
}


public class CircularLinkedList {
    
    public static node head=null;
    public static node tail=null;

    public void insert(int data){
        node temp=new node(data);
        if(head!=null){
            tail.next=temp;
            tail=temp;
            tail.next=head;
        }
        else{
            head=temp;
            tail=temp;
            temp.next=head;
        }
    }

    public static void printList(node temp){
        temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
    }


    public static void main(String args[]){
        CircularLinkedList cl=new CircularLinkedList();
        cl.insert(1);
        cl.insert(2);
        cl.insert(3);
        cl.printList(head);
    }


    
}
