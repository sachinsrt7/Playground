#include<iostream>
using namespace std;
int main()
{
int n,m,r;
  cin>>n>>m;
  if(n<m)
  {
    r=n;
  }
  else
  {
    r=m;
  }
  if(r%2==0)
  {
    cout<< "Mani Iyer";
  }
  else
  {
    cout<< "Arun Gupta";
  }
}
