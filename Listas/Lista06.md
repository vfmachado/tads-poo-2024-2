## Lista de Exercícios 06 - Generics

#### **1. Classe Genérica `Par<T, U>`**
Crie uma classe genérica que armazena dois valores de tipos diferentes. 

**Requisitos:**
- Crie os atributos `primeiro` e `segundo` de tipos genéricos `T` e `U`.
- Implemente o método construtor para inicializar ambos os valores.
- Crie métodos `getPrimeiro()` e `getSegundo()` para retornar os valores.
- Implemente os métodos `setPrimeiro(T primeiro)` e `setSegundo(U segundo)` para atualizar os valores.
- Adicione um método `imprimir()` para exibir os valores no formato `Primeiro: <valor>, Segundo: <valor>`.

**Exemplo de uso:**
```java
Par<String, Integer> par = new Par<>("Idade", 25);
par.imprimir(); // Saída: Primeiro: Idade, Segundo: 25
par.setSegundo(30);
System.out.println(par.getSegundo()); // Saída: 30
```

---

#### **2. Classe Genérica `Pilha<T>`**
Implemente uma classe genérica que simula o comportamento de uma pilha (*stack*).

**Requisitos:**
- Use uma lista interna (`List<T>`) para armazenar os elementos da pilha.
- Crie o método `push(T elemento)` para adicionar elementos ao topo da pilha.
- Crie o método `pop()` para remover e retornar o elemento do topo da pilha. Caso a pilha esteja vazia, lance uma exceção.
- Crie o método `peek()` para visualizar o elemento do topo sem removê-lo.
- Adicione o método `isEmpty()` para verificar se a pilha está vazia.

**Exemplo de uso:**
```java
Pilha<Integer> pilha = new Pilha<>();
pilha.push(10);
pilha.push(20);
System.out.println(pilha.pop()); // Saída: 20
System.out.println(pilha.peek()); // Saída: 10
```

---

#### **3. Interface Genérica `Servico<T>`**
Crie uma interface genérica que define operações básicas para gerenciar objetos de qualquer tipo.

**Requisitos:**
- Declare os métodos `adicionar(T elemento)` e `listar()`.
- Implemente a interface em uma classe chamada `ServicoUsuario` que gerencia objetos do tipo `Usuario`.
- Crie a classe `Usuario` com atributos `id` e `nome`, além de métodos `getters` e `setters`.
- Na implementação, use uma lista interna para armazenar os objetos `Usuario`.
- Adicione um método na classe `ServicoUsuario` chamado `buscarPorId(int id)` que retorna um usuário específico.

**Exemplo de uso:**
```java
Servico<Usuario> servico = new ServicoUsuario();
servico.adicionar(new Usuario(1, "João"));
servico.adicionar(new Usuario(2, "Maria"));
servico.listar().forEach(usuario -> System.out.println(usuario.getNome())); // Saída: João, Maria
```

---

#### **4. Classe `Calculadora<T extends Number>`**
Crie uma classe genérica para realizar operações matemáticas básicas.

**Requisitos:**
- Aceite apenas tipos que estendam `Number` (`Integer`, `Double`, etc.).
- Crie métodos:
  - `soma(T num1, T num2)` que retorna a soma.
  - `multiplicacao(T num1, T num2)` que retorna a multiplicação.
- Adicione um método `media(T[] numeros)` que retorna a média de um array de números.

**Exemplo de uso:**
```java
Calculadora<Double> calc = new Calculadora<>();
System.out.println(calc.soma(2.5, 3.5)); // Saída: 6.0
System.out.println(calc.multiplicacao(2.0, 3.0)); // Saída: 6.0
Double[] valores = {2.0, 4.0, 6.0};
System.out.println(calc.media(valores)); // Saída: 4.0
```

---

#### **5. Método Genérico para Copiar Listas**
Implemente um método genérico que copie os elementos de uma lista para outra.

**Requisitos:**
- O método deve ser estático e genérico (`<T>`).
- Ele deve aceitar duas listas como parâmetros:
  - A lista de origem (`List<T> origem`).
  - A lista de destino (`List<T> destino`).
- Use um laço para copiar todos os elementos da origem para a lista de destino.

**Exemplo de implementação:**
```java
public static <T> void copiarLista(List<T> origem, List<T> destino) {
    for (T elemento : origem) {
        destino.add(elemento);
    }
}
```

**Exemplo de uso:**
```java
List<String> lista1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
List<String> lista2 = new ArrayList<>();
copiarLista(lista1, lista2);
System.out.println(lista2); // Saída: [A, B, C]
```
