#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float a,si,f,d;
  cin>>p;
  cin>>r;
  cin>>t;
  si=(p*r*t)/100;
  a=si+p;
  d=0.02*si;
  f=a-d;
  cout<<si<<endl;
  cout<<a<<endl;
  cout<<d<<endl;
  cout<<f<<endl;
  return 0;
}
  
  
  
    