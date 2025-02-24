package Q07;
import java.util.*;

public class inversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String princ = sc.nextLine();
        while(princ.compareTo("FIM")!=0){
        String resultado = inverte(princ);
        System.out.println(resultado);
        princ = sc.nextLine();
        }
    }

    public static String inverte(String princ){
        String result = "";
        for(int i =princ.length()-1; i>=0; i--){
            result += princ.charAt(i);
            
        }
        return result;
    }
}
