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


    public int LeafCount(node root){
        if(root==null)
        return 0;

        if(root.left==null && root.right==null)
        {
            return 1;
        }

        return LeafCount(root.left)+LeafCount(root.right);
    }

    public static node GetParticularNode(node temp,node partnode){
        
        if(temp==null){
            return null;
        }

        if(temp.data==partnode.data){
            return temp;
        }
        else if(temp.data>partnode.data){
            return GetParticularNode(temp.left,partnode);
        }
        else{
            return GetParticularNode(temp.right,partnode);
        }
        
    }

    public static node getsuccessornode(node root){
        node temp=root.right;

        while(temp!=null && temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }


    public static node deleteroot(node root,int data){
        if(root==null){
            System.out.println("No Node avaliable to delete");
            return null;
        }


        if(root.data>data){
            root.left=deleteroot(root.left,data);
        }
        else if(root.data<data){
            root.right=deleteroot(root.right,data);
        }
        else{

            if(root.left==null & root.right==null){
                return null;
            }

            if(root.left==null){
                return root.right;
            }

            if(root.right==null){
                return root.right;
            }

            node temp=getsuccessornode(root);
            root.data=temp.data;
            root.right=deleteroot(root.right,temp.data);

        }
        return root;
    }

    public static int HeightOfTree(node root){
        if(root==null){
            return 0;
        }


        int ldepth=HeightOfTree(root.left);
        int rdepth=HeightOfTree(root.right);

        if(ldepth>rdepth){
            return ldepth+1;
        }
        else{
            return rdepth+1;
        }
    }

    public static boolean SysmetrixTree(node lroot,node rroot){
        if(lroot==null && rroot==null){
            return true;
        }

        if(lroot ==null || rroot==null)
        {
            return false;
        }

        if(lroot.data!=rroot.data){
            return false;
        }

        return (SysmetrixTree(lroot.left, rroot.right))&&(SysmetrixTree(lroot.right, rroot.left));
    }


    public static void getSysmetrictree(){
        if(root==null){
            System.out.println("Tree is sysmetric");
        }

        if(SysmetrixTree(root.left, root.right)){
            System.out.println("Tree is sysmetric");
        }
        else{
            System.out.println("Tree is not sysmetric");
        }
    }

    public static node minValue(node temp){
        if(temp==null){
            return null;
        }



        while(temp.left!=null){
            temp=temp.left;
        }

        return temp;
    }
    static node rightmost(node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }
    
    
    public static void main(String[] args){

        bstTree bst=new bstTree();
        root=bst.insert(bst.root,100);
        bst.insert(bst.root,90);
        bst.insert(bst.root,80);
        bst.insert(bst.root,110);
        bst.insert(bst.root,130);
        bst.printTree(bst.root);
        System.out.println(bst.LeafCount(bst.root));
        node partnode=new node(130);
        if(GetParticularNode(root,partnode)!=null){
            System.out.println("Node found:"+partnode.data);
        }
        else{
            System.out.println("Node not found");
        }

        root=bst.deleteroot(bst.root,100);
        bst.printTree(bst.root);

        System.out.println(bst.HeightOfTree(root));
        bst.getSysmetrictree();
        node temp=bst.minValue(root);
        if(temp!=null)
        {
            System.out.println(temp.data);
        }
        else{
            System.out.println("Tree is empty");
        }
        
        
    }
}



// output

// the successor of a node is the next node in the in-order traversal of the tree

