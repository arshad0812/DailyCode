#include <bits/stdc++.h>
using namespace std;


class node{
  public:
  int data;
  node *left;
  node *right;
  node(int x){
    data=x;
    left=NULL;
    right=NULL;
  }
};



node *root=NULL;



node *insert(node *root,int x){
  if(root==NULL)
  {
    return new node(x);
  }
  else if(x>root->data){
    root->right=insert(root->right,x);
  }
  else{
    root->left=insert(root->left,x);
  }
  return root;

}



int leafNode(node* temp,int count){
    if(temp==NULL)
    return 0;

    
    if(temp->left==NULL && temp->right==NULL)
    {
        count++;
        
        return count;
    }
    return leafNode(temp->left,count)+leafNode(temp->right,count);
}


void printnode(node *temp){
  if(temp!=NULL){
    cout<<temp->data<<endl;
    printnode(temp->left);
    printnode(temp->right);
  }
}


int main()
{
  root=insert(root,5);
  insert(root,4);
  insert(root,6);
  insert(root,2);

  printnode(root);
  int count=0;
  cout<<leafNode(root,count);
  return 0;
}


//output
// 2