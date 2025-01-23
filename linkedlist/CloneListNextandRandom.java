
class node{
    int data;
    node next;
    node random;
    public node(int data){
        this.data=data;
        this.next=null;
        this.random=null;
    }
}


public class Main
{
      public Node cloneLinkedList(Node head) {
        // code here
        
        
        if(head==null)
        return null;
        
        Node current=head;
        
        while(current!=null){
            Node newnode=new Node(current.data);
            newnode.next=current.next;
            current.next=newnode;
            current=newnode.next;
        }
        
        current=head;
        while(current!=null){
            if(current.random!=null){
                current.next.random=current.random.next;
            }
            current=current.next.next;
        }
        
        Node original=head;
        Node copyhead=head.next;
        Node copy=copyhead;
        
        while(original!=null){
            original.next=original.next.next;
            if(copy.next!=null){
                copy.next=copy.next.next;
            }
            original=original.next;
            copy=copy.next;
        }
        return copyhead;
    }
    
	public static void main(String[] args) {
		System.out.println("Clone list with next and random");
		
	}
}

//input
// Clone List with Next and Random
// Difficulty: HardAccuracy: 64.8%Submissions: 100K+Points: 8
// You are given a special linked list with n nodes where each node has two pointers a next pointer that points to the next node of the singly linked list, and a random pointer that points to the random node of the linked list.
// Construct a copy of this linked list. The copy should consist of the same number of new nodes, where each new node has the value corresponding to its original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list, such that it also represent the same list state. None of the pointers in the new list should point to nodes out the original list.
// Return the head of the copied linked list.
// [[1, 3], [3, 3], [5, NULL], [9, 3]] 


//output
// head = [[1, 3], [3, 3], [5, NULL], [9, 3]] 

