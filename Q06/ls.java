package Q06;
import java.util.*;

public class ls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public boolean isReal(String princ){
        int ponto =0;
        boolean Real = true;
        for(int i =0; i<princ.length();i++){
            if((!isNumber(princ.charAt(i)) && princ.charAt(i)!= '.')||ponto>1){
                Real = false;
            }else{
                if(princ.charAt(i)=='.'){
                    ponto++;
                }
            }
        }
        return Real;
    }

    public boolean isInt(String princ){
        boolean isint = true;
        for(int i= 0; i<princ.length();i++){
            if(!isNumber(princ.charAt(i))){
                isint = false;
                i = princ.length();
            }
        }
        return isint;

    }

        public boolean OnlyCon(String princ){
            boolean onlyC = true;
            for(int i =0; i<princ.length();i++){
                if(isVogal(princ.charAt(i))){
                    onlyC = false;
                    i = princ.length();
                }
            }
            return onlyC;
        }

    public boolean OnlyVogals(String princ){
        boolean onlyV = true;
        for(int i =0; i<princ.length();i++){
            if(!isVogal(princ.charAt(i))){
                onlyV = false;
                i = princ.length();
            }
        }
        return onlyV;
    }

    public boolean isVogal(char x){
        char vogals[] = {'a', 'e', 'i', 'o', 'u'};
        boolean isV = false;
        for(int i =0; i< 5; i++){
            if(x == vogals[i]){
                isV = true;
                i =5;
            }
        }
        return isV;
    }

    public boolean isNumber(char x){
        return x >= 48 && x <= 57;

    }
}
