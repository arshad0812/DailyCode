class node{
    int data;
    node next;
    node prev;

    public node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}



class DoubleLinkedList{
    
    public static node head=null;
    

    public void insertAtFront(int data){
        node temp=new node(data);
        if(head!=null){
            head.prev=temp;
            temp.next=head;
        }
        head=temp;
    }


    public void insertAtBack(int data){
        node temp=new node(data);
        if(head==null){
            head=temp;
            return;
        }

        node temp2=head;
        while(temp2.next!=null){
            temp2=temp2.next;
        }

        temp2.next=temp;
        temp.prev=temp2;

    }


    public void print(node temp){
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    public static void main(String args[]){
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.insertAtFront(2);
        dl.insertAtFront(3);
        dl.insertAtFront(4);
        dl.insertAtBack(1);
        dl.print(head);
    }
}


// output
// 4 3 2 1 