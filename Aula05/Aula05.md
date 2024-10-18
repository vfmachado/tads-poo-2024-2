## Aula 05: Interfaces; Delegação, Dependência e Acoplamento

### Interface

Uma **interface** em Java é um tipo de referência que define um **contrato** ou conjunto de métodos que uma classe deve implementar. As interfaces são usadas para especificar o comportamento que as classes devem ter, sem fornecer a implementação real desses comportamentos. Ou seja, uma interface contém a **assinatura de métodos** (declaração dos métodos sem corpo), e as classes que implementam a interface são obrigadas a fornecer a implementação para esses métodos.

#### Principais Características de uma Interface:

1. **Métodos Abstratos**: Os métodos de uma interface são, por padrão, públicos e abstratos. Ou seja, eles apenas declaram o que o método deve fazer, mas não contêm código. A classe que implementar a interface precisa definir o que esses métodos farão.
   
2. **Herança Múltipla**: Uma classe pode implementar várias interfaces ao mesmo tempo, o que permite "herança múltipla" (algo que não é possível com classes em Java).

3. **Variáveis em Interfaces**: As variáveis declaradas em uma interface são implicitamente `public`, `static`, e `final` — ou seja, elas são constantes.

4. **Interface vs. Classe Abstrata**: Diferente de uma classe abstrata, a interface não contém implementação de métodos (antes de Java 8), apenas a sua declaração.

5. **Implementação em Java 8+**: A partir do Java 8, as interfaces podem conter métodos com implementação usando **default methods** e **static methods**.

---

### Sintaxe de Interface em Java

```java
public interface NomeDaInterface {
    // Declaração de métodos abstratos (não têm corpo)
    void metodo1();
    void metodo2();
}
```

### Exemplo Simples de Interface

#### Definindo a Interface

```java
public interface Animal {
    void som();    // Declaração do método 'som'
}
```

#### Implementando a Interface em uma Classe

A classe que implementa a interface precisa fornecer a implementação dos métodos definidos na interface.

```java
public class Cachorro implements Animal {
    // Implementação do método 'som'
    @Override
    public void som() {
        System.out.println("O cachorro faz: Au Au");
    }
}
```

#### Outra Classe Implementando a Mesma Interface

```java
public class Gato implements Animal {
    // Implementação do método 'som'
    @Override
    public void som() {
        System.out.println("O gato faz: Miau");
    }
}
```

#### Usando a Interface

```java
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.som();  // Saída: O cachorro faz: Au Au

        Animal gato = new Gato();
        gato.som();  // Saída: O gato faz: Miau
    }
}
```

### Explicação:

1. **Interface `Animal`**: Define um contrato que qualquer classe que implementá-la deve ter o método `som()`.
2. **Classes `Cachorro` e `Gato`**: Ambas implementam a interface `Animal` e fornecem a própria versão do método `som()`.
3. **Polimorfismo**: As interfaces permitem o polimorfismo, ou seja, você pode tratar diferentes classes (como `Cachorro` e `Gato`) de forma uniforme usando a interface `Animal`.

---

### Implementação de Várias Interfaces

Uma classe pode implementar várias interfaces em Java, oferecendo a capacidade de herança múltipla.

```java
public interface Nadador {
    void nadar();
}

public interface Corredor {
    void correr();
}

public class Atleta implements Nadador, Corredor {
    @Override
    public void nadar() {
        System.out.println("O atleta está nadando.");
    }

    @Override
    public void correr() {
        System.out.println("O atleta está correndo.");
    }
}
```

Neste exemplo, a classe `Atleta` implementa duas interfaces (`Nadador` e `Corredor`), e é obrigada a fornecer implementação para ambos os métodos `nadar()` e `correr()`.

---

### Interfaces com Métodos `default` (Java 8+)

A partir do **Java 8**, as interfaces podem ter métodos com corpo (implementação) usando o modificador `default`. Isso permite que novos métodos sejam adicionados às interfaces sem quebrar o código das classes que já as implementam.

```java
public interface Veiculo {
    void acelerar();

    // Método default com implementação
    default void parar() {
        System.out.println("O veículo está parando.");
    }
}

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
```

#### Usando o método `default`:

```java
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar();  // Saída: O carro está acelerando.
        carro.parar();     // Saída: O veículo está parando.
    }
}
```

---

### Quando usar Interfaces?

- **Polimorfismo**: Para fornecer uma maneira de tratar diferentes objetos de maneira uniforme, baseados no mesmo contrato (a interface).
- **Múltiplas Implementações**: Quando diferentes classes precisam implementar os mesmos métodos, mas com comportamentos diferentes.
- **Herança Múltipla**: Quando você quer que uma classe tenha várias funcionalidades sem usar herança de classes múltiplas, já que Java não permite herança múltipla de classes.
- **Desacoplamento**: Ao usar interfaces, você separa a definição do comportamento da implementação, o que promove flexibilidade e facilita a manutenção do código.

---

### Conclusão

Uma **interface** em Java é uma forma poderosa de definir o **contrato** que as classes devem seguir. Ela permite polimorfismo, facilita a implementação de padrões de projeto como **Strategy** e **Factory**, e promove o **desacoplamento** entre os componentes de um sistema. Com a adição de métodos `default` e `static` no Java 8, as interfaces ficaram ainda mais flexíveis, permitindo a adição de novas funcionalidades sem quebrar implementações existentes.



## Delegação, Dependência e Acoplamento

### 1. Delegação

#### 1.1 O que é Delegação?
**Delegação** é um padrão de design em que um objeto confia a outro a responsabilidade de realizar uma tarefa. Em vez de uma classe implementar diretamente uma funcionalidade, ela delega essa responsabilidade a uma classe ou objeto especializado. Esse padrão é útil quando uma classe não deseja lidar diretamente com uma responsabilidade específica, mantendo-se focada em sua função principal.

#### 1.2 Por que usar Delegação?
- **Responsabilidade única**: Delegação mantém cada classe focada em uma única responsabilidade.
- **Flexibilidade**: Facilita a substituição ou alteração do comportamento, mudando apenas a classe para a qual a tarefa foi delegada.
- **Reuso de código**: Permite que classes compartilhem comportamentos sem a necessidade de herança.

#### 1.3 Exemplo de Delegação em Java

Neste exemplo, vamos criar um cenário de impressão onde a classe `Documento` delega a responsabilidade de imprimir à classe `Impressora`.

```java
// Interface Impressora
interface Impressora {
    void imprimir(String conteudo);
}

// Implementação de uma Impressora Concreta
class ImpressoraLaser implements Impressora {
    @Override
    public void imprimir(String conteudo) {
        System.out.println("Impressora a Laser: " + conteudo);
    }
}

// Classe Documento que delega a tarefa de impressão
class Documento {
    private Impressora impressora;

    public Documento(Impressora impressora) {
        this.impressora = impressora;
    }

    public void imprimirDocumento(String conteudo) {
        // Delegando a tarefa de impressão para a impressora
        impressora.imprimir(conteudo);
    }
}

// Testando a delegação
public class Main {
    public static void main(String[] args) {
        Impressora impressora = new ImpressoraLaser();
        Documento documento = new Documento(impressora);
        documento.imprimirDocumento("Este é o conteúdo do documento.");
    }
}
```

#### Explicação do Exemplo:
- A classe `Documento` não realiza a impressão diretamente; ela delega essa responsabilidade para uma instância de `Impressora`.
- A delegação permite que o comportamento de impressão seja alterado facilmente. Se desejarmos usar uma impressora diferente, podemos criar uma nova implementação da interface `Impressora` e passá-la ao `Documento`.

---

### 2. Dependência

#### 2.1 O que é Dependência?
A **dependência** ocorre quando uma classe depende de outra para funcionar corretamente. Isso significa que uma classe usa ou interage com outra classe, seja através de um objeto passado como parâmetro, criando uma instância da classe, ou acessando diretamente seus métodos e atributos.

#### 2.2 Por que a Dependência é importante?
Dependências são inevitáveis em um sistema orientado a objetos, mas um design cuidadoso pode minimizar o impacto dessas dependências, facilitando a manutenção e a extensão do sistema.

- **Dependência direta**: Quando uma classe diretamente cria ou usa outra.
- **Injeção de dependência**: Uma forma mais flexível e modular de fornecer dependências para uma classe, geralmente através de construtores, métodos ou interfaces.

#### 2.3 Exemplo de Dependência em Java

```java
// Classe Pedido que depende de Cliente para funcionar
class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Pedido {
    private Cliente cliente;  // Dependência direta

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void exibirDetalhesPedido() {
        System.out.println("Pedido realizado por: " + cliente.getNome());
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        Pedido pedido = new Pedido(cliente);
        pedido.exibirDetalhesPedido();
    }
}
```

#### Explicação do Exemplo:
- A classe `Pedido` depende da classe `Cliente` para funcionar corretamente. Ela precisa de uma instância de `Cliente` para exibir as informações do pedido.
- Esta é uma **dependência direta**, onde a instância de `Cliente` é passada diretamente no construtor de `Pedido`.

---

### 3. Dependência e Acoplamento

#### 3.1 O que é Acoplamento?
**Acoplamento** refere-se ao grau de interdependência entre classes ou módulos de um sistema. Quando o acoplamento é alto, uma classe depende fortemente de outra, dificultando alterações ou substituições de partes do código sem impactar o restante do sistema.

- **Acoplamento alto**: Indica que as classes estão fortemente interligadas. Mudanças em uma classe provavelmente afetam as outras.
- **Acoplamento baixo**: As classes são mais independentes. Alterações em uma classe têm pouco ou nenhum impacto sobre outras.

#### 3.2 Por que reduzir o Acoplamento?
- **Manutenibilidade**: Sistemas com baixo acoplamento são mais fáceis de manter, pois uma mudança em um componente não afeta diretamente os outros.
- **Reusabilidade**: Classes com baixo acoplamento podem ser reutilizadas em diferentes partes do sistema ou em novos sistemas.
- **Extensibilidade**: Facilita a adição de novas funcionalidades sem alterar a estrutura existente.

#### 3.3 Exemplo de Alto Acoplamento em Java

No exemplo abaixo, o `Relatorio` depende diretamente de uma implementação específica (`BancoDeDados`). Isso cria um acoplamento forte entre as duas classes.

```java
class BancoDeDados {
    public void conectar() {
        System.out.println("Conectando ao Banco de Dados...");
    }
}

class Relatorio {
    private BancoDeDados bancoDeDados = new BancoDeDados();  // Alto acoplamento

    public void gerar() {
        bancoDeDados.conectar();
        System.out.println("Gerando relatório...");
    }
}

public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.gerar();
    }
}
```

#### Explicação do Exemplo:
- A classe `Relatorio` está diretamente acoplada à classe `BancoDeDados`. Se houver mudanças na forma como o banco de dados funciona, será necessário modificar a classe `Relatorio`, o que demonstra alto acoplamento.

#### 3.4 Reduzindo o Acoplamento com Injeção de Dependência

Para reduzir o acoplamento, podemos usar o princípio da **injeção de dependência** (Dependency Injection). Isso permite passar a dependência (`BancoDeDados`) como parâmetro, em vez de criar uma instância diretamente dentro de `Relatorio`.

```java
class BancoDeDados {
    public void conectar() {
        System.out.println("Conectando ao Banco de Dados...");
    }
}

class Relatorio {
    private BancoDeDados bancoDeDados;  // Dependência injetada

    public Relatorio(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void gerar() {
        bancoDeDados.conectar();
        System.out.println("Gerando relatório...");
    }
}

public class Main {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();
        Relatorio relatorio = new Relatorio(bancoDeDados);
        relatorio.gerar();
    }
}
```

#### Explicação do Exemplo:
- Agora, `Relatorio` não cria diretamente uma instância de `BancoDeDados`. Em vez disso, a dependência é passada via construtor, o que reduz o acoplamento.
- Isso facilita a substituição de `BancoDeDados` por outra classe, se necessário, sem modificar a classe `Relatorio`.

---

### 4. Comparação: Alto vs. Baixo Acoplamento

| **Aspecto**        | **Alto Acoplamento**                           | **Baixo Acoplamento**                      |
|--------------------|------------------------------------------------|--------------------------------------------|
| **Mudanças**       | Afetam muitas partes do sistema                | Afetam apenas uma pequena parte do sistema |
| **Reutilização**   | Difícil de reutilizar em outros contextos       | Fácil de reutilizar em outros contextos    |
| **Teste**          | Testes unitários são difíceis de implementar    | Testes unitários são mais simples          |
| **Flexibilidade**  | Baixa flexibilidade para modificações futuras   | Alta flexibilidade e extensibilidade       |

---

### 5. Referências Bibliográficas

- **Design Patterns: Elements of Reusable Object-Oriented Software**, Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides. Um dos livros mais influentes no campo da orientação a objetos e padrões de design.
- **Clean Code: A Handbook of Agile Software Craftsmanship**, Robert C. Martin. Um livro essencial para entender como projetar sistemas com baixo acoplamento e alta coesão.
- **Agile Principles, Patterns, and Practices in C#**, Robert C. Martin e Micah Martin. Um guia