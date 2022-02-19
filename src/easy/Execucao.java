package easy;

import javax.swing.JOptionPane;

public class Execucao {

    public static void main(String[] args) {
        // Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        // String palavra = exercicio02_easy.retornaPalavra("Daniel Ferreira");
        // System.out.println(palavra);
        
        String primeiroValor  = JOptionPane.showInputDialog("Digite o primeiro valor"); 
        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");  
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();//Instanciando a classe na memória 
        System.out.println(exercicio03_easy.retornaValorTrocado(primeiroValor, segundoValor));// fazendo a chamada e valor

        }
        
    }
