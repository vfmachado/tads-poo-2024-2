import java.util.List;
import java.util.ArrayList;

public class Agenda {
    
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
    } 

    public void listarContatos() {
        for (int i = 0; i < this.contatos.size(); i++) {
            Contato c = this.contatos.get(i);
            System.out.println(c.getNome());
            System.out.println("\tTel: " + c.getTelefone());

            if (c.getEmail() != null)
            System.out.println("\tEmail: " + c.getEmail());
            System.out.println();
        }
    }

    // nao permitir a inclusao do mesmo contato
    public void addContato(Contato c) {
        this.contatos.add(c);
    }

    // TODO PRINTAR A LISTA E RETORNAR =)
    public List<Contato> procurar(String parteNome) {
        List<Contato> filtrados = new ArrayList<Contato>();
        String parte = parteNome.toUpperCase();
        // for (int i = 0; i < this.contatos.size(); i++) {
        //     Contato c = this.contatos.get(i);
        for (Contato c : this.contatos) {
            if (c.getNome().contains(parte)) {
                filtrados.add(c);
            }
        }


        return filtrados;
    }

    // TODO
    // remover pelo nome


}
