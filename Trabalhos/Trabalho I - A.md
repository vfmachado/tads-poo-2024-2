# TRABALHO I - Modelo A

**Sistema de Reserva de Quartos em um Sistema Multihotel**. 

### Estrutura do Trabalho:

**Descrição do Sistema**:
O sistema é um software de reserva de quartos que permite gerenciar múltiplos hotéis. Ele deve permitir que os clientes façam reservas de quartos em diferentes hotéis, administradores gerenciem os quartos disponíveis e as reservas, e que o sistema mantenha informações de todos os hotéis. 

**Classes Principais e Relações**:

1. **Hotel**
   - **Atributos**: nome, endereço, listaDeQuartos.
   - **Métodos**: adicionarQuarto(), removerQuarto(), listarQuartosDisponiveis().
   - **Relação**: Um hotel tem vários quartos (agregação).

2. **Quarto**
   - **Atributos**: número, tipo, preço, estáDisponível.
   - **Métodos**: reservar(), liberar().
   - **Relação**: O quarto é associado a uma reserva quando reservado (associação).

3. **Reserva**
   - **Atributos**: cliente, quarto, dataCheckIn, dataCheckOut.
   - **Métodos**: confirmarReserva(), cancelarReserva().
   - **Relação**: A reserva está associada a um cliente e a um quarto específico (composição).

4. **Cliente**
   - **Atributos**: nome, email, telefone.
   - **Métodos**: fazerReserva(), cancelarReserva().
   - **Relação**: Um cliente pode ter várias reservas (associação).

5. **Administrador**
   - **Atributos**: nome, id.
   - **Métodos**: adicionarHotel(), removerHotel().

### Princípios POO Aplicados:

- **Coesão**: Cada classe possui uma responsabilidade única e bem definida. Por exemplo, a classe `Hotel` cuida apenas das operações relacionadas ao gerenciamento de quartos do hotel.
- **Visibilidade**: Todos os atributos são privados e acessíveis apenas por métodos públicos ou protegidos, de forma a garantir o encapsulamento.
- **Associação**: A classe `Reserva` está associada tanto a `Cliente` quanto a `Quarto`, pois a reserva precisa saber quem reservou e qual quarto foi reservado.
- **Agregação**: A classe `Hotel` agrega a classe `Quarto`, pois um hotel é composto por vários quartos, mas os quartos podem existir sem o hotel no sistema (poderiam ser movidos).
- **Composição**: A classe `Reserva` possui um relacionamento de composição com `Quarto`, pois uma reserva só existe quando associada a um quarto específico.

### Sugestão de Menu para `Main.java`:

Utilizando um menu baseado em `switch case`, o arquivo `Main.java` deve oferecer as seguintes ações:

1. **Adicionar um Novo Hotel**
   - Solicita o nome e endereço do hotel, e o adiciona à lista de hotéis.

2. **Listar Todos os Hotéis**
   - Lista os hotéis registrados no sistema.

3. **Adicionar Quarto a um Hotel**
   - Solicita o nome do hotel, número do quarto, tipo, e preço, e adiciona o quarto ao hotel selecionado.

4. **Listar Quartos Disponíveis em um Hotel**
   - Solicita o nome do hotel e lista todos os quartos disponíveis.

5. **Fazer Reserva**
   - Solicita informações do cliente e detalhes da reserva, como hotel, número do quarto, data de check-in e check-out.

6. **Cancelar Reserva**
   - Solicita o número da reserva e realiza o cancelamento.

7. **Listar Reservas de um Cliente**
   - Solicita o nome do cliente e lista todas as reservas associadas.

8. **Sair**
   - Encerra o programa.

### Exemplo de Código Simplificado (`Main.java`):

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaReservas sistema = new SistemaReservas();
        int opcao;

        do {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Adicionar Novo Hotel");
            System.out.println("2. Listar Todos os Hotéis");
            System.out.println("3. Adicionar Quarto a um Hotel");
            System.out.println("4. Listar Quartos Disponíveis em um Hotel");
            System.out.println("5. Fazer Reserva");
            System.out.println("6. Cancelar Reserva");
            System.out.println("7. Listar Reservas de um Cliente");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    sistema.adicionarHotel();
                    break;
                case 2:
                    sistema.listarHoteis();
                    break;
                case 3:
                    sistema.adicionarQuarto();
                    break;
                case 4:
                    sistema.listarQuartosDisponiveis();
                    break;
                case 5:
                    sistema.fazerReserva();
                    break;
                case 6:
                    sistema.cancelarReserva();
                    break;
                case 7:
                    sistema.listarReservasCliente();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 8);

        scanner.close();
    }
}
```

### Objetivo do Trabalho:

1. **Modelar o Sistema**: Criar um diagrama de classes UML representando as classes descritas, suas relações e seus atributos/métodos.
2. **Implementar as Classes**: Implementar as classes em Java, respeitando os princípios de visibilidade e coesão.
3. **Implementar o Menu Principal**: Desenvolver o `Main.java` com o menu para interagir com o sistema.
4. **Documentar**: Cada classe deve ser bem documentada, explicando o motivo dos atributos e métodos, bem como o relacionamento entre as classes.

### Critérios de Avaliação:

- **Modelagem**: Correção e coerência do diagrama de classes.
- **Código**: Aplicação correta dos princípios de POO, uso adequado de visibilidade, coesão e relacionamentos.
- **Funcionalidade**: Implementação correta do menu e das funcionalidades descritas.
- **Documentação**: Clareza na explicação do código e nos comentários. 
