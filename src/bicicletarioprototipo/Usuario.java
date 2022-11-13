package bicicletarioprototipo;

import java.util.Scanner;

public class Usuario {
  
    private String nome;
    private int senha;

    public Usuario(String nome, int senha) {
      Bicicletas bicicletas = new Bicicletas();
      this.nome = nome;
      this.senha = senha;
      nome = this.nome;
      senha = this.senha;
      if(nome == "fernando" && senha == 123){
        int aux = 0;
        int opt = 0;
        while(aux != 5){
          System.out.println("----------MENU---------");
          System.out.println("Escolha uma opção:\n");
          System.out.println("1. Adicionar bicicletas");
          System.out.println("2. Remover bicicletas");
          System.out.println("3. Listar bicicletas");
          System.out.println("4. Sair");
          Scanner options = new Scanner(System.in);
          opt = options.nextInt();
          aux = opt;
          switch(opt){
            case 1:
              System.out.println("Quantas bicicletas você deseja adicionar?");
              opt = options.nextInt();
              for(int i = 0; i < opt; i++){
                String bicicleta =  String.valueOf(i);
                bicicletas.adicionarVaga(bicicleta);
              }
              break;
            case 2:            
              String bicicleta = "";
              System.out.println("Quantas bicicletas você deseja remover?");
              aux = 0;
              opt = options.nextInt();
              aux = opt;

              for(int i = 1; i <= aux; i++){
                System.out.println("Qual o número da " + i + "ª bicicleta que você deseja remover:");
                opt = options.nextInt();
                int escolha = opt;
                bicicleta =  String.valueOf(escolha);
                bicicletas.removerVaga(bicicleta);
                System.out.println("bicicleta: " + escolha + " removida");
              }
              break;
            case 3:
                for(int i = 0; i < bicicletas.getTamanho(); i++){
                  System.out.println(bicicletas.percorrer(i).getValor());
                }
                break;
            case 4:
              System.out.println("Fechando o menu");
              break;
            default:
              break;
          }
        }
    } else { 
      for(int i = 0; i < 10; i++){
        String bicicleta =  String.valueOf(i);
        bicicletas.adicionarVaga(bicicleta);
      }
      int aux = 0;
      int opt = 0;
      while(aux != 4){
          System.out.println("----------MENU---------");
          System.out.println("Escolha uma opção:\n");
          System.out.println("1. Ocupar bicicleta");
          System.out.println("2. Devolver bicicleta");
          System.out.println("3. Listar bicicletas");
          System.out.println("4. Sair");
          Scanner options = new Scanner(System.in);
          opt = options.nextInt();
          aux = opt;
          switch(opt){
            case 1: //ocupar bicicleta
              String bicicleta = "";
              System.out.println("Quantas bicicletas você deseja alugar?");
              aux = 0;
              opt = options.nextInt();
              aux = opt;

              for(int i = 1; i <= aux; i++){
                System.out.println("Qual o número da " + i + "ª bicicleta que você deseja alugar:");
                opt = options.nextInt();
                int escolha = opt;
                bicicleta =  String.valueOf(escolha);
                bicicletas.alugarBicicleta(bicicleta);
                System.out.println("bicicleta: " + escolha + " removida");
              }
              break;
            case 2: //devolver bicicleta
              System.out.println("Quantas bicicletas você deseja remover?");
              opt = options.nextInt();
              for(int i = 0; i < opt; i++){
                bicicleta =  String.valueOf(i);
                bicicletas.removerVaga(bicicleta);
                System.out.println(i);
              }
              break;
            case 3: 
                for(int i = 0; i < bicicletas.getTamanho(); i++){
                  System.out.println(bicicletas.percorrer(i).getValor());
                }
                break;
            case 4:
              break;
            case 5:
              System.out.println("Fechando o menu");
              break;
            default:
              break;
            }
        }
      }
    }

    public String getNome() {
      return nome;
    }
    
    public void setNome(String nome) {
      this.nome = nome;
    }
    
    public int getSenha() {
      return senha;
    }
    
    public void setSenha(int senha) {
      this.senha = senha;
    }
}
