#include<iostream>
using namespace std;
int main()
{
 int d,s;
  cin>>d;
  if(d%4==0)
    cout<<d<<" "<<"is a leap year";
  else if(d%100==0)
       cout<<d<<"is a leap year";
  else if (d%400==0)
       cout<<d<<" "<<" "<<"is a leap year";
  else 
       cout<<d<<" "<<"is not a leap year";
  return 0;
}