public class Caixa<T> {
    
    private T item;

    public void guardar(T item) {
        this.item = item;
    }

    public T recuperar() {
        T item = this.item;
        this.item = null;
        return item;
    }

    public boolean estaVazia() {
        return this.item == null;
    }

    public void olharDentro() {
        System.out.println(this.item);
    }

}
