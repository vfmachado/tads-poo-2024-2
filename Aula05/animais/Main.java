import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro();
        Gato g1 = new Gato();

        List<IEmitirSom> animais = new ArrayList<IEmitirSom>();

        List<Cachorro> dogs; //apenas cachorros
        List<Gato> cats;    //apenas gatos

        animais.add(c1);
        animais.add(g1);

        for (IEmitirSom animal : animais) {
            animal.fazSom();
            // comportamento diferente quando cachorro
            System.out.println(animal.getClass().getName());
        }
    }
}