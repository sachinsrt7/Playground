#include<iostream>
#include <bits/stdc++.h> 

using namespace std; 
  
// function to remove characters and 
// print new string 
void removeSpecialCharacter(string s) 
{ 
    for (int i = 0; i < s.size(); i++) { 
          
        // Finding the character whose  
        // ASCII value fall under this 
        // range 
        if (s[i] < 'A' || s[i] > 'Z' && 
            s[i] < 'a' || s[i] > 'z')  
        {    
            // erase function to erase  
            // the character 
            s.erase(i, 1);  
            i--; 
        } 
    } 
    cout << s; 
} 
  
// driver code 
int main() 
{ 
    string s;  
  cin>>s;
    removeSpecialCharacter(s);  
    return 0; 
}

