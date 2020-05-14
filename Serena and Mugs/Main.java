#include<iostream> 
using namespace std;
int main()
{
int a[2][2]; 
for(int i=0; i<2; i++) 
{ for(int j=0; j<2; j++){
  cin >> a[i][j];
}}
if(a[1][0] == a[1][1])
  cout << "YES";

else 
  cout << "NO";}
