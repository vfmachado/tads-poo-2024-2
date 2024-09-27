

public class Main {
    public static void main(String[] args) {

        Contato c1 = new Contato();
        
        c1.setNome("  ViNi ");
        System.out.println(c1.getNome());

        Contato c2 = new Contato("Theo");
        System.out.println(c2.getNome());

        Contato c3 = new Contato("Jairfer", "53984232323");

        Agenda agenda = new Agenda();
        agenda.addContato(c1);
        agenda.addContato(c1);  // nao pode ser possivel
        agenda.addContato(c2);
        agenda.addContato(c3);

        agenda.listarContatos();

    }
}