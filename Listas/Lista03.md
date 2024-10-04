## Lista de Exercícios 03

### **Exercício 1: Implementar Coesão e Encapsulamento**
Crie uma classe `ContaBancaria` com os atributos `saldo` (privado) e `titular` (público). Implemente métodos para:
- Depositar um valor.
- Sacar um valor (com validação para garantir que o saldo não fique negativo).
- Mostrar o saldo.

Use encapsulamento para proteger o atributo `saldo` e garantir que ele não possa ser alterado diretamente.

### **Exercício 2: Criar um Exemplo de Associação**
Crie as classes `Biblioteca` e `Livro`. A `Biblioteca` deve ter uma lista de `Livros`. Implemente um método para adicionar livros à biblioteca e um método para listar os livros disponíveis.

### **Exercício 3: Exemplo de Agregação**
Crie as classes `Escola` e `Professor`. A `Escola` pode ter vários `Professores`. Implemente um método para adicionar professores à escola e exibir seus nomes. Os professores podem existir independentemente da escola.

### **Exercício 4: Exemplo de Composição**
Crie as classes `Casa` e `Comodo`. Uma `Casa` é composta por vários `Comodos`, como sala, cozinha, e quarto. Cada cômodo é criado quando a casa é criada, e se a casa for destruída, os