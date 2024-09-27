### Aula 1: Introdução à Programação Orientada a Objetos (POO)

#### Objetivo da Aula
Conceito de Programação Orientada a Objetos (POO), entender sua importância no desenvolvimento de software, comparar a POO com a programação procedural, e conhecer os conceitos fundamentais de objetos e classes. A aula será finalizada com um exemplo prático de implementação de uma classe simples.



---

### 1. Introdução à Programação Orientada a Objetos

#### 1.1. O que é Programação Orientada a Objetos?
A Programação Orientada a Objetos (POO) é um paradigma de programação baseado no conceito de **objetos**, que são instâncias de **classes**. Em vez de criar programas estruturados apenas com funções e dados separados (como na programação procedural), a POO organiza o software em torno de objetos que combinam tanto os dados quanto o comportamento.

##### Principais Características da POO:
- **Modularidade**: facilita a organização do código em componentes reutilizáveis.
- **Reusabilidade**: classes podem ser reutilizadas em diferentes partes do programa.
- **Manutenibilidade**: código bem estruturado e orientado a objetos é mais fácil de modificar e expandir.
- **Escalabilidade**: programas orientados a objetos são mais fáceis de escalar à medida que crescem.

#### 1.2. Importância da POO
A POO permite a criação de sistemas complexos de forma mais organizada, escalável e de fácil manutenção. Muitas linguagens modernas, como Java, Python, C++, e C#, são baseadas em POO. A abordagem orientada a objetos ajuda a encapsular dados, evitando dependências diretas entre diferentes partes do programa, o que aumenta a segurança e diminui o acoplamento.

### 2. Comparação: POO vs. Programação Procedural

#### 2.1. Programação Procedural
A programação procedural é um paradigma que organiza o código em funções e procedimentos. O foco está em criar rotinas ou procedimentos que manipulam os dados, de forma separada.

##### Características da Programação Procedural:
- Estrutura baseada em funções e procedimentos.
- Os dados e as funções são separados.
- Maior dificuldade em manter programas grandes.
- Dificuldade em reaproveitar código.

#### 2.2. Diferença entre POO e Procedural
- **Procedural**: O foco está nas ações e rotinas (procedimentos) que o programa executa. Os dados são passados entre funções.
- **POO**: O foco está nos objetos que representam entidades do mundo real ou abstrato. Os objetos encapsulam tanto os dados quanto as ações que podem ser executadas sobre eles.

| **Aspecto**        | **Programação Procedural**       | **Programação Orientada a Objetos** |
|--------------------|----------------------------------|------------------------------------|
| Estrutura          | Baseada em funções/procedimentos | Baseada em classes/objetos         |
| Organização        | Funções e dados separados        | Dados e métodos encapsulados      |
| Reutilização       | Difícil de reutilizar funções    | Facilmente reutilizável por meio de classes e objetos |
| Escalabilidade     | Difícil de escalar em grandes projetos | Melhor adaptação a grandes sistemas |

### 3. Conceitos Fundamentais de POO

#### 3.1. O que são Objetos?
Um **objeto** é uma instância de uma **classe**. Ele representa uma entidade do mundo real ou abstrata, com seus próprios atributos (dados) e métodos (comportamento). 

Exemplo: Se tivermos uma classe `Carro`, podemos criar objetos como `carro1`, `carro2`, etc. Cada objeto pode ter atributos diferentes, como cor e modelo, mas todos compartilham o mesmo comportamento (métodos), como "acelerar" ou "frear".

#### 3.2. O que é uma Classe?
Uma **classe** é um "molde" ou "projeto" a partir do qual os objetos são criados. Ela define os atributos e comportamentos que os objetos desse tipo terão.

- **Atributos**: São as propriedades de uma classe (por exemplo, `cor`, `modelo`, `ano` de um carro).
- **Métodos**: São as funções que definem o comportamento da classe (por exemplo, `acelerar()`, `frear()`).

### 4. Exemplo Prático: Criando uma Classe Simples

#### 4.1. Exemplo: Classe `Carro`

Aqui está um exemplo de como criar uma classe `Carro` em Java:

```java
// Definição da Classe Carro
public class Carro {
    // Atributos (propriedades)
    String cor;
    String modelo;
    int ano;

    // Método construtor
    public Carro(String cor, String modelo, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para acelerar
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }

    // Método para frear
    public void frear() {
        System.out.println("O carro está freando...");
    }

    // Método para exibir as informações do carro
    public void exibirInfo() {
        System.out.println("Carro: " + modelo + " (" + cor + ", " + ano + ")");
    }
}
```

#### 4.2. Criando um Objeto da Classe `Carro`

```java
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro carro1 = new Carro("Vermelho", "Ferrari", 2022);

        // Acessando métodos do objeto
        carro1.acelerar();
        carro1.frear();
        carro1.exibirInfo();
    }
}
```

#### Explicação do Exemplo:
1. **Classe `Carro`**: Define os atributos `cor`, `modelo` e `ano`. Possui três métodos: `acelerar()`, `frear()`, e `exibirInfo()`.
2. **Objeto `carro1`**: Foi criado a partir da classe `Carro` com os valores `"Vermelho"`, `"Ferrari"`, e `2022` para seus atributos.
3. **Métodos**: São chamados diretamente no objeto `carro1`, como `acelerar()` e `exibirInfo()`, que mostra as informações do carro.

---


**Material Adicional**: 
- [Documentação Java: Classes e Objetos](https://docs.oracle.com/javase/tutorial/java/concepts/class.html)
- [Tutorial de POO em Java](https://www.w3schools.com/java/java_oop.asp)

