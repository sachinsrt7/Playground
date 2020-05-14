#include<iostream>
using namespace std;
int main()
{
 int l,r,q;
  cin>>r;
  cin>>l;
  q=2*r;
  if(q==l)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  return 0;
}