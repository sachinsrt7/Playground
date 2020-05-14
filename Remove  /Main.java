#include<iostream>
#include <bits/stdc++.h> 
using namespace std; 
  
string removeWord(string str, string word)  
{ 
    if (str.find(word) != string::npos) 
    { 
        size_t p = -1; 
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
 
    return str; 
} 
  
// Driver Code
int main(int argc, char const *argv[])  
{ 
    
    string string1 = "remove the occurrence of the word from entered string"; 
    string word1 = "the"; 
  
   
        cout << removeWord(string1, word1) << endl; 
  
   
    return 0; 
}
