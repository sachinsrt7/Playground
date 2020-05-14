
#include<iostream>
#define MAX 10
using namespace std;
void largestInEachCol(int mat[][MAX], int rows, int cols) {
   for (int i = 0; i < cols; i++) {
      int max_col_element = mat[0][i];
   for (int j = 1; j < rows; j++) {
      if (mat[j][i] > max_col_element)
         max_col_element = mat[j][i];
   }
   cout << max_col_element << endl;
   }
}
int main() {
   int m,n,i,j;
  cin>>m>>n;
   int mat[10][10]; 
  for (i = 0; i < m; i++)
        for (j = 0; j < n; j++)	
            cin >>mat[i][j];
   
   largestInEachCol(mat, m, n);
}

