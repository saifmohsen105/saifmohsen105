#include <stdio.h>
#include <stdlib.h>
#include<math.h>
int main()
{
   int num_real,num_not_real,degree;
   double seta;
   const double PI = 3.14159265;
   printf("Please write real number - > ");
   scanf("%i",&num_real);
   printf("Please write not real number - > ");
   scanf("%i",&num_not_real);
   int r = (num_real*num_real+num_not_real*num_not_real)/2;
   seta = atan(num_not_real/num_real);
   degree = (seta*180)/PI;
   if(degree<0){
    degree*=-1;
   }
   if(num_real>0&&num_not_real>0){
    seta = degree;
   }else if (num_not_real<0&&num_real>0){
       seta = 180-degree;
   }else if (num_not_real<0&&num_real<0){
   seta = 180+degree;
   }else if (num_real>0&&num_not_real<0){
   seta = 360-degree;
   }else if (num_real==0&&num_not_real >0){
   seta = 90;
   }else if (num_real<0&&num_not_real ==0){
   seta = 0;
   }else if (num_real==0&&num_not_real<0||&num_not_real>0){
   seta = 270;
   }
   printf("%i*(cos(%f)+i*sin(%f))",r,seta,seta);
    return 0;
}
