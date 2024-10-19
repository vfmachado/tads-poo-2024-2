public class Cachorro implements IEmitirSom {
    private String nome;
    Cachorro() {
        this.nome = "CACHORRO";
    }
    
    @Override
    public void fazSom() {
        System.out.println("O " + this.nome + " FAZ AUAU");
    }

    public void morder() {
        System.out.println("CACHORRO MORDE");
    }


}
