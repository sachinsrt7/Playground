#include<iostream>
using namespace std;
int main()
{
 int x,y,z,w;
  cin>>x;
  cin>>y;
  cin>>z;
  w=(y*75)+(z*30);
  if(w<=x)
    cout<<"Boat is stable";
  else 
    cout<<"Boat will drow";
  return 0;
  

}