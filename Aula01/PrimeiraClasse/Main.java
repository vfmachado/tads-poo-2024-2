package Aula01.PrimeiraClasse;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // declaração
        Caneta c1;

        // instanciar
        c1 = new Caneta(); 

        // junto
        Caneta c2 = new Caneta();

        List<Caneta> canetas;

        c1.cor = "azul";
        c2.cor = "vermelho";
        
        System.out.println("Caneta 1: " + c1.cor);
    }
}
