#include<iostream>
#include<string.h>
using namespace std;
int main()
{
   
    int vowels=0, cons=0,ws=0,d=0,s=0;
    string str;
    getline(cin, str);

    for(int i=0; i!=str.length(); ++i)
    {
        if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||
           str[i]=='o' || str[i]=='u' || str[i]=='A' ||
           str[i]=='E' || str[i]=='I' || str[i]=='O' ||
           str[i]=='U')
        {
            vowels++;
        }
      
      else if (str[i]==' ')
        {
            ws++;
        }
      
       else if(str[i]>='0' && str[i]<='9')
        {
            d++;
        }
      
        else if((str[i]>='a'&& str[i]<='z') || (str[i]>='A'&& str[i]<='Z'))
        {
            cons++;
        }
       
        
        else
        {
            s++;
        }
    }

    cout << "Vowels:" << vowels;
    cout << "\nConsonants:" << cons;
    
    cout << "\nWhite Spaces:" <<ws;
     cout << "\nDigits:" <<d;
    cout << "\nSymbols:" <<s;

    return 0;
}

