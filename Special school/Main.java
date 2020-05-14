#include<iostream>
#include <bits/stdc++.h> 
using namespace std; 
int main() 
{ 
    string str1,str2;
  cin>>str1;
  cin>>str2;
  
    // Reverse str[beign..end] 
    reverse(str1.begin(), str1.end()); 
   if(str1!=str2)
     cout<<"It is wrong";
  else
    cout <<"It is correct"; 
    return 0; 
}
