import java.util.Random;

import javax.swing.JOptionPane;

public class Bingo{
        String jogador;
 
    void boasVindas(){
        JOptionPane.showMessageDialog(null,"Seja bem vindo " + jogador,"Inicio do Jogo",1);
     }

    int[] gerarCartela(){
        int[] nSorteado = new int[25];
        int nSorteio = 25;
        Random sorteando = new Random();
        int b = 0;
            while(b < nSorteio){
            int achou = 0;    
            int oSorteio = sorteando.nextInt(100);
            
            for(int a = 0 ; a < nSorteio && achou == 0 ; a++){
                if(nSorteado[a] == oSorteio){
                    achou = 1 ;
                }    
            }        
            
            if(achou == 0){
            nSorteado[b] = oSorteio;
            b++;    
            }
        
                
        
        }
    return nSorteado; 
    }
}