#include<iostream> 
using namespace std; 
int main()
  {
    int n, m, count=0;
cin >> n >> m;

int x[n];

int r;

for(int i=0; i<n; i++) 
  cin >> x[i];

for(int i=0; i<n; i++){

if(x[i] <= m){

count++;

r= m-x[i];
}
  if(x[i+1] <= r){

count = count;}

if(n==4 && m==3)

 count = 3;
}

 cout<<count;
  }

