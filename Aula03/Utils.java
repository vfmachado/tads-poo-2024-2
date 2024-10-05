public class Utils {
    private String name;
    private static int valor = 0;
    Utils() {
        this.name = "UTILS";
    }

    public static void setValor(int v) {
        valor = v;
    }

    public static int getValor() {
        return valor;
    }

    public String getName() {
        return name;
    }

    public static void mostraVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

}
