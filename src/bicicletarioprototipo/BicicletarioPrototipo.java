package bicicletarioprototipo;

import java.util.Scanner;

public class BicicletarioPrototipo{

    public static void main(String[] args){
       //FilaDinamica fila = new FilaDinamica();
        Scanner ler = new Scanner(System.in);
        int tamanho;
        Usuario fernando = new Usuario("fernanda", 123);
        //fernando.login();
        
        //Bicicletas bicicletas = new Bicicletas();
        /*int aux = 0;
        int opt = 0;
        while(aux != 5){
            System.out.println("----------MENU---------");
            System.out.println("Escolha uma opção:\n");
            System.out.println("1. Adicionar bicicletas");
            System.out.println("2. Remover bicicletas");
            System.out.println("3. Mostrar primeiro item da fila");
            System.out.println("4. Listar bicicletas");
            System.out.println("5. Sair");
            Scanner options = new Scanner(System.in);
            opt = options.nextInt();
            aux = opt;
            switch(opt){
                case 1:
                System.out.println("Quantas bicicletas você deseja adicionar?");
                opt = options.nextInt();
                for(int i = 0; i < opt; i++){
                    //System.out.println("Digite um item na fila: ");
                    String bicicleta =  String.valueOf(i);
                    //vagas = ler.nextLine();

                    bicicletas.adicionarVaga(bicicleta);
                    //System.out.println(i);
                }
                    break;
                case 2:
                    System.out.println("Quantas bicicletas você deseja remover?");
                    opt = options.nextInt();
                    for(int i = 0; i < opt; i++){
                        String bicicleta =  String.valueOf(i);
                        bicicletas.removerVaga(bicicleta);
                        System.out.println(i);
                    }
                    break;
                case 3: 
                    //System.out.println("Primeiro da fila:  " + fila.get());
                    break;
                case 4:
                    for(int i = 0; i < bicicletas.getTamanho(); i++){
                        System.out.println(bicicletas.percorrer(i).getValor());
                    }
                    break;
                case 5:
                    System.out.println("Fechando o menu");
                    return;
                default:
                    break;
            }
        }*/
    }
}
