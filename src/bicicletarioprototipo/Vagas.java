package bicicletarioprototipo;

public class Vagas{
  private No primeiro, ultimo;
  private int tamanho;
  private int numero;

  public int getNumero(){
    return numero;
  }

  public void setNumero(int numero){
    this.numero = numero;
  }

  public Vagas(int tamanho) {//constructor
    this.tamanho = 0;    
  }

  public int getTamanho(){
    return tamanho;
  }

  public void setTamanho(int tamanho){
    this.tamanho = tamanho;
  }

  public No percorrer(int tamanho){
    No atual = this.primeiro;
    for(int i = 0; i < tamanho; i++){//percorrendo o vetor
        if(atual.getProximo() != null){
           atual = atual.getProximo();       
        }  
    }
    //System.out.println("Atual: " + atual.getValor());
    return atual;
  }

  public void adicionarVaga(String novoValor){
    No valor = new No(novoValor);
    if(this.primeiro == null) {//então ele é o primeiro e o último
       this.primeiro = valor;//o valor é preenchido no main
       this.ultimo = valor;
    }else{
      this.ultimo.setProximo(valor);//setproximo tá na class No
      this.ultimo = valor;
    }
    this.tamanho++;//criado novo índice
  }

  public void removerVaga(String valorProcurado){
    No anterior = null;
    No atual = this.primeiro;
    for(int i = 0; i < getTamanho(); i++){
        if(atual.getValor().equalsIgnoreCase(valorProcurado)){
           if(this.tamanho == 1){//se só tiver o primeiro elemento
              primeiro = null;
              ultimo = null;
            }else if(atual == primeiro){
              this.primeiro = (atual.getProximo());
              atual.setProximo(null);
            }else if(atual == ultimo){
              this.ultimo = anterior;//
              anterior.setProximo(null);//anterior vai tá apontando pra próximo, já que ele é o ultimo então ele vai apontar pra null
            }else{
              anterior.setProximo(atual.getProximo());
              atual = null; 
            }
            this.tamanho--;
          break;
        }
      anterior = atual;
    }
  }
}