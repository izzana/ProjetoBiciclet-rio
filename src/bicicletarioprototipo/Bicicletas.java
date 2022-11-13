package bicicletarioprototipo;

public class Bicicletas{
  private No primeiro, ultimo;
  private int tamanho;
  private int numero;

  public int getNumero(){
    return numero;
  }

  public void setNumero(int numero){
    this.numero = numero;
  }

  public int getTamanho(){
    return tamanho;
  }

  public void setTamanho(int tamanho){
    this.tamanho = tamanho;
  }

  public No percorrer(int tamanho){
    No atual = this.primeiro;
    for (int i = 0; i < tamanho; i++){//percorrendo o vetor
      if(atual.getProximo() != null){
          atual = atual.getProximo();       
      }  
    }
    
    //System.out.println("Atual: " + atual.getValor());
    return atual;
  }

  public void adicionarVaga(String novoValor){
    No valor = new No(novoValor);
    //adiiconei um último parâmetro
    if(this.primeiro == null && this.ultimo == null){//então ele é o primeiro e o último
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
    
    for(int i=0; i < this.getTamanho(); i++){            
      if (atual.getValor().equalsIgnoreCase(valorProcurado)){
          if (this.tamanho == 1){
              this.primeiro = null;
              this.ultimo = null;
          } else if (atual == primeiro){
              this.primeiro = atual.getProximo();
              atual.setProximo(null);
          } else if (atual == ultimo){
              this.ultimo = anterior;
              anterior.setProximo(null);
          } else {
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

  public void alugarBicicleta(String valorProcurado) {
    No anterior = null;
    No atual = this.primeiro;
    for(int i=0; i < this.getTamanho(); i++){            
      if (atual.getValor().equalsIgnoreCase(valorProcurado)){
          if (this.tamanho == 1){
              this.primeiro = null;
              this.ultimo = null;
          } else if (atual == primeiro){
              this.primeiro = atual.getProximo();
              atual.setProximo(null);
          } else if (atual == ultimo){
              this.ultimo = anterior;
              anterior.setProximo(null);
          } else {
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

  public void devolverBicicleta(String novoValor) {
      No valor = new No(novoValor);
    //adiiconei um último parâmetro
    if(this.primeiro == null && this.ultimo == null){//então ele é o primeiro e o último
        this.primeiro = valor;//o valor é preenchido no main
        this.ultimo = valor;
    }else{
        this.ultimo.setProximo(valor);//setproximo tá na class No
        this.ultimo = valor;
    }
    this.tamanho++;//criado novo índice
    
    this.ultimo.setValor(novoValor);
  }
}
