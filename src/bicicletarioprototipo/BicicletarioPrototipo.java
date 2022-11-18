package bicicletarioprototipo;

import javax.swing.JOptionPane;

public class BicicletarioPrototipo {
  public static void main(String[] args){
    String[] opcoes = new String[] {
      "Usuário",
      "Administrador",
      "Sair"
    };
    int escolha = -1;      
    escolha = JOptionPane.showOptionDialog(
      null,
      "Escolha como logar",
      "MoBike",
      JOptionPane.DEFAULT_OPTION,
      JOptionPane.QUESTION_MESSAGE,
      null,
      opcoes,
      0          
    );
    if(escolha == 0) {
      Usuario administrador = new Usuario("Administrador", 123);
    } else if (escolha == 1){
      Usuario administrador = new Usuario("Usuário", 123);
    } else {
      return;
    }
    System.out.println(escolha);
    
  }
}
