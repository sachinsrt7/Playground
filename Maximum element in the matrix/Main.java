
#include<iostream>
 
using namespace std;
 
int main()
{
	int m,n,a[10][10],i,j,high,low;
	//cout<<"Enter no. of rows and coloumns:";
	cin>>m>>n;
	//cout<<"\nEnter matrix:\n";
	
	for(i=0;i<m;++i)
	{
		for(j=0;j<n;++j)
		cin>>a[i][j];
	}
 
	high=a[0][0];
	low=a[0][0];
	
	for(i=0;i<m;++i)
	{
		for(j=0;j<n;++j)
		{
			if(a[i][j]>high)
				high=a[i][j];
			else
				if(a[i][j]<low)
					low=a[i][j];
		}
	}
	
	cout<<"The maximum element is "<<high;
 
	return 0;
}

