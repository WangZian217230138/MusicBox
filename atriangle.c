#include <stdio.h>
int main(void){
int i;
int j;
int n;
for(i=0;i<=8;i=i+1){
    for(n=0;n<8-i;n=n+1){
        printf(" ");
    }
    for(j=0;j<i;j=j+1){
    printf("a");
    }
    printf("\n");    }




return 0;
}
