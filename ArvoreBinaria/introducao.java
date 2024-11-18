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
}
