import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String massa;
    private String tamanho;     // ENUM seria mais inteligente
    private String borda;
    private String molho;

    private List<Ingrediente> ingredientes;

    private String status;

    // preço
    public float preco() {
        float valor = 20.0f;

        if (borda != null) {
            valor += 10;
        }

        for (int i = 0; i < ingredientes.size(); i++) {
            valor = valor + ingredientes.get(i).getCusto();
        }
        return valor;
    }


    private Pizza(Builder builder) {
        
        if (builder.tamanho == null) {
            throw new IllegalStateException("tamanho é obrigatorio");
        }

        this.massa = "fina";
        this.tamanho = builder.tamanho;
        this.borda = builder.borda;
        this.molho = builder.molho;
        this.ingredientes = builder.ingredientes;

        this.status = "preparando...";
    }

    public void setStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String getStatus() {
        return this.status;
    }


    @Override
    public String toString() {
        return "Pizza {" + 
            "\n  tamanho = " + tamanho +
            "\n  massa = " + massa +
            "\n  borda = " + borda +
            "\n  molho = " + molho +
            "\n  ingredientes = " + ingredientes.stream().map(Ingrediente::getNome).toList() +
            "\n\n  preco  = " + preco() +
            "\n}";
    }


    // O BUILDER SÓ É UTILIZADO PARA INSTANCIAR A CLASSE
    // CASO EU PRECISE MODIFICAR EU DEVO CRIAR METODOS QUE PERMITEM A MODIFICAÇÃO DIRETAMENTE NA CLASSE
    public void addIngrediente(Ingrediente maisIngrediente) {
        // TODO IMPLEMENTACAO AQUI
    }


    // BUILDER - construtor
    // MUITOS PARAMETROS OPCIONAIS
        // DIMINUI A NECESSIADDE DE MUITOS CONSTRUTORES, CADA UM UMA ASSINATURA
    // OBJETO É IMUTÁVEL (os parametros nao sao alterados depois de construido)
        // construido sequencial
    // FACILIDADE DE MANUTENÇÃO
    // FACILIDADE DE LEITURA
    // LOGICA FACIL DE LER DURANTE A CONSTRUÇÃO (VIDE A EXCEÇAO)
    public static class Builder {

        // NAO PRECISA TER TODOS OS PARAMETROS OBRIGATORIAMENTE
        private String tamanho;     // ENUM seria mais inteligente
        private String borda;
        private String molho;

        private List<Ingrediente> ingredientes;

        // tem construtor
        Builder() {
           // seta as configurações iniciais da pizza 
           ingredientes = new ArrayList<Ingrediente>();
           this.molho = "tomate";
        }

        // VAO EXISTIR METODOS NA CLASSE BUILDER QUE PERTENCE A CLASSE PAI (PIZZA)
        // QUE VAO ME AUXILIAR NA CONSTRUÇÃO DO ESTADO INICIAL PIZZZA
        public Builder tamanho(String tamanho) {
            this.tamanho = tamanho;
            return this;
        }

        public Builder borda(String borda) {
            this.borda = borda;
            return this;
        }

        public Builder molho(String molho) {
            this.molho = molho;
            return this;
        }

        public Builder adicionarIngrediente(Ingrediente ingrediente) throws Exception {

            // TODO consulta estoque
            // if (estoque.disponivel(ingrediente) < 0)
            if (ingrediente.getNome().equals("file")) {
                throw new Exception("Ingrediente " + ingrediente.getNome() + " nao disponivel");
            }

            this.ingredientes.add(ingrediente);
            return this;
        }

        // constroi a instancia da pizza
        public Pizza build() {
            return new Pizza(this);
        }

    }
}