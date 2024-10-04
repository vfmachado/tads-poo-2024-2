### Aula 03: Coesão, Encapsulamento, Associação, Agregação e Composição


### 1. Coesão

#### 1.1 O que é Coesão?
**Coesão** refere-se ao quão relacionados e focados estão os comportamentos (métodos) de uma classe em relação ao seu propósito. Uma classe coesa é aquela que realiza uma única tarefa ou está claramente relacionada a um único conceito.

- **Alta Coesão**: Indica que a classe está focada em uma única responsabilidade, tornando-a mais fácil de entender, modificar e manter.
- **Baixa Coesão**: Indica que a classe está realizando várias tarefas que podem não estar relacionadas entre si, o que a torna mais difícil de manter e propensa a erros.

**Exemplo de Alta Coesão:**

```java
public class Calculadora {
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }
}
```

Aqui, a classe `Calculadora` tem alta coesão, pois está focada em operações aritméticas.

**Exemplo de Baixa Coesão:**

```java
public class Utils {
    public double somar(double a, double b) {
        return a + b;
    }

    public void enviarEmail(String email) {
        // código para enviar email
    }
}
```

No exemplo acima, a classe `Utils` realiza tarefas muito diferentes (somar números e enviar e-mails), o que indica baixa coesão. Uma classe assim deve ser dividida em classes menores e mais focadas.

#### 1.2 Por que Coesão é Importante?
Classes com alta coesão são mais:
- **Fáceis de entender**: Cada classe tem uma responsabilidade clara.
- **Fáceis de manter**: Modificar uma classe com alta coesão não impacta outras partes do código.
- **Reutilizáveis**: Classes focadas em uma única responsabilidade são mais fáceis de reutilizar em outros contextos.

---

### 2. Encapsulamento

#### 2.1 O que é Encapsulamento?
**Encapsulamento** é o conceito de esconder os detalhes internos de uma classe e expor apenas o necessário. Isso significa que os atributos de uma classe devem ser protegidos (normalmente usando o modificador de acesso `private`), e seu acesso deve ser controlado através de métodos (getters e setters).

#### 2.2 Benefícios do Encapsulamento:
- **Proteção dos dados**: Restringe o acesso direto aos atributos e permite controlar como eles são modificados.
- **Facilidade de manutenção**: O comportamento interno de uma classe pode mudar sem afetar o restante do código, desde que os métodos públicos permaneçam os mesmos.
- **Segurança**: Evita que dados inconsistentes sejam definidos ou acessados diretamente.

#### 2.3 Exemplo de Encapsulamento em Java:

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Setter para a idade com validação
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
```

Aqui, os atributos `nome` e `idade` são privados, e o acesso a eles é feito por meio de getters e setters. Isso permite proteger os atributos contra alterações inadequadas.

---

### 3. Associação, Agregação e Composição

#### 3.1 Associação

**Associação** é uma relação entre duas classes onde uma classe "usa" outra. As duas classes podem existir independentemente. Em Java, essa relação é implementada quando um objeto de uma classe contém uma referência a um objeto de outra classe.

##### Exemplo de Associação:

```java
public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Curso {
    private String nome;
    private Aluno aluno;  // Associação entre Curso e Aluno

    public Curso(String nome, Aluno aluno) {
        this.nome = nome;
        this.aluno = aluno;
    }

    public void exibirAluno() {
        System.out.println("Aluno matriculado: " + aluno.getNome());
    }
}
```

Neste exemplo, `Curso` tem uma associação com `Aluno`. Ambos os objetos podem existir independentemente um do outro.

#### 3.2 Agregação

A **agregação** é uma forma especial de associação, onde uma classe é parte de outra, mas pode existir independentemente. A agregação é representada como uma relação "todo-parte", onde o "todo" contém as partes, mas as partes podem existir fora do todo.

##### Exemplo de Agregação:

```java
public class Departamento {
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Empresa {
    private String nome;
    private List<Departamento> departamentos;  // Agregação

    public Empresa(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void exibirDepartamentos() {
        for (Departamento d : departamentos) {
            System.out.println(d.getNome());
        }
    }
}
```

Neste exemplo, uma `Empresa` agrega vários `Departamentos`. Os departamentos podem existir independentemente da empresa.

#### 3.3 Composição

A **composição** é uma relação "todo-parte" mais forte que a agregação. Na composição, as partes não podem existir independentemente do todo. Se o todo for destruído, as partes também são destruídas.

##### Exemplo de Composição:

```java
public class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

public class Carro {
    private String modelo;
    private Motor motor;  // Composição

    public Carro(String modelo, String tipoMotor) {
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor);  // O motor é criado junto com o carro
    }

    public void exibirDetalhes() {
        System.out.println("Carro: " + modelo + ", Motor: " + motor.getTipo());
    }
}
```

Aqui, a classe `Carro` tem uma composição com a classe `Motor`. O motor só existe enquanto o carro existir.

---

### 4. Comparação entre Associação, Agregação e Composição

| Conceito        | Definição                                                                                             | Exemplo                     |
|-----------------|------------------------------------------------------------------------------------------------------|-----------------------------|
| **Associação**  | Relação onde uma classe "usa" outra, mas ambas podem existir independentemente.                       | `Aluno` e `Curso`            |
| **Agregação**   | Relação "todo-parte", onde as partes podem existir independentemente do todo.                         | `Empresa` e `Departamento`   |
| **Composição**  | Relação "todo-parte" mais forte, onde as partes não podem existir sem o todo.                         | `Carro` e `Motor`            |

---

