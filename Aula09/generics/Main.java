import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();

        lista.add("TEXTO");
        lista.add(5);
        // lista.add(new MeuTipo());

        // for (Object object : lista) {
        //     System.out.println(object);
        // }

        ArrayList<String> deTexto = new ArrayList<String>();

        ArrayList<Comando> comandos;


        Qualquer<Integer> meuInteiroQualquer;


        var caixa = new Caixa();

        System.out.println(caixa.estaVazia());
        caixa.guardar("SENHA");

        System.out.println(caixa.estaVazia());

        var recuperado =  caixa.recuperar();
        System.out.println(recuperado);

        System.out.println(caixa.estaVazia());

        Caixa<Brinquedo> c2 = new Caixa<Brinquedo>();
        c2.guardar(new Brinquedo());
        c2.olharDentro();
        var brinquedo = c2.recuperar();
        brinquedo.brincar();
        System.out.println(brinquedo.getClass().getName());

        caixa.guardar(new Brinquedo());
        caixa.olharDentro();
        var brinquedo2 = caixa.recuperar();
        ((Brinquedo) brinquedo2).brincar();
        System.out.println(brinquedo2.getClass().getName());
    }
}