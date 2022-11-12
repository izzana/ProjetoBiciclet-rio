package bicicletarioprototipo;

public class ControlePrograma{
  private int vagasDisponiveis;
  private int vagasOcupadas;
  private No primeiro, ultimo;
  private int tamanho;
  
  public int getTamanho() {
    return tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public int getVagasDisponiveis(){
    return vagasDisponiveis;
  }

  public void setVagasDisponiveis(int vagasDisponiveis){
    this.vagasDisponiveis = vagasDisponiveis;
  }

  public int getVagasOcupadas(){
    return vagasOcupadas;
  }

  public void setVagasOcupadas(int vagasOcupadas){
    this.vagasOcupadas = vagasOcupadas;
  }

  public void listar(){       
  }

  public void cadastrar(){   
  }

  public void acompanharPagamento(){    
  }

  public void desocupar(String valorProcurado){
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

  public void ocupar(String valorProcurado){
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
                }else {
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
