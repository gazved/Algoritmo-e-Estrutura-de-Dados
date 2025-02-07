#include <stdio.h>
#include <stdlib.h>
#include <string.h>



int main(){
    char entrada[100];
    scanf("%[^\n]", entrada);
    while(strcmp(entrada,"FIM")!=0){
        int qtd = qtdMaiusculas(entrada);
         printf("%i", qtd);
        scanf(" %[^\n]", entrada);

    }
    return 0;
}

int qtdMaiusculas(char*str){
    int c =0;
    int tamanho = strlen(str);
    for(int i =0; i<tamanho; i++){
        if(isupper(str[i])){
            c++;
        }
    }
    return c;
}

// .\q1.exe < pub.in