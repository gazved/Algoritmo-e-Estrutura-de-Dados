package Q03;
import java.util.*;

public class cesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String princ = sc.nextLine();
        String resultado = "";
        while(princ.compareTo("FIM")!=0){
            char letters[] = new char[princ.length()];
            for(int i =0; i<princ.length(); i++){
                letters[i] = princ.charAt(i);
                if((letters[i] >='a' && letters[i]<'x')||(letters[i]>='A'&&letters[i]<'X')){
                    letters[i]+=3;
                }else{
                    letters[i]+=3;
                    letters[i] -=26;
                }
                
            }

            for(int i =0; i< princ.length();i++){
                resultado += letters[i];
            }
            System.out.println(resultado);
            princ = sc.nextLine();
        }
        sc.close();

    }
}
