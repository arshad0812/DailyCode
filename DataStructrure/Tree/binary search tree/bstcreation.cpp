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
    return root=new node(x);
  }
  else if(x>root->data){
    root->right=insert(root->right,x);
  }
  else{
    root->left=insert(root->left,x);
  }
  return root;

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
  insert(root,5);
  insert(root,4);
  insert(root,6);
  

  printnode(root);

  return 0;
}
