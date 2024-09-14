import java.util.List;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        String matricula;
        float[] notas;
        boolean aprovado;

        // SERIA MUITO RUIM DE LIDAR
        List<String> nomes;
        List<String> matriculas;
        float [][] notasTodas;
        
        
        // programa simples em java que recebe os dados do aluno, as notas e diz se ele(a) foi aprovado.
    
        System.out.println("informe nome e matricula");
        nome = in.nextLine();
        matricula = in.next();

        System.out.println("Informe as 3 notas");
        notas = new float[3];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = in.nextFloat();
        }

        float media = Exemplo.media(notas);
        // aprovado = media >= 7 ? true : false
        if (media >= 7) {
            aprovado = true;
        } else {
            aprovado = false;
        }

        System.out.print("Aluno(a) " + nome  + " Mat. " +  matricula + " foi ");
        System.out.print(aprovado ? "Aprov" : "Reprov");
        System.out.println(" com media " + media);

    }
}
