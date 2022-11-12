package bicicletarioprototipo;

public class ListaLigada{
    private No primeiro, ultimo;
    private int tamanho;
    
    public ListaLigada(){
        this.tamanho = 0;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
    public No getUltimo() {
        return ultimo;
    }
    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(String novoValor) {
        No valor = new No(novoValor);
        if(this.primeiro == null) {//então ele é o primeiro e o último
            this.primeiro = valor;//o valor é preenchido no main
            this.ultimo = valor;
        } else {
            this.ultimo.setProximo(valor);//setproximo tá na class No
            this.ultimo = valor;
        }
        this.tamanho++;//criado novo índice
    }
    
    public No percorrer(int tamanho) {
        No atual = this.primeiro;
        for (int i = 0; i < tamanho; i++) {//percorrendo o vetor
          if(atual.getProximo() != null) {
              atual = atual.getProximo();       
          }  
        }
        //System.out.println("Atual: " + atual.getValor());
        return atual;
    }
    
    public void remover(String valorProcurado) {
        No anterior = null;
        No atual = this.primeiro;
        for(int i=0; i < this.getTamanho(); i++){            
            if (atual.getValor().equalsIgnoreCase(valorProcurado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
        
    }
}
