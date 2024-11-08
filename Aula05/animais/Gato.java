public class Gato implements IEmitirSom {
    private String nome;
    Gato() {
        this.nome = "GATO";
    }
    
    @Override
    public void fazSom() {
        System.out.println("O " + this.nome + " FAZ MIAU");
    }


}
