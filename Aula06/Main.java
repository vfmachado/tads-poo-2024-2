public class Main {
    public static void main(String[] args) {
        
        Administrador admin = new Administrador("vini", "vini@gmail.com", "1234");

        System.out.println(admin.getNome());
        admin.inserirItem();

        admin.consultarEstoque("TONNER");

        // Usuario usuarioComum = new Usuario("daniel", "daniel@gmail.com", "4321");

        Funcionario funcionario = new Funcionario("Felipe", "felipe@gmail.com", "7654");

        funcionario.consultarEstoque("PAPEL");
    }
}