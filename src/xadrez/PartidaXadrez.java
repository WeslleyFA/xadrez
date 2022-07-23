package xadrez;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.xadrez.pecas.Torre;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;

    public PartidaXadrez() {
        this.tabuleiro = new Tabuleiro(8,8);
        setupInicial();
    }

    public PecaXadrez[][] getPecas(){
        PecaXadrez[][] matriz = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i = 0; i < tabuleiro.getLinhas(); i++){
            for (int j = 0; j < tabuleiro.getColunas(); j++){
                matriz[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }
        return matriz;
    }

    public void setupInicial(){
        tabuleiro.inserePeca(new Torre(tabuleiro, Cor.PRETO), new Posicao(3,2));
    }
}
