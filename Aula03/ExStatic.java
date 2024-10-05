
public class ExStatic {

    public static void main(String[] args) {
        int [] a = { 1, 2, 3};
        Utils.mostraVetor(a);

        Utils.setValor(2);
        Utils u = new Utils();
        u.setValor(5);
        System.out.println(u.getValor());
    }
}