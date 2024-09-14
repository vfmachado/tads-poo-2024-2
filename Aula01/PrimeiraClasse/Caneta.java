package Aula01.PrimeiraClasse;

public class Caneta {

    String cor;
    String marca;
    String tipoMaterial;
    String tipoTinta;
    float carga;
    float preco;
    float espessuraDaPonta;
    boolean tampada;

    // escrever
    public void escrever() {
        if (tampada) System.out.println("DEU ERRO");
        else System.out.println("Estou escrevendo...");
    }


    public void destampar() {
        tampada = false;
    }

    public void tampar() {
        if (!tampada)
            tampada = true;
    }

}
