package bicicletarioprototipo;

public class Pagamento{
  private int valorPagamento;
  private int tempo;

  public void pagar(int tempo){
    tempo = this.tempo;
    if(tempo < 60){
        valorPagamento = 5;
    }
    else if(tempo < 120){
      valorPagamento = 8;
    }
    else{
      valorPagamento = 20;
    }
    System.out.println("O valor a pagar é de R$" + valorPagamento + ",00");
  }

  public float getValorPagamento(){
    return valorPagamento;
  }

  public void setValorPagamento(int valorPagamento) {
    this.valorPagamento = valorPagamento;
  }
}
