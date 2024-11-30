import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private String status;
    private List<Pizza> pizzas;

    private List<ObservadorPedido> observadores;

    // cozinha poderia ser um singleton ja que possivelmente só existe uma no restaurante
    Pedido(Cozinha cozinha) {
        observadores = new ArrayList<ObservadorPedido>();
        observadores.add(cozinha);

        setStatus("criado");
    }

    public void addObservador(ObservadorPedido outroObservadorPedido) {
        observadores.add(outroObservadorPedido);
    }

    // public void removeObservador()

    public String getStatus() {
        return status;
    }   

    public void setStatus(String novoStatus) {
        this.status = novoStatus;
        avisarTodoMundo();  // notificar os observadores
    }

    // normalmente, ao implementar o observer
    // utilizamos um metodo privado pq isto esta relacionado a regra da classe
    // que percorre a lista de observadores e executa o método atualizar
    private void avisarTodoMundo() {
        for (ObservadorPedido observador : observadores) {
            observador.atualizar(this);
        }
    }
}
