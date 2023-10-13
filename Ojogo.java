import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ojogo{
    public static void main(String[] args) {
        //Variaveis
        Sorteio jogo = new Sorteio();
        Bingo novo = new Bingo();
        int[] cartelaJogador;
        int[] cartelaMaquina;
        int[] numSorteados = new int[10];
        int numero;

        // Apresentação
        novo.jogador = JOptionPane.showInputDialog(null, "Digite seu nome", "Novo Jogador", 3);
        novo.boasVindas();
        
        // Carrega as cartelas
        cartelaJogador = novo.gerarCartela();
        cartelaMaquina = novo.gerarCartela();

        // Mostra as cartelas
        JOptionPane.showMessageDialog(null,Arrays.toString(cartelaJogador),"Cartela do jogador: " + novo.jogador,1);
        JOptionPane.showMessageDialog(null,Arrays.toString(cartelaMaquina),"Cartela da Maquina",1);
        
        //Sorteia o primeiro numero
        jogo.sortearNumero(cartelaMaquina,cartelaJogador, novo.jogador);
    }
}
