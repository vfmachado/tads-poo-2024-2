## Aula 6: Herança e Polimorfismo - Parte 1

## Classe Abstrata

Uma **classe abstrata** em Java é uma classe que **não pode ser instanciada diretamente**. Ela é usada como uma base para outras classes e pode conter métodos abstratos (métodos que não têm implementação) e métodos concretos (métodos que já possuem implementação). O objetivo de uma classe abstrata é fornecer uma estrutura comum para as subclasses que irão estendê-la, garantindo que essas subclasses implementem certos métodos.

#### Características de uma Classe Abstrata:

1. **Métodos Abstratos e Concretos**: Uma classe abstrata pode conter tanto métodos abstratos (sem implementação) quanto métodos concretos (com implementação).
   
2. **Não Pode Ser Instanciada**: Não é possível criar uma instância de uma classe abstrata diretamente. Ela só pode ser estendida por outra classe concreta (ou outra classe abstrata).
   
3. **Herança**: Classes abstratas são usadas para criar uma hierarquia de classes. A classe que herda a classe abstrata deve fornecer a implementação dos métodos abstratos ou, ela própria, deve ser declarada como abstrata.
   
4. **Construtores**: Uma classe abstrata pode ter construtores, que são chamados quando suas subclasses são instanciadas.

---

### Sintaxe de uma Classe Abstrata

```java
public abstract class Animal {
    // Método abstrato (sem corpo)
    public abstract void fazerSom();

    // Método concreto (com implementação)
    public void dormir() {
        System.out.println("O animal está dormindo.");
    }
}
```

#### Implementando uma Classe Abstrata

Quando uma classe concreta herda de uma classe abstrata, ela precisa implementar todos os métodos abstratos da classe abstrata.

```java
public class Cachorro extends Animal {
    // Implementando o método abstrato
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au");
    }
}
```

#### Usando a Classe Abstrata

```java
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.fazerSom();  // Saída: O cachorro faz: Au Au
        cachorro.dormir();    // Saída: O animal está dormindo.
    }
}
```

---

### Diferença entre Classe Abstrata e Interface

Tanto **classes abstratas** quanto **interfaces** em Java são usadas para fornecer uma estrutura ou um contrato que outras classes devem seguir. No entanto, elas têm diferenças fundamentais em como funcionam e quando devem ser usadas.

| **Aspecto**               | **Classe Abstrata**                              | **Interface**                              |
|---------------------------|--------------------------------------------------|--------------------------------------------|
| **Instanciação**           | Não pode ser instanciada.                        | Não pode ser instanciada.                  |
| **Métodos**                | Pode ter métodos abstratos e concretos.          | Antes do Java 8, só métodos abstratos; a partir do Java 8, pode ter métodos `default` e `static`. |
| **Construtores**           | Pode ter construtores.                          | Não pode ter construtores.                 |
| **Atributos**              | Pode ter atributos de instância (variáveis) normais. | Atributos são sempre `public static final` (constantes). |
| **Herança**                | Uma classe só pode herdar de uma única classe abstrata. | Uma classe pode implementar várias interfaces. |
| **Visibilidade de Métodos**| Pode ter qualquer modificador de acesso (`public`, `protected`, `private`). | Todos os métodos são `public` por padrão.  |
| **Quando usar?**           | Quando há uma relação de herança clara e comportamentos compartilhados. | Quando várias classes precisam seguir o mesmo contrato, mas não compartilham necessariamente uma implementação. |

---

### Comparação Prática: Classe Abstrata vs. Interface

#### Exemplo de Classe Abstrata:

```java
// Definindo uma classe abstrata Animal
public abstract class Animal {
    // Método abstrato
    public abstract void fazerSom();

    // Método concreto
    public void mover() {
        System.out.println("O animal está se movendo.");
    }
}

// Implementação de uma classe concreta Cachorro
public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au");
    }
}
```


#### Diferenças Notáveis:

- **Herança Múltipla**: Uma classe abstrata só pode ser estendida por uma única classe (herança simples), mas uma interface pode ser implementada por várias classes e uma classe pode implementar várias interfaces.
  
- **Implementação de Métodos**: Na interface, todos os métodos eram abstratos antes do Java 8. Com o Java 8+, as interfaces podem ter métodos `default` e `static`, enquanto as classes abstratas sempre puderam ter métodos com implementação.

---

### Quando Usar Classe Abstrata vs. Interface

#### Usar **Classe Abstrata** quando:
1. **Há uma relação de "é um"**: Quando existe uma relação clara de herança entre as classes (por exemplo, um `Cachorro` "é um" tipo de `Animal`).
2. **Comportamentos compartilhados**: Se você deseja fornecer métodos compartilhados entre todas as classes que herdam da classe abstrata, com a possibilidade de sobrescrever alguns deles.
3. **Necessidade de atributos de instância**: Se você precisa que todas as classes que herdam da classe abstrata compartilhem atributos de instância.

#### Usar **Interface** quando:
1. **Quer definir um contrato**: Quando várias classes devem seguir o mesmo conjunto de métodos, mas não compartilham necessariamente uma relação direta entre si (por exemplo, `Carro` e `Aviao` podem implementar a interface `Veiculo`, mas não são tipos de `Veiculo`).
2. **Herança múltipla**: Se você precisa que uma classe implemente comportamentos de múltiplas fontes (já que Java não suporta herança múltipla, mas permite a implementação de múltiplas interfaces).
3. **Flexibilidade no design**: Interfaces oferecem maior flexibilidade, pois qualquer classe pode implementá-las, independentemente da hierarquia de classes.

---

### Conclusão

- **Classes Abstratas** são usadas quando existe uma forte relação de herança entre classes, compartilhando comportamentos e atributos.
- **Interfaces** são usadas para definir contratos que diferentes classes devem seguir, permitindo flexibilidade e múltiplas implementações sem a necessidade de uma hierarquia de herança.

