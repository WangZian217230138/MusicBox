#include<stdio.h>
#include<string.h>
void givestring(char wordN[]);
void erword(char wordN[]);
int main(void){
char string1[101];
char string2[101];
char string3[101];
char string4[101];
char string5[101];

givestring(string1);
givestring(string2);
givestring(string3);
givestring(string4);
givestring(string5);
printf("\n\n");

erword(string1);
erword(string2);
erword(string3);
erword(string4);
erword(string5);
printf("\n\n");


return 0;
}
void givestring(char wordN[]){

    printf("Give a string (max 100 characters) > ");
    fgets(wordN,101,stdin);

    if(wordN[strlen(wordN)-1]=='\n'){
        wordN[strlen(wordN)-1]='\0';
    }

}

void erword(char wordN[]){

if(wordN[strlen(wordN)-2]=='e'&&wordN[strlen(wordN)-1]=='r'){
    printf("A string ending with the letters \"er\" is \"%s\"\n",wordN);
}

}
