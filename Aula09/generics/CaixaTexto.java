public class CaixaTexto {
    private String item;

    public void guardar(String item) {
        this.item = item;
    }

    public String recuperar() {
        String item = this.item;
        this.item = null;
        return item;
    }

    public boolean estaVazia() {
        return this.item == null;
    }

}
