package ArvoreBinaria;
import java.util.*;

public class Binary {
    
}

class No{
    int elemento;
    No esq;
    No dir;
    No(int elemento){
        this(elemento,null,null);
    }
    No(int elemento, No esq, No dir){
        this.elemento = elemento;
        this.dir = dir;
        this.esq=esq;
    }
}

class ArvoreBinaria{
    No raiz;
    ArvoreBinaria() { raiz = null;}
  // Inserção com retorno de referencia
    void Inserir(int x) throws Exception{
        raiz = Inserir(x, raiz);
    }

    No Inserir(int x, No i) throws Exception{
        if(i == null){
            i = new No(x);
        }else if(x<i.elemento){
            i.esq = Inserir(x, i.esq);
        }else if(x>i.elemento){
            i.dir = Inserir(x, i.dir);
        }else{
            throw new Exception("erro!");
        }
        return i;
    }

    //inserção com passagem de pai

    void InserirPai(int x) throws Exception{
        if(raiz == null){
            raiz = new No(x);
        } else if(x< raiz.elemento){
            InserirPai(x, raiz.esq, raiz);
        } else if(x > raiz.elemento){
            InserirPai(x, raiz.dir, raiz);
        }else{
            throw new Exception("Erro");
        }
    }

    void InserirPai(int x, No i, No pai) throws Exception{
        if(i==null){
            if(x<pai.elemento){
                pai.esq = new No(x);
            }else{
                pai.dir = new No(x);
            }
        } else if(x<i.elemento){
            InserirPai(x, i.esq, i);
        } else if(x>i.elemento) {
            InserirPai(x, i.dir, i);
        } else{
            throw new Exception("Error");
        }
    }


    //método de pesquisa
    boolean pesquisar(int x){
        return pesquisar(x, raiz);
    }

    boolean pesquisar(int x, No i){
        boolean resp;
        if(i ==null){
            resp = false;
        } else if(x == i.elemento) {
            resp = true;
        } else if(x< i.elemento){
            resp = pesquisar(x, i.esq);
        } else{
            resp = pesquisar(x, i.dir);
        }
        return resp;
    }

    //métodos para caminhar na arvore


    // caminhar central ou em ordem

    void caminharCentral(No i){
        if(i!=null){
            caminharCentral(i.esq);
            System.out.println(i.elemento + " ");
            caminharCentral(i.dir);
        }
    }



    //faça um método que retorne a altura da arvore 

    int AlturaArvore(No i, int altura){
        if(i == null){
            altura --;
        } else{
            int alturaEsq = AlturaArvore(i.esq, altura + 1);
            int alturaDir = AlturaArvore(i.dir, altura+1);
            altura = (alturaEsq>alturaDir) ? alturaEsq : alturaDir;
        }
        return altura;
    }

    //faça um metodo que retorne a soma dos elementos da arvores

    public int soma(){
        return soma(raiz);
    }
    public int soma(No i){
        int resp =0;
        if(i != null){
            resp = i.elemento + soma(i.esq) + soma(i.dir);

        }
        return resp;
    }

    // faça um metodo que retorne o numero de elementos pares existentes na arvore

    public int numPares(){
        return numPares(raiz);
    }

    public int numPares(No i){
        
    }
    
}
