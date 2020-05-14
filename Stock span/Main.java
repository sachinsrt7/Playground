#include<iostream>
using namespace std;
int main()
{
  int n,c=1;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  cout<<1<<endl;
  for(int i=0;i<n-1;i++)
  {
    if(a[i]>a[i+1])
  cout<<1<<endl;
    else{
      cout<<2*c<<endl;
      c++;
    }}}
