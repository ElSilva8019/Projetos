public class Cartela{

    int[] aCartela{
        int[] nSorteado = new int[25];
        int nSorteio = 5;
        Random sorteando = new Random();

        // Gera os numeros
        int b = 0;
        while(b < nSorteio){
            int achou = 0;    
            // Sorteia o numero
            int oSorteio = sorteando.nextInt(100);
            // Verifica se o numero esta no vetor
            for(int a = 0 ; a < nSorteio && achou == 0 ; a++){
                if(nSorteado[a] == oSorteio){
                    achou = 1 ;
                }    
            }        
            
            if(achou == 0){
            // insere o numero no vetor
            //JOptionPane.showMessageDialog(null,oSorteio);
            nSorteado[b] = oSorteio;
               b++;    
            }
        
            // Exibe o numero na tela
        
                // aumenta o contador em 1
        }

        // Numeros Sorteados       
        for(int pVetor = 0 ; pVetor < nSorteio ; pVetor++){
            System.out.println(nSorteado[pVetor]);    
        }


    }




}