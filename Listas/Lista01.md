
## Lista de Exercícios 01

#### **Exercício 1: Criando uma Classe Simples**
Crie uma classe chamada `Pessoa` que tenha os seguintes atributos:
- Nome (String)
- Idade (int)
- Altura (double)

Implemente um método para exibir as informações da pessoa e um método para alterar o valor da idade.

**Exemplo de uso:**
```java
Pessoa pessoa1 = new Pessoa("João", 25, 1.75);
pessoa1.exibirInformacoes();
pessoa1.alterarIdade(26);
```

---

#### **Exercício 2: Métodos com Retorno**
Crie uma classe chamada `Círculo` com:
- Um atributo `raio` (double).
- Um método `calcularArea()` que retorna a área do círculo.
- Um método `calcularPerimetro()` que retorna o perímetro do círculo.

**Dica:** A fórmula da área do círculo é `π * raio^2` e o perímetro é `2 * π * raio`.

**Exemplo de uso:**
```java
Circulo circulo1 = new Circulo(5);
double area = circulo1.calcularArea();
double perimetro = circulo1.calcularPerimetro();
```

---

#### **Exercício 3: Criando Objetos**
Crie uma classe `Carro` com os atributos:
- Modelo (String)
- Cor (String)
- Ano (int)

Crie dois objetos da classe `Carro` com valores diferentes e exiba as informações de cada carro utilizando um método `exibirDetalhes()`.

**Exemplo de uso:**
```java
Carro carro1 = new Carro("Civic", "Prata", 2021);
Carro carro2 = new Carro("Corolla", "Preto", 2020);
carro1.exibirDetalhes();
carro2.exibirDetalhes();
```

---

#### **Exercício 4: Métodos que Alteram Atributos**
Implemente uma classe `ContaBancaria` com os seguintes atributos:
- Número da conta (String)
- Saldo (double)

Implemente os seguintes métodos:
- `depositar(double valor)` para adicionar dinheiro ao saldo.
- `sacar(double valor)` para subtrair dinheiro do saldo, se houver saldo suficiente.
- `exibirSaldo()` para mostrar o saldo atual.

**Exemplo de uso:**
```java
ContaBancaria conta1 = new ContaBancaria("12345-6", 500.00);
conta1.depositar(150.00);
conta1.sacar(100.00);
conta1.exibirSaldo();
```

---

#### **Exercício 5: Comparando Objetos**
Crie uma classe `Retangulo` com os seguintes atributos:
- Largura (double)
- Altura (double)

Implemente um método `calcularArea()` que retorne a área do retângulo. Crie dois objetos dessa classe e, em seguida, crie um método `compararArea(Retangulo outro)` que compare a área de dois retângulos e indique qual é maior ou se são iguais.

**Exemplo de uso:**
```java
Retangulo ret1 = new Retangulo(4, 5);
Retangulo ret2 = new Retangulo(3, 7);
ret1.compararArea(ret2);
```

---

#### **Exercício 6: Instâncias Múltiplas**
Crie uma classe chamada `Aluno` com os seguintes atributos:
- Nome (String)
- Nota 1 (double)
- Nota 2 (double)

Implemente um método `calcularMedia()` que calcule e retorne a média do aluno. Depois, crie três instâncias dessa classe e exiba a média de cada aluno.

**Exemplo de uso:**
```java
Aluno aluno1 = new Aluno("Ana", 7.5, 8.0);
Aluno aluno2 = new Aluno("Pedro", 6.0, 5.5);
Aluno aluno3 = new Aluno("Maria", 9.0, 8.5);
aluno1.calcularMedia();
aluno2.calcularMedia();
aluno3.calcularMedia();
```

---

#### **Exercício 7: Métodos e Atributos Privados**
Crie uma classe `Produto` com os seguintes atributos privados:
- Nome (String)
- Preço (double)

Implemente métodos para:
- Definir o preço (com uma verificação para não permitir valores negativos).
- Exibir as informações do produto.

**Exemplo de uso:**
```java
Produto produto1 = new Produto("Laptop", 3000.00);
produto1.setPreco(3200.00);
produto1.exibirInfo();
```

---

#### **Exercício 8: Calculadora Simples**
Crie uma classe `Calculadora` com métodos para:
- Somar dois números.
- Subtrair dois números.
- Multiplicar dois números.
- Dividir dois números (com uma verificação para evitar divisão por zero).

Crie um programa que use essa calculadora para realizar algumas operações simples.

**Exemplo de uso:**
```java
Calculadora calc = new Calculadora();
double soma = calc.somar(10, 5);
double divisao = calc.dividir(10, 2);
```

---

#### **Exercício 9: Construtores**
Crie uma classe `Funcionario` com:
- Nome (String)
- Salário (double)

Implemente um construtor que inicialize esses atributos e um método `aumentarSalario(double percentual)` para aumentar o salário com base em um percentual.

**Exemplo de uso:**
```java
Funcionario func1 = new Funcionario("Carlos", 2500.00);
func1.aumentarSalario(10); // Aumenta 10% no salário
```

---

#### **Exercício 10: Criando um Banco de Dados Simples**
Crie uma classe `BancoDeDadosSimples` que armazene uma lista de objetos `Pessoa`. Implemente métodos para:
- Adicionar uma nova pessoa à lista.
- Remover uma pessoa pela nome.
- Exibir todas as pessoas cadastradas.

**Exemplo de uso:**
```java
BancoDeDadosSimples bd = new BancoDeDadosSimples();
bd.adicionarPessoa(new Pessoa("João", 30, 1.80));
bd.adicionarPessoa(new Pessoa("Maria", 25, 1.65));
bd.exibirPessoas();
```

