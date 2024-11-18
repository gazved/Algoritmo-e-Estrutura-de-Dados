package ArvoreBinaria;

public class introducao {
    
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

    void InserirPai(int x, No i, No pai){
        
    }
}
