import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Sorteio{
    void sortearNumero(int[] lista1, int[] lista2, String nome) {
        ArrayList lista = new ArrayList();
        ArrayList sorteado = new ArrayList();
        ArrayList acertoMaquina = new ArrayList();
        ArrayList acertoJogador = new ArrayList();
        Random rand = new Random();
        int numeroSorteado;
        // Cria a primeira lista com x elementos
        for(int a = 1; a < 100; a++){
            lista.add(a);
        }
        int tamLista = lista.size();
        int vencedor = 0;

        for(int a = 1; tamLista > 1 && vencedor == 0;a++){
        // Conta os elementos da lista
        tamLista = lista.size();
        //System.out.println(lista);
        //Sorteia uma posicao da lista
        int indice = rand.nextInt(tamLista);
        numeroSorteado = (int)lista.get(indice);
        JOptionPane.showMessageDialog(null,
                String.format("O número sorteado foi \n %d",numeroSorteado),
                "SORTEIO",1);
        //Adiciona na outra lista
        sorteado.add(numeroSorteado);
        lista.remove(indice);
    
        //Confere a cartela da maquina
        for(int n:lista1){
            if(n == numeroSorteado){
                acertoMaquina.add(numeroSorteado);
                JOptionPane.showMessageDialog(null, "Acertou Maquina");
            }
        }
    
    //Confere a cartela do jogador
        for(int n:lista2){
            if(n == numeroSorteado){
                acertoJogador.add(numeroSorteado);
                JOptionPane.showMessageDialog(null, "Acertou, " + nome);
            }
        }
    // verifica se tem um vencedor
        if(acertoJogador.size() == 25 || acertoMaquina.size() == 25){
            JOptionPane.showMessageDialog(null,"BINGO");
            JOptionPane.showMessageDialog(null,"Temos um vencedor");
            
            if(acertoJogador.size() > acertoMaquina.size()){
                JOptionPane.showMessageDialog(null,"O Vencedor foi o Jogador");
            }else{
                JOptionPane.showMessageDialog(null,"O vencedor foi a maquina");
            }
            
            
            vencedor = 1;
        }

    
    }

        System.out.println(acertoJogador);
        System.out.println(acertoMaquina);
        System.out.println("Acabou o sorteio\n");
    }
    
}

        
