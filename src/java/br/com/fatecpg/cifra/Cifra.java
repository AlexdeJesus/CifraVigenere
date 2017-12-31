package br.com.fatecpg.cifra;

import javax.swing.*;

/**
 * @author Alex Souza
 */
public class Cifra {
    
    public static String[][] gerarCifra(){
        
	int i = 0;        
        String[] alfabeto = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[][] cifra = new String[26][26];
        
        for (int linha = 0; linha < cifra.length; linha++){
            for (int coluna = 0; coluna < cifra.length; coluna++){                
                if (linha == 0){
                cifra[linha][coluna] = alfabeto[i];
                }else if (linha == 1){
                    if(i == 0){
                      i++;
                    }
                    if (coluna == 25){
                    i = 0;
                    cifra[linha][coluna] = alfabeto[i];
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 2){
                    if(i == 0){
                      i+=2;
                    }
                    if (coluna == 24){
                    int k = 0;
                        while (coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{                    
                    cifra[linha][coluna] = alfabeto[i];                   
                    }
                }else if(linha == 3){
                    if(i == 0){
                      i+=3;
                    }
                    if (coluna == 23){
                        int k = 0;
                        while(coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
			}
                    }else{
                        cifra[linha][coluna] = alfabeto[i];
                    }                    
                }else if (linha == 4){
                    if(i == 0){
                      i+=4;
                    }
                    if (coluna == 22){
                    int k = 0;
                        while (coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 5){
                    if(i == 0){
                      i+=5;
                    }
                    if(coluna == 21){
                    int k = 0;
                        while (coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
			}	
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 6){
                    if(i == 0){
                      i+=6;
                    }
                    if (coluna == 20){
                    int k = 0;
                        while (coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
			}					
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 7){
                    if(i == 0){
                      i+=7;
                    }
                    if (coluna == 19){
                    int k = 0;
                        while (coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if(linha == 8){
                    if(i == 0){
                      i+=8;
                    }
                    if (coluna == 18){
                        int k = 0;
                        while (coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];                
                    }
                }else if (linha == 9){
                    if(i == 0){
                      i+=9;
                    }
                    if (coluna == 17){
                    int k = 0;
                        while(coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 10){
                    if(i == 0){
                      i+=10;
                    }
                    if (coluna == 16) {
                    int k = 0;
                        while (coluna < 26){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] =  alfabeto[i];
                    }
                }else if (linha == 11){
                    if(i == 0){
                      i+=11;
                    }
                    if (coluna == 15){
                        int k = 0;
                        while (coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                     cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 12){
                    if(i == 0){
                      i+=12;
                    }
                    if (coluna == 14){
                        int k = 0;
                        while(coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 13){
                    if(i == 0){
                      i+=13;
                    }
                    if (coluna == 13){
                        int k = 0;
                        while (coluna < 26){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 14){
                    if(i == 0){
                      i+=14;
                    }
                    if (coluna == 12){
                        int k = 0;
                        while (coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if(linha == 15){
                    if(i == 0){
                      i+=15;
                    }
                    if (coluna == 11){
                        int k = 0;
                        while(coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 16){
                    if(i == 0){
                      i+=16;
                    }
                    if (coluna == 10){
                        int k = 0;
                        while (coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 17){
                    if(i == 0){
                      i+=17;
                    }
                    if (coluna == 9){
                        int k = 0;
                        while(coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 18){
                    if(i == 0){
                      i+=18;
                    }
                    if (coluna == 8){
                        int k = 0;
                        while(coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 19){
                    if(i == 0){
                      i+=19;
                    }
                    if (coluna == 7){
                        int k = 0;
                        while(coluna < cifra.length){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if(linha == 20){
                    if(i == 0){
                      i+=20;
                    }
                    if (coluna == 6){
                        int k = 0;
                        while(coluna < 26){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                     cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 21){
                    if(i == 0){
                      i+=21;
                    }
                    if (coluna ==  5){
                        int k = 0;
                        while(coluna < 26){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }        
                }else if (linha == 22){
                    if(i == 0){
                      i+=22;
                    }
                    if (coluna == 4){
                        int k = 0;
                        while(coluna < 26){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 23){
                    if(i == 0){
                      i+=23;
                    }
                    if (coluna == 3){
                        int k = 0;
                        while(coluna < 26){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 24){
                    if(i == 0){
                      i+=24;
                    }
                    if (coluna == 2){
                        int k = 0;
                        while(coluna < 26){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }else if (linha == 25){
                    if(i == 0){
                      i+=25;
                    }
                    if (coluna == 1){
                        int k = 0;
                        while(coluna < 26){
                        cifra[linha][coluna] = alfabeto[k];
                        k++;
                        coluna++;
                        }
                    }else{
                    cifra[linha][coluna] = alfabeto[i];
                    }
                }
                i++;
            }
            i = 0; 
	}  
    return cifra;
    }
	
    public static String[] cifrarPalavra(String palavra, String chave, String matrizCifra[][]){
	String[][] cifra =  gerarCifra();
        String[] alfabeto = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       
        int k = 0;        
        int p = 0;
        int j = 0 ;
        int letraPalavra = 0;
        int letraChave = 0;
        int tamanhoPalavra = palavra.length();
        int tamanhoChave = chave.length();
        String pal[] = new String[tamanhoPalavra];
        String[] ch = new String[tamanhoChave];        
        String[] palavraCifrada = new String[tamanhoPalavra];
        
        try{
            palavra = palavra.toUpperCase();
            chave = chave.toUpperCase();
            System.out.println("Palavra: ");
            for(int i = 0; i < tamanhoPalavra ; i++){
                pal[i] = palavra.substring(i, i+1);
                System.out.print("["+pal[i]+"]");
            }
            System.out.println("");
            System.out.println("Chave: ");
            for(int i = 0; i < tamanhoChave ; i++){
                ch[i] = chave.substring(i, i+1);
                System.out.print("["+ch[i]+"]");
            }
            JOptionPane.showMessageDialog(null,"Gerado cifra com sucesso! ");
            System.out.println("");
        }catch(IllegalArgumentException erro){
        JOptionPane.showMessageDialog(null,"Erro: "+erro);
        }finally{
        JOptionPane.showMessageDialog(null, "Obrigado pela preferência, Volte sempre!");
        }       
        
        int i = 0;
        if(tamanhoPalavra <= tamanhoChave){         
        while(p < alfabeto.length){  
            if(letraPalavra == tamanhoPalavra ){
            System.out.println("");
            break;
            }else if(pal[letraPalavra].equals(alfabeto[i])){
                for(j = 0; j < alfabeto.length; j++){
                   if(ch[letraChave].equals(cifra[k][0])){
                    palavraCifrada[letraPalavra] = cifra[i][k];
                    i = -1;
                    letraChave++;
                    letraPalavra++;
                    break;
                    }
                    k++;
                }
            p++;
            }            
            k = 0;
            i++;
        }
    }else if(tamanhoPalavra > tamanhoChave){         
        while(p < alfabeto.length){  
            if(letraPalavra == tamanhoPalavra ){
            System.out.println("");
            break;
            }else if(pal[letraPalavra].equals(alfabeto[i])){
                for(j = 0; j < alfabeto.length; j++){
                    if(letraChave == tamanhoChave){
                    letraChave = 0;
                    }
                    if(ch[letraChave].equals(cifra[k][0])){
                    palavraCifrada[letraPalavra] = cifra[i][k];
                    i = -1;                    
                    letraChave++;
                    letraPalavra++;
                    break;
                    }
                    k++;
                }
            p++;
            }            
            k = 0;
            i++;
        }
    }        
    return  palavraCifrada;      
    }	
}