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







bool aremirror(node *l,node *r)
{
    
    if(!l||!r) 
    {
        return (l==r);
    }


    if(l->data!=r->data)
    {
        return false;
    }
    


    return ( aremirror(l->left,r->right) && aremirror(l->right,r->left) );

}



bool sys(node *ro)
{
    if(!ro || (ro->left==NULL && ro->right==NULL))
    {
        return true;
    }
    else{
      return aremirror(ro->left,ro->right);
    }
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
  root=new node(1);
  root->left=new node(4);
  root->right=new node(4);
  root->left->left=new node(6);
  root->right->right=new node(6);

  if(sys(root)){
    cout<<"true";
  }
  else{
    cout<<"false";
  }
  return 0;
  
}


//output
//true
