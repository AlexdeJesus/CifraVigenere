package br.com.fatecpg.main;
import br.com.fatecpg.cifra.Cifra;
/**
 * @author Alex Souza
 */
public class Main {
     public static void main(String[] args) {

         String[][] cifra = Cifra.gerarCifra();
         
        for (int linha = 0; linha < cifra.length; linha++){
            for (int coluna = 0; coluna < cifra.length; coluna++){
                System.out.print("["+cifra[linha][coluna]+"]");
            }
            System.out.println("");
        }
        
    String[] palavraCifrada = Cifra.cifrarPalavra("atacarbasesul", "limao", cifra);
        System.out.println("Palavra Cifrada: ");
        for(int i = 0; i < palavraCifrada.length; i++){
            System.out.print(palavraCifrada[i]);
        }
         System.out.println("");
    }     
}