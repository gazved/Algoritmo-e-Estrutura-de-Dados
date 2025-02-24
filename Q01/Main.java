package Q01;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String princ = sc.nextLine();
        while(!equalsFIM(princ)){
            if(IsPalindromo(princ)){
                System.out.println("SIM");

            }else{
                System.out.println("NAO");
            }
            princ =sc.nextLine();
        }
        sc.close();
    }

    public static boolean IsPalindromo(String princ){//metodo que verifica se é palindromo indo ate a metade da string e comparando com o final
        boolean esPa = true;
        for(int i =0; i< princ.length()/2; i++){
            if(princ.charAt(i)!= princ.charAt(princ.length()-i-1)){//tiro 1 pois o length da o numero de caracteres começando em 1 e o char at em 0
                esPa = false;
                i=princ.length();
            }
        }
        return esPa;
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