import java.awt.Color;
import java.awt.Graphics;

public class Jogador {
    private static final int TAMANHO = 20;
    private int x;
    private int y;
    private int velocidade;
    private Direcao direcao;
    private Color cor;

    private int turbo = 0;

    Jogador() {
        this.x = 0;
        this.y = 200;
        this.cor = Color.BLUE;
        this.velocidade = 5;
        this.direcao = Direcao.DIREITA;
    }

    public void ligaTurbo() {
        if (turbo == 0) turbo = 20;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public void atualiza() {
        int v = this.velocidade;
        if (turbo > 0) {
            v = v * 2;
            turbo--;
        }
        if (this.direcao == Direcao.DIREITA)
            this.x = this.x + v;

        if (this.direcao == Direcao.ESQUERDA)
            this.x = this.x - v;

        if (this.x >= 400 - TAMANHO && this.direcao == Direcao.DIREITA)
            this.direcao = Direcao.ESQUERDA;

        if (this.x <= 0 && this.direcao == Direcao.ESQUERDA)
            this.direcao = Direcao.DIREITA;
    }

    public void desenha(Graphics g) {
        g.setColor(cor);
        g.fillRect(x, y, TAMANHO, TAMANHO);
    }

}
