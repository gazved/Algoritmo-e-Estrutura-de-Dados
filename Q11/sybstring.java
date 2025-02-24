package Q11;
import java.util.*;

public class sybstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[100];
        String princ = sc.next();
        int tamanho =0;
        for(int i = 1; i<princ.length(); i++){
            tamanho = 1;
            for(int j =i-1; j>=0; j--){
               if(princ.charAt(j)!= princ.charAt(i)){
                tamanho++;
               }else{
                j = -1;
               }
            }
            nums[i]  = tamanho;
        }
        System.out.println();
    }
}
