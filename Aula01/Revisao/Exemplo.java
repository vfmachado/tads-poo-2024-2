public class Exemplo {

    public static float media(float[] n) {
        float soma = 0;
        for (int i = 0; i < n.length; i++) {
            soma = soma + n[i];
        }
        return soma/n.length;
    }

    public static void main(String[] args) {
p
        float [] notas = { 8, 9, 7.5f, 10, 8.5f, 9.3f};

        float resultado = media(notas);

        System.out.println("MEDIA DOS VALORES = " + resultado);

    }


}