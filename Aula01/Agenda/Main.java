package Aula01.Agenda;

public class Main {
    
    public static void main(String[] args) {
        
        // List<Contato> contatos;
        Contato c1 = new Contato();
        c1.nome = "Vinicius";
        c1.email = "vinicius.machado@riogrande.ifrs.edu.br";
        c1.telefone = "5199999999";

        c1.exibe();
        c1.exibeFormatado();

        Contato c2 = new Contato();
        c2.exibeFormatado();


        Contato c3 = new Contato("Theodoro");
        c3.exibeFormatado();

        // tamanho e se o numero faz sentido DD 9 XXXXXXX 
        // c1.atualizarTelefone("124123122");

        // email tem que ter o formato texto @ domino . com
        // c1.atualizarEmail("vini@gmail.com");

    }

}
