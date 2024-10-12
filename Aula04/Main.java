import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        // janela
        JFrame janela = new JFrame("APP");

        // o que fazer quando clicar no X
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // tamanho
        // janela.setSize(400, 400);
        Jogo jogo = new Jogo();
        janela.add(jogo);
        janela.pack();  // para a janela calcular o seu tamanho baseada nos componentes

        // mostra
        janela.setVisible(true);

    }
}