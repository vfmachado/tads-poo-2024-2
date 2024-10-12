import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//panel => painel
public class Jogo extends JPanel implements ActionListener {
    private final int LARGURA = 400;
    private final int ALTURA = 400;

    private Jogador jogador;

    Jogo() {
        System.out.println("INICIANDO O JOGO");
        setFocusable(true);
        addKeyListener(new Controle());
        jogador = new Jogador();
        setPreferredSize(new Dimension(LARGURA, ALTURA));
        Timer temporizador = new Timer(17, this);
        temporizador.start();
    }

    private void atualizar() {
        jogador.atualiza();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        atualizar();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // alterando a cor
        // g.setColor(Color.BLUE);
        // g.drawRect(this.posX, 50, 50, 50);
        // g.fillRect(posX, ABORT, WIDTH, HEIGHT);
        jogador.desenha(g);
    }

    private class Controle extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent tecla) {
            System.out.println("TECLA " + tecla.getKeyChar());
            switch (tecla.getKeyCode()) {
                case KeyEvent.VK_D:
                    jogador.setDirecao(Direcao.DIREITA);
                    break;
                
                case KeyEvent.VK_A:
                    jogador.setDirecao(Direcao.ESQUERDA);
                    break;
                
                case KeyEvent.VK_SPACE:
                    jogador.ligaTurbo();
                    break;
            }
        }
    }
}
