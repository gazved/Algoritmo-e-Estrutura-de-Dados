package Q03;

import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String princ = sc.nextLine();
       
        while(!equalsFIM(princ)){
            char letters[] = new char[princ.length()];
             String resultado = "";
            for(int i =0; i<princ.length(); i++){//for para movimentar todos os caracteres para 3 casas a direita
                letters[i] = princ.charAt(i);
                if((princ.charAt(i)>=32 && princ.charAt(i) <=127)){//estes numeros foram retirados da tabela ASCII
                    letters[i]+=3;
                }
                
            }

            for(int i =0; i< princ.length();i++){//forma a string resultante
                resultado += letters[i];
            }
            System.out.println(resultado);
            princ = sc.nextLine();
        }
        sc.close();

    }
    public  static boolean equalsFIM(String princ){//metodo que compara se é ou nãop igual a fim
        boolean eFim = false;
        if(princ.length() == 3){
            if(princ.charAt(0) == 'F'&& princ.charAt(1)=='I'&&princ.charAt(2)=='M')
            eFim = true;
        }
        return eFim;
    }
}
