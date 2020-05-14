#include<iostream>
using namespace std;
int main()
{
  int x,s;
  cin>>x;
  if(x<=200)
  {
    s=x*0.5;
  cout<<"Rs."<<s;
  }
  else if (x<=400)
  {
    s=(x*0.65)+100;
  cout<<"Rs."<<s;
  }
  else if (x<=600)
  {
    s=(x*0.80)+200;
  cout<<"Rs."<<s;
  }
  else if (x>600)
  {
    s=(x*1.25)+425;
    cout<<"Rs."<<s;
  }
  else
  {
    cout:" ";
  }
  return 0;
}