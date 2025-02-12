package Q01;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String princ = sc.nextLine();
        while(!princ.equalsIgnoreCase("FIM")){
            if(IsPalindromo(princ)){
                System.out.println("SIM\n");

            }else{
                System.out.println("NAO");
            }
            princ =sc.nextLine();
        }
        sc.close();
    }

    public static boolean IsPalindromo(String princ){
        boolean esPa = true;
        for(int i =0; i< princ.length()/2; i++){
            if(princ.charAt(i)!= princ.charAt(princ.length()-i-1)){
                esPa = false;
                i=princ.length();
            }
        }
        return esPa;
    }
}