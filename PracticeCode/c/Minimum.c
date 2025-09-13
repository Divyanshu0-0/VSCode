#include<stdio.h>
void main()
{
    int x,y;
    printf("Enter two numbers: ");
    scanf("%d %d",&x,&y);
    
    printf("Min number is %d\n",x<y?x:y);
}