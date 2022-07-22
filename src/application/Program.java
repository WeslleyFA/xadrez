package application;

import xadrez.PartidaXadrez;

public class Program {
    public static void main(String[] args) {
        PartidaXadrez novaPartida = new PartidaXadrez();
        UI.printTabuleiro(novaPartida.getPecas());
    }
}
