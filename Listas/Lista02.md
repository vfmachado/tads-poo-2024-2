
## Lista de Exercícios 02


### Exercício 1: Criando uma Classe `Produto` com Getters e Setters

**Descrição:**
Crie uma classe chamada `Produto` com os seguintes atributos:
- `nome` (String)
- `preco` (double)
- `estoque` (int)

Use o modificador **`private`** para os atributos e implemente os métodos **getters** e **setters** para todos os atributos. Além disso, no setter de `preco`, adicione uma validação para garantir que o preço não seja negativo.

**Tarefa:**
- Instancie um objeto da classe `Produto`, defina os valores dos atributos usando os setters, e exiba os valores com os getters.
- Teste a validação do preço tentando definir um valor negativo.

---

### Exercício 2: Classe `Carro` com Modificadores de Acesso

**Descrição:**
Crie uma classe `Carro` com os seguintes atributos:
- `marca` (String) - público
- `modelo` (String) - protegido
- `ano` (int) - privado

Implemente getters e setters para o atributo `ano`. O setter de `ano` deve garantir que o valor seja maior que 1885 (primeiro carro foi criado em 1886).

**Tarefa:**
- Crie dois objetos da classe `Carro`.
- Defina os valores dos atributos e exiba-os usando métodos e acesso direto onde permitido.
- Teste a validação do ano.

---

### Exercício 3: Abstração e Encapsulamento com uma Classe `ContaBancaria`

**Descrição:**
Crie uma classe chamada `ContaBancaria` com os seguintes atributos privados:
- `titular` (String)
- `saldo` (double)

Implemente os seguintes métodos:
- **Construtor** para inicializar o titular com saldo inicial.
- **Método `depositar(double valor)`**: adiciona o valor ao saldo.
- **Método `sacar(double valor)`**: subtrai o valor do saldo, se houver saldo suficiente.
- **Getters e setters** para o atributo `titular`. O saldo só pode ser acessado através do método `consultarSaldo()`.

**Tarefa:**
- Crie uma conta bancária para um titular, faça depósitos e saques.
- Use os getters e setters para modificar e acessar os valores.
- Garanta que o saldo não possa ser diretamente acessado ou modificado fora da classe.

---

### Exercício 4: Implementando uma Classe `Funcionario`

**Descrição:**
Crie uma classe `Funcionario` com os seguintes atributos privados:
- `nome` (String)
- `salario` (double)

Implemente os seguintes métodos:
- **Construtor** para inicializar `nome` e `salario`.
- **Getter e Setter para o `salario`**: O setter deve garantir que o salário seja maior que o salário mínimo (use um valor fictício).
- **Método `exibirInformacoes()`**: Exibe o nome e o salário do funcionário.

**Tarefa:**
- Instancie objetos da classe `Funcionario`, modifique o salário, e exiba as informações usando o método `exibirInformacoes()`.
- Teste a validação do setter de `salario`.

---

### Exercício 5: Modificadores de Acesso em uma Classe `Aluno`

**Descrição:**
Crie uma classe `Aluno` com os seguintes atributos:
- `nome` (public)
- `matricula` (protected)
- `notaFinal` (private)

Implemente os seguintes métodos:
- **Getters e Setters** para o atributo `notaFinal` (o valor da nota deve ser entre 0 e 10).
- **Método `exibirDados()`**: Mostra o nome, matrícula e nota final.

**Tarefa:**
- Crie objetos da classe `Aluno` e teste o acesso a `nome`, `matricula`, e `notaFinal` conforme os modificadores de acesso permitirem.
- Tente acessar diretamente o atributo `notaFinal` e veja o que acontece.

---

### Exercício 6: Classe `Biblioteca` com Listas de Objetos

**Descrição:**
Crie uma classe `Livro` com os seguintes atributos:
- `titulo` (String)
- `autor` (String)
- `disponivel` (boolean)

Crie uma classe `Biblioteca` que tenha uma lista de livros como atributo. Implemente os seguintes métodos na classe `Biblioteca`:
- **AdicionarLivro(Livro livro)**: Adiciona um livro à lista.
- **EmprestarLivro(String titulo)**: Marca o livro como indisponível.
- **DevolverLivro(String titulo)**: Marca o livro como disponível.
- **ListarLivros()**: Exibe a lista de livros com seu status (disponível ou não).

**Tarefa:**
- Adicione livros à biblioteca, empreste e devolva alguns, e exiba o estado dos livros usando o método `ListarLivros()`.

---

### Exercício 7: Getters e Setters com Validação na Classe `Pedido`

**Descrição:**
Crie uma classe `Pedido` com os seguintes atributos privados:
- `numeroPedido` (String)
- `quantidade` (int)
- `valorTotal` (double)

Implemente:
- **Getters e Setters** para todos os atributos. No setter de `quantidade`, certifique-se de que seja maior que 0. O setter de `valorTotal` deve ser calculado com base na quantidade e no valor unitário de um produto fictício.

**Tarefa:**
- Crie um objeto `Pedido`, defina os valores com os setters, e exiba os detalhes usando os getters.

---

### Exercício 8: Criando um Sistema de Funcionários

**Descrição:**
Crie uma classe `Funcionario` com os seguintes atributos:
- `nome` (String)
- `departamento` (String)
- `salario` (double)

Implemente métodos:
- `aumentarSalario(double porcentagem)`: Aumenta o salário em uma determinada porcentagem.
- `transferir(String novoDepartamento)`: Altera o departamento do funcionário.

**Tarefa:**
- Crie uma lista de objetos `Funcionario` e implemente um menu para o usuário:
  1. Adicionar funcionário.
  2. Aumentar salário.
  3. Transferir funcionário.
  4. Listar funcionários.

