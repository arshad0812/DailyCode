class node{
    int data;
    node left,right;

    public node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}


public class bstTree{


    public static node root=null;


    
    public node insert(node root,int data){
        if(root==null){
            root=new node(data);
           
        }
        else if(root.data>data)
        {
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }

    public void printTree(node temp){
        if(temp!=null)
        {
            System.out.println(temp.data);
            printTree(temp.left);
            printTree(temp.right);
        }
    }


    
    public static void main(String[] args){

        bstTree bst=new bstTree();
        root=bst.insert(bst.root,100);
        bst.insert(bst.root,90);
        bst.insert(bst.root,80);
        bst.insert(bst.root,110);
        bst.insert(bst.root,130);
        bst.printTree(bst.root);
        
       
        
        
    }
}



// output

// the successor of a node is the next node in the in-order traversal of the tree

