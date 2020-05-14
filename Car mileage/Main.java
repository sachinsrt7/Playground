#include<iostream>
using namespace std;
int main()
{
 int c,b;
  float a,d;
  cin>>a;
  cin>>b;
  cin>>c;
  d=a*b;
  if(d>=c)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}