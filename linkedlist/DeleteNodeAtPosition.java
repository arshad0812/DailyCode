public class DeleteNodeAtPosition {
    public static void deleteNode(int position){
      

        if (position < 0) {
            System.out.println("Invalid position. Position must be >= 0.");
            return;
        }

        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        

        if(position==0){
            head=head.next;
            System.out.println("Node Deleted at position:"+position);
        }

        node temp = head;
        int count = 0;

        while(count<position-1){
            temp=temp.next;
            count++;
        }

        temp.next=temp.next.next;
        System.out.println("Node at position " + position + " deleted.");

    }
}
