
#include <stdio.h>
#include <stdlib.h>

int tamanho(char*princ){//mede o tamanho da string ate \n ou \0
    int i =0;
    while(princ[i]!= '\0' && princ[i] != '\n'){
        i++;
    }
    return i;
}

int Ispal(char*princ){//metodo que verifica se é ou nao palindromo
    int ispal = 1;
    int tam = tamanho(princ);
    for(int i =0; i<tam/2; i++){
        if(princ[i]!=princ[tam-i-1]){
            ispal =0;
            i = tam;
        }
    }
    return ispal;

}
int equalsFIM(char* princ){//metodo que compara se é ou nãop igual a fim
    int eFim = 0;
    if(tamanho(princ)==3){
        if(princ[0] == 'F'&& princ[1]=='I'&&princ[2]=='M')
        eFim = 1;
    }
    return eFim;
}

int main(){
    char princ[100];
    fgets(princ, sizeof(princ), stdin);
    
    
    while(equalsFIM(princ)==0){
        if(Ispal(princ)){
            printf("SIM\n");
        }else{
            printf("NAO\n");
        }
        
        fgets(princ, sizeof(princ), stdin);
    }
    return 0;
}