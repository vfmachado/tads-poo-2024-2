public class Ingrediente {
    
    private String nome;
    private float custo;

    Ingrediente(String nome) {
        this(nome, 3.00f);
    }

    Ingrediente(String nome, float custo) {
        this.nome = nome;
        this.custo = custo;
    }

    public String getNome() {
        return this.nome;
    }

    public float getCusto() {
        return this.custo;
    }
}
