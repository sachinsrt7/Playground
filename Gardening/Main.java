#include<iostream>
using namespace std;
int main()
{
  int no_rows,no_columns,tree_no;
  cin>>no_rows>>no_columns>>tree_no;
  int total_tree=no_rows*no_columns;
  int last_second_column=no_columns-1;
  int second_column=no_columns-(no_columns-2);
  int a=no_rows+1;
  int b=no_rows+no_rows;
  int d=last_second_column*no_rows;
  int c=d-no_rows+1;
  
  if(tree_no>=a&&tree_no<=b)
  {
   cout<<"It is a mango tree"; 
  }
  else if(tree_no>=c&&tree_no<=d)
  {
    cout<<"It is a mango tree";
  }
 else
 {
   cout<<"It is not a mango tree";
 }
  return 0;
}