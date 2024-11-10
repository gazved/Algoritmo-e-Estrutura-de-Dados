package TADs;
import java.util.*;

public class exercicios {
    public static void main(String[] args) {
        
    }
}


/*Exercicio: crie uma classe contendo os atributos elemento inteiro e prox(apontador para outra celula) */

class Celula{
    public int elemento;
    public Celula prox;
    public Celula(){
        this(0);
    }

    public Celula(int x){
        this.elemento =x;
        this.prox = null;
    }
}


/*Pilha */

class Pilha{
    private Celula topo;
    public Pilha(){
       topo = null;
    }
    public void Inserir(int x){
        Celula tmp = new Celula(x);
        tmp.prox = topo;
        topo = tmp;
        tmp = null;
    }

    public int remover() throws Exception{
        if(topo==null){
            throw new Exception("Erro!");
        }
        int elemento = topo.elemento;//elemento que o topo esta apontando
        Celula tmp = topo;//celula tmp vai passar a apontar para o elemento que o topo esta apontando
        topo = topo.prox;// topo passa a apontar para o proximo elemento
        tmp.prox = null;// tmp passa a apontar para nada
        tmp = null;//tmp passa a apontar pra nada e o elemento fica solto na memnoria sem ninguem apontando pra ele e apontado pra nul
        return elemento;
    }

    public void mostrar(){
        System.out.println("[");
        for(Celula i = topo; i!=null; i = i.prox){
            System.out.print(i.elemento+ " ");

        }
        System.out.println("]");
    }
    /*Exercicio 1
 * 
 * Seja nossa Pilha, faça um metodo que retorna a soma dos elementos contidos na mesma
 */
public void mostrarSoma(){
    System.out.println("[");
    int soma =0;
    for(Celula i = topo; i!=null; i = i.prox){
        soma = soma + i.elemento;
    }
    System.out.println(soma);
}
/*faça o exercicio anterior de forma recursiva */
  public void mostrarSomarec(int soma){
    
  }
}


