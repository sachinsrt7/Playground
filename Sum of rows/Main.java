#include<iostream>
using namespace std;
int main()
{
  int x,y;
  int i,j,sum=0;
  cin>>x;
  cin>>y;
  int arr[x][y];
  for(i=0;i<x;i++)
  {
    for(j=0;j<y;j++)
    {
      cin>>arr[i][j];
    }
  }
   for(i=0;i<x;i++)
  {
    for(j=0;j<y;j++)
    {
      sum=sum+arr[i][j];
    } 
	cout<<sum;
	cout<<"\n";
     sum=0;
}
}