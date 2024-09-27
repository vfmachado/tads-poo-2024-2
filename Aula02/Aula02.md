### Aula 2: Atributos e Métodos; Abstração, Classes e Instâncias

### 1. O que são Atributos e Métodos?

#### 1.1. Definição de Atributos
Um **atributo** é uma característica ou propriedade de uma classe. Em POO, os atributos representam os dados que uma classe mantém. Eles são variáveis associadas a objetos de uma classe, e cada objeto pode ter valores diferentes para esses atributos.

**Exemplo:** Um objeto da classe `Carro` pode ter os atributos `cor`, `modelo`, e `ano`. Cada objeto carro terá diferentes valores para esses atributos.

```java
public class Carro {
    String cor;
    String modelo;
    int ano;
}
```

#### 1.2. Definição de Métodos
Os **métodos** definem o comportamento de uma classe. Eles são funções que realizam ações específicas e podem interagir com os atributos da classe. Um método pode ser usado para alterar o estado dos atributos ou realizar alguma ação com base nesses valores.

**Exemplo:** Um método `acelerar` dentro da classe `Carro` poderia exibir uma mensagem indicando que o carro está acelerando.

```java
public class Carro {
    String cor;
    String modelo;
    int ano;

    // Método que define o comportamento do carro
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }
}
```

### 2. Abstração, Classes e Instâncias

#### 2.1. Abstração
**Abstração** é o processo de identificar as características essenciais de um objeto e ignorar os detalhes supérfluos. Na programação orientada a objetos, a abstração permite que o programador modele entidades do mundo real no software.

**Exemplo de Abstração:**
Ao modelar um **carro** em um sistema, você pode abstrair os detalhes como cor, modelo, e ano. No entanto, você provavelmente não precisa lidar com a complexidade interna do motor para implementar o comportamento "acelerar".

```java
public class Carro {
    String cor;
    String modelo;
    int ano;

    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando...");
    }
}
```

#### 2.2. Classes
Uma **classe** é um modelo ou "blueprint" a partir do qual os objetos são criados. Ela define os atributos (dados) e métodos (comportamentos) que os objetos dessa classe terão.

- Atributos são as propriedades que caracterizam os objetos.
- Métodos são as ações ou comportamentos que os objetos podem realizar.

**Exemplo de Classe:**

```java
public class Carro {
    String cor;
    String modelo;
    int ano;

    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando...");
    }

    public void frear() {
        System.out.println("O carro " + modelo + " está freando...");
    }
}
```

#### 2.3. Instâncias
Uma **instância** é um objeto concreto criado a partir de uma classe. Cada objeto criado a partir de uma classe é uma instância dessa classe, com seus próprios valores de atributos.

**Exemplo de Instanciamento:**
Aqui criamos dois objetos da classe `Carro`, cada um com atributos diferentes.

```java
public class Main {
    public static void main(String[] args) {
        // Criando instâncias da classe Carro
        Carro carro1 = new Carro();
        carro1.cor = "Vermelho";
        carro1.modelo = "Ferrari";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.cor = "Preto";
        carro2.modelo = "BMW";
        carro2.ano = 2020;

        // Chamando os métodos para cada carro
        carro1.acelerar();
        carro2.frear();
    }
}
```

#### Explicação do Exemplo:
1. **Classe `Carro`**: Definimos os atributos `cor`, `modelo`, e `ano` e dois métodos: `acelerar` e `frear`.
2. **Instâncias `carro1` e `carro2`**: Criamos dois objetos da classe `Carro`, cada um com valores diferentes para os atributos. Chamamos os métodos `acelerar` e `frear` para cada objeto.
3. **Saída**:
   ```
   O carro Ferrari está acelerando...
   O carro BMW está freando...
   ```

### 3. Métodos com Parâmetros e Retorno

Os métodos podem receber **parâmetros** para operar em dados e podem retornar valores para o código que os chamou.

#### 3.1. Métodos com Parâmetros
Um método pode receber valores de entrada chamados parâmetros. Estes são usados para realizar operações ou alterar o estado de um objeto.

**Exemplo de Método com Parâmetro:**

```java
public class Carro {
    String cor;
    String modelo;
    int ano;

    // Método com parâmetro para alterar a cor do carro
    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println("O carro foi pintado de " + novaCor);
    }
}
```

#### 3.2. Métodos com Retorno
Um método também pode retornar um valor para o código que o chamou. O tipo de retorno é definido na assinatura do método.

**Exemplo de Método com Retorno:**

```java
public class Carro {
    String cor;
    String modelo;
    int ano;

    // Método que retorna o ano do carro
    public int obterAno() {
        return this.ano;
    }
}
```

### 4. Exemplo Prático: Definindo Atributos e Métodos

Vamos implementar uma classe completa para reforçar o entendimento de atributos, métodos, instâncias e abstração.

#### Exemplo: Classe `ContaBancaria`

```java
public class ContaBancaria {
    // Atributos
    String titular;
    double saldo;

    // Método construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    // Método para exibir o saldo
    public double consultarSaldo() {
        return this.saldo;
    }
}
```

#### Instanciando e Usando a Classe `ContaBancaria`:

```java
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe ContaBancaria
        ContaBancaria conta1 = new ContaBancaria("João", 1000.00);

        // Realizando operações
        conta1.depositar(500.00);
        conta1.sacar(300.00);

        // Exibindo o saldo final
        System.out.println("Saldo final: R$ " + conta1.consultarSaldo());
    }
}
```

#### Saída Esperada:
```
Depósito de R$ 500.0 realizado com sucesso.
Saque de R$ 300.0 realizado com sucesso.
Saldo final: R$ 1200.0
```


### Modificadores de Acesso

Os **modificadores de acesso** são usados em Java para definir o nível de visibilidade e controle de acesso a classes, atributos, métodos e construtores. Eles determinam de onde esses elementos podem ser acessados dentro do código, seja dentro da própria classe, dentro do pacote, por classes herdeiras ou de qualquer lugar.

Existem quatro principais modificadores de acesso em Java:

1. **`public`**
2. **`private`**
3. **`protected`**
4. **Padrão (sem modificador)**

---

### 1. Modificador `public`

O modificador `public` dá o nível mais amplo de acesso. Qualquer classe, de qualquer lugar do programa, pode acessar um elemento declarado como `public`.

#### Características:
- Acesso total de qualquer parte do código.
- Pode ser acessado por classes de outros pacotes.

#### Exemplo:

```java
public class Carro {
    public String modelo;

    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }
}
```

No exemplo acima, tanto o atributo `modelo` quanto o método `acelerar` são `public`. Isso significa que qualquer classe, em qualquer pacote, pode acessar e modificar o valor do atributo `modelo` ou chamar o método `acelerar`.

---

### 2. Modificador `private`

O modificador `private` restringe o acesso ao nível da própria classe. Ou seja, um membro declarado como `private` só pode ser acessado dentro da própria classe e não por outras classes, mesmo que sejam do mesmo pacote.

#### Características:
- Acesso restrito à própria classe.
- Ideal para encapsulamento, pois protege os dados sensíveis de serem acessados diretamente por outras classes.

#### Exemplo:

```java
public class Carro {
    private String modelo;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }
}
```

Aqui, o atributo `modelo` é `private`, o que significa que ele não pode ser acessado diretamente de fora da classe `Carro`. Para modificar ou obter o valor do `modelo`, usamos os métodos públicos `setModelo` e `getModelo`, implementando o princípio do encapsulamento.

---

### 3. Modificador `protected`

O modificador `protected` permite o acesso ao membro da classe apenas dentro do mesmo pacote e por classes herdeiras (subclasses), mesmo que estejam em pacotes diferentes.

#### Características:
- Acesso permitido para classes do mesmo pacote.
- Classes herdeiras, mesmo que em pacotes diferentes, podem acessar membros `protected`.

#### Exemplo:

```java
public class Veiculo {
    protected String tipo;

    protected void exibirTipo() {
        System.out.println("O tipo de veículo é: " + tipo);
    }
}

public class Carro extends Veiculo {
    public void definirTipo(String tipo) {
        this.tipo = tipo;
    }
}
```

No exemplo, a classe `Carro` herda de `Veiculo` e tem acesso ao atributo `tipo` e ao método `exibirTipo` por causa do modificador `protected`. Embora `tipo` e `exibirTipo` sejam `protected`, eles não estão disponíveis para qualquer classe fora do pacote, a menos que a classe seja uma herdeira.

---

### 4. Modificador Padrão (sem modificador)

Se você não especificar nenhum modificador de acesso, o Java aplicará o **modificador padrão** (também conhecido como **package-private**). Isso significa que o membro só pode ser acessado por classes no mesmo pacote.

#### Características:
- Acesso permitido apenas para classes dentro do mesmo pacote.
- Não pode ser acessado de fora do pacote, nem por herança.

#### Exemplo:

```java
class Carro {
    String modelo;

    void acelerar() {
        System.out.println("O carro está acelerando...");
    }
}
```

No exemplo acima, o atributo `modelo` e o método `acelerar` têm o modificador de acesso padrão. Eles podem ser acessados por outras classes no mesmo pacote, mas não podem ser acessados por classes de outros pacotes.

---

### Comparação dos Modificadores de Acesso

| **Modificador**  | **Mesma Classe** | **Mesmo Pacote** | **Subclasse (outro pacote)** | **Em qualquer lugar** |
|------------------|------------------|------------------|-----------------------------|------------------------|
| `public`         | Sim              | Sim              | Sim                         | Sim                    |
| `private`        | Sim              | Não              | Não                         | Não                    |
| `protected`      | Sim              | Sim              | Sim                         | Não                    |
| **Padrão**        | Sim              | Sim              | Não                         | Não                    |

---

### Boas Práticas para Uso de Modificadores de Acesso

1. **Encapsulamento**: Use `private` para proteger os atributos e métodos que não devem ser acessados diretamente fora da classe. Utilize métodos `get` e `set` para fornecer um controle refinado sobre a leitura e modificação desses atributos.
2. **Controle de Acesso**: Use `protected` para permitir que classes filhas acessem membros da classe pai. Isso é útil quando queremos garantir que apenas subclasses possam acessar certos métodos ou atributos.
3. **Visibilidade Limitada**: O modificador de acesso padrão deve ser utilizado quando você deseja restringir o acesso ao nível do pacote, permitindo que apenas classes relacionadas dentro do mesmo pacote acessem um membro.
4. **Acesso Público**: Use `public` com moderação, especialmente para métodos. A abertura irrestrita do acesso pode comprometer a segurança e modularidade do sistema.

---

### Exemplos Práticos

#### Exemplo 1: Acesso `private` e encapsulamento

```java
public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }
}
```

Aqui, o atributo `saldo` está protegido por ser `private`, mas ele ainda pode ser modificado e acessado de forma controlada por meio dos métodos públicos `depositar` e `consultarSaldo`.

#### Exemplo 2: Acesso `protected` em uma relação de herança

```java
public class Veiculo {
    protected String tipo;

    public void exibirTipo() {
        System.out.println("Tipo de veículo: " + tipo);
    }
}

public class Moto extends Veiculo {
    public void definirTipo(String tipo) {
        this.tipo = tipo;
    }
}
```

Neste exemplo, a classe `Moto`, que herda de `Veiculo`, pode acessar o atributo `tipo` porque ele foi declarado como `protected`.

---



### Getters e Setters

**Getters** e **Setters** são métodos utilizados em Java para acessar e modificar os atributos privados de uma classe. Eles fazem parte do conceito de **encapsulamento**, que é uma prática de programação orientada a objetos que visa proteger os dados de acessos diretos. Em vez de acessar ou modificar diretamente os atributos, usa-se métodos específicos para realizar essas operações de maneira controlada.

- **Getters**: Usados para **obter** (get) o valor de um atributo.
- **Setters**: Usados para **definir** (set) o valor de um atributo.

---

### Por que usar Getters e Setters?

O uso de getters e setters é essencial para proteger os atributos da classe e garantir que sejam acessados ou modificados de maneira adequada. Ao usar esses métodos, é possível:
- **Controlar o acesso** aos atributos (permitindo leitura ou escrita conforme necessário).
- **Aplicar validações** ou regras de negócio ao modificar um valor.
- **Manter a integridade dos dados**, evitando que sejam alterados de forma incorreta.

---

### Definindo Getters e Setters

#### Estrutura de um Getter
Um **getter** é um método público que retorna o valor de um atributo privado. A convenção de nomeação é usar o prefixo `get` seguido do nome do atributo, com a primeira letra em maiúscula.

```java
public TipoDoAtributo getNomeDoAtributo() {
    return this.nomeDoAtributo;
}
```

#### Estrutura de um Setter
Um **setter** é um método público que recebe um valor como parâmetro e o atribui ao atributo privado. A convenção de nomeação é usar o prefixo `set` seguido do nome do atributo, com a primeira letra em maiúscula.

```java
public void setNomeDoAtributo(TipoDoAtributo valor) {
    this.nomeDoAtributo = valor;
}
```

---

### Exemplo Prático: Classe `Pessoa` com Getters e Setters

Vamos criar uma classe `Pessoa` que encapsula os atributos `nome` e `idade`. Esses atributos serão privados, e usaremos getters e setters para acessar e modificar seus valores.

#### Definição da Classe `Pessoa`:

```java
public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo idade
    public int getIdade() {
        return idade;
    }

    // Setter para o atributo idade
    public void setIdade(int idade) {
        if (idade > 0) {  // Validando que a idade deve ser positiva
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. Deve ser maior que zero.");
        }
    }
}
```

#### Explicação:
- O atributo `nome` e `idade` são privados, o que significa que eles só podem ser acessados diretamente de dentro da classe `Pessoa`.
- O método `getNome()` retorna o valor de `nome`.
- O método `setNome(String nome)` permite que o valor de `nome` seja alterado.
- O método `getIdade()` retorna o valor de `idade`.
- O método `setIdade(int idade)` permite que o valor de `idade` seja alterado, mas há uma validação para garantir que a idade seja maior que 0.

---

### Usando Getters e Setters

Agora que temos nossa classe `Pessoa` com getters e setters, podemos criar objetos dessa classe e usar os métodos para acessar e modificar os valores dos atributos.

#### Exemplo de Uso:

```java
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();

        // Usando o setter para definir o nome e a idade
        pessoa1.setNome("João");
        pessoa1.setIdade(25);

        // Usando o getter para acessar o nome e a idade
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        // Tentando definir uma idade inválida
        pessoa1.setIdade(-5);  // Exibe uma mensagem de erro e não altera a idade

        // Exibindo novamente os dados da pessoa
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());  // A idade continua 25
    }
}
```

#### Saída Esperada:

```
Nome: João
Idade: 25
Idade inválida. Deve ser maior que zero.
Nome: João
Idade: 25
```

Neste exemplo:
- Definimos o nome e a idade de `pessoa1` usando os setters.
- Exibimos os valores usando os getters.
- Tentamos definir uma idade inválida, e o método `setIdade()` rejeitou o valor, protegendo o atributo de ser alterado incorretamente.

---

### Vantagens dos Getters e Setters

1. **Encapsulamento**: Atributos privados só podem ser acessados ou modificados por meio dos getters e setters, o que promove encapsulamento e proteção de dados.
   
2. **Validação**: Nos setters, você pode adicionar validações para garantir que o valor atribuído seja válido, como vimos no exemplo da idade.
   
3. **Flexibilidade**: No futuro, se você precisar alterar a forma como o valor de um atributo é calculado ou obtido, pode modificar o getter sem afetar o resto do código que usa a classe.
   
4. **Controle**: Getters e setters permitem controlar exatamente como e quando os atributos podem ser modificados.

---

