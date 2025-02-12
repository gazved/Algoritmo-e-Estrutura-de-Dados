
#include <stdio.h>
#include <stdlib.h>

int tamanho(char*princ){
    int i =0;
    while(princ[i]!= '\0'){
        i++;
    }
    return i;
}

int Ispal(char*princ){
    int ispal = 1;
    int tam = tamanho(princ)-1;
    for(int i =0; i<tam/2; i++){
        if(princ[i]!=princ[tam-i-1]){
            ispal =0;
            i = tam;
        }
    }
    return ispal;

}

int main(){
    char princ[100];
    scanf("%[^\n]", princ);
    
    while(princ[0]!='F' && princ[1]!='I'&& princ[2]!='M'){
        if(Ispal(princ)){
            printf("SIM");
        }else{
            printf("NAO");
        }
        scanf("%[^\n]", princ);
        
    }
    return 0;
}