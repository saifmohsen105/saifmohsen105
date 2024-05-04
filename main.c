#include <stdio.h>
#include <string.h>
int main(){
int row_1,colum_1,row_2,colum_2,i,j;
printf("Please write row matrix 1 - > ");
scanf("%i",&row_1);
printf("Please write colum matrix 1 - > ");
scanf("%i",&colum_1);
printf("Please write row matrix 2 - > ");
scanf("%i",&row_2);
printf("Please write colum matrix 2 - > ");
scanf("%i",&colum_2);
if(colum_1!=row_2){
    printf("I can not multiption matrix...!");
    return  0;
}
int matrix_1[row_1][colum_1],matrix_2[row_2][colum_2];
for(i = 0;i<colum_1;i++){
    for(j = 0;j<row_1;j++){
        printf("Please write matrix 1 (%i,%i) - > ",j+1,i);
        scanf("%i",&matrix_1[j][i]);
    }
}
printf("-------------------------------- \n");
for(i = 0;i<colum_2;i++){
    for(j = 0;j<row_2;j++){
        printf("Please write matrix 2 (%i,%i) - > ",j+1,i);
        scanf("%i",&matrix_2[j][i]);
    }
}
printf("-------------------------------- \n");
for(i = 0;i<colum_1;i++){
    for(j = 0;j<row_1;j++){
        printf(" matrix 1 (%i,%i) = %i \t ",j+1,i,matrix_1[j][i]);
    }
    printf("\n");
}
printf("-------------------------------- \n");
for(i = 0;i<colum_2;i++){
    for(j = 0;j<row_2;j++){
        printf(" matrix 2 (%i,%i) = %i \t ",j+1,i,matrix_2[j][i]);
    }
    printf("\n");
}
printf("-------------------------------- \n");
int mul[100][100];
for ( i = 0; i < row_1; i++) {
    for ( j = 0; j < colum_2; j++) {
      for (int k = 0; k < colum_1; k++) {
        mul[i][j] += matrix_1[i][k] * matrix_2[k][j];
      }
    }
  }
for(i = 0;i<colum_2;i++){
    for(j = 0;j<row_1;j++){
        printf("%i\t",mul[j][i]);
    }
    printf("\n");
}
	return 0;
}
