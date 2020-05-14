#include<iostream>
using namespace std;
int main()
{
    int i,a[50],no,pos,size;
    cout<<"Enter the number of elements in the array"<<endl;
    cin>>size;
	cout<<"Enter the elements in the array"<<endl;
 
	for(i=0; i<size; i++)
	{
	  
		cin>>a[i];
	}
 
  
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>pos;
 
  if(pos>size)
  {
    cout<<"Invalid Input"<<endl;
  }
  else
  {
    cout<<"Enter the value to insert"<<endl;
    cin>>no;
    --pos;
 
  for(i=size;i>=pos;i--)
  {
    a[i+1]=a[i];
  }
  a[pos]=no;
 
  cout<<"Array after insertion is"<<endl;
 
  for(i=0;i<size+1;i++)
  {
    cout<<a[i]<<endl;
  }
 
  }

 
  return 0;  }
