public class Qualquer<T> {
    
    private T meuAtributo;

    public T getMeuAtributo() {
        return this.meuAtributo;
    }

    public void print(T parametro) {
        System.out.println("INSTANCIA DA CLASSE MEU TIPO PARAMETRIZADA COM ");
        System.out.println(parametro);
    }

}
