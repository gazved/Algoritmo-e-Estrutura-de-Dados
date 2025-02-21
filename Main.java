import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        double preco;
        String duracao;
        String cidade;
        id = sc.nextInt();
        while(id!=0){
            preco = sc.nextDouble();
            duracao = sc.next();
            Duracao duracaoo = new Duracao(duracao);
            cidade = sc.nextLine().trim();
            imprimir();
            id = sc.nextInt();
        }
        
    }

    void imprimir(int id, double preco, String cidade, Duracao duracaoo, String duracao){

        System.out.printf("%i %f",id, preco );
        duracaoo.imprimir(duracao);
        System.out.printf(" %s", cidade);
    }
}

class Duracao{
    int hora;
    int minuto;
    Duracao(String duracao){
        String[] hr = duracao.split(":");
        this.hora = Integer.parseInt(hr[0]);
        this.minuto = Integer.parseInt(hr[1]);

    }
     public void imprimir(String duracao){
        System.out.printf(" %02d:%02d ",this.hora, this.minuto);
    }

}