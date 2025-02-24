
import java.util.*;

public class alteracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String princ = sc.nextLine();
        while(princ.compareTo("FIM")!=0){
            Random gerador = new Random();
            gerador.setSeed(4);
            char num1 = (char)('a' + (Math.abs(gerador.nextInt()%26)));
            char num2 = (char)('a' + (Math.abs(gerador.nextInt()%26)));

            char letters[] = new char[princ.length()];
            for(int i =0; i<princ.length();i++){
                letters[i] = princ.charAt(i);
                if(letters[i] == num1){
                    letters[i] = num2;
                }
            }
            String resultado = "";
            for(int i =0; i< princ.length(); i++){
                resultado += letters[i];
            }
            System.out.println(resultado);
            princ = sc.nextLine();

        }
        sc.close();
    }
}
