package ExemploConta;

public class RegistraConta {
    // O MESMO VALE PARA ATRIBUTO ESTATICO
    private static int ultimaGerada = 0;
    
    // METODOS ESTATICOS PERTENCEM A CLASSE, LOGO NAO PRECISAMOS INSTANCIAR UM OBJETO
    public static int criaNumeroConta() {
        ultimaGerada++;
        return ultimaGerada;
    }
}
