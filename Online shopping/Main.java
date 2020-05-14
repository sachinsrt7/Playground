#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,x,y,z;
   cin>>a;
  cin>>b;
  cin>>c;
  d=(a*b)/100;
  y=a-d;
  e=y+c;
  cout<<"In Flipkart Rs."<<e<<endl;
  cin>>f;
  cin>>g;
  cin>>h;
  i=(g*f)/100;
  z=f-i;
  j=z+h;
  cout<<"In Snapdeal Rs."<<j<<endl;
  cin>>k;
  cin>>l;
  cin>>m;
  n=(l*k)/100;
  o=k-n;
  x=o+m; 
  cout<<"In Amazon Rs."<<x<<endl;
  if(e<j && e<x)
    cout<<"He will prefer Flipkart";
  else if(j<e && j<x)
    cout<<"He will prefer Snapdeal";
  else if(j==e && j>x)
    cout<<"He will prefer Amazon";
  else if(j==e && j<x)
    cout<<"He will prefer Flipkart";
  else
   cout<<"He will prefer Amazon";
  return 0;
}