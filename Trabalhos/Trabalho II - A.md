# TRABALHO II - Modelo A

## **Implementação de um Jogo de Xadrez**

### ENTREGA 06/12/2024

### **Objetivo**
O foco será aplicar conceitos fundamentais da orientação a objetos, garantindo a correta modelagem das peças, tabuleiro e regras básicas do jogo.

Considere que:
- O trabalho pode ser desenvolvido sozinho ou em dupla
- A avaliação será feita através do código e da apresentação do trabalho (acariação)

Atenção! Não é necessário implementar um jogo completo (interface/terminal iterativo), apenas as funcionalidades básicas para movimentação das peças e captura.


### **Requisitos**
1. **(1,0) Tabuleiro**  
   - O tabuleiro deve ser representado por uma matriz (8x8), onde cada célula pode conter uma peça ou estar vazia.
   - Deve ser possível inicializar o tabuleiro com todas as peças em suas posições padrão.

2. **(2,0) Peças**  
   - Cada peça deve ser representada como uma classe. Exemplo: `Rei`, `Rainha`, `Bispo`, `Cavalo`, `Torre` e `Peão`.
   - Todas as peças devem herdar de uma classe base `Peca` que define propriedades e comportamentos comuns, como:
     - **Cor**: Preto ou branco.
     - **Posição atual**.
     - **Movimento válido** (definido individualmente para cada tipo de peça, através de polimorfismo).

3. **(1,0) Jogadores**  
   - Cada jogador controla um conjunto de peças (brancas ou pretas).
   - Deve ser possível alternar entre os jogadores durante o turno.

4. **(3,0) Movimentação**  
   - Implementar regras básicas de movimentação para cada peça (ex.: a Torre se move em linha reta, o Bispo se move na diagonal, etc.).
   - Validar movimentos antes de realizá-los:
     - O movimento não pode sair do tabuleiro.
     - O movimento não pode capturar uma peça da mesma cor.
     - O movimento deve respeitar as regras da peça.

5. **(3,0) Partida**  
   - Implementar uma classe `Partida` para gerenciar o jogo.
   - Incluir funcionalidades como:
     - **(0,5) Início do jogo**: Inicializar o tabuleiro e as peças.
     - **(1,0) Execução de turnos**: Alternar jogadores e permitir movimentações.
     - **(1,0) Verificação de xeque e xeque-mate**. 
     - **(0,5) Encerramento da partida**.

---

### **Detalhes Técnicos**
- **Estrutura mínima sugerida**:
  ```java
  class Tabuleiro {
      private Peca[][] tabuleiro;
      // Métodos para inicializar e gerenciar o tabuleiro
  }

  abstract class Peca {
      protected String cor;
      protected Posicao posicao;

      public abstract boolean movimentoValido(Posicao destino, Tabuleiro tabuleiro);
  }

  class Rei extends Peca {
      @Override
      public boolean movimentoValido(Posicao destino, Tabuleiro tabuleiro) {
          // Implementação específica para o Rei
      }
  }

  class Partida {
      private Jogador jogador1;
      private Jogador jogador2;
      private Tabuleiro tabuleiro;

      public void iniciarJogo() {
          // Inicializar jogadores e tabuleiro
      }
  }
  ```

### **Entrega**
- O trabalho deve ser entregue com:
  1. Código-fonte completo e funcional.
  2. Testes (arquivo MainTestes) cobrindo cenários básicos, como movimentação válida e inválida de peças. 


### **Critérios de Avaliação**
1. Aplicação correta dos conceitos de POO.
2. Organização e clareza do código.
3. Validação das regras do jogo.
5. Documentação/comentários e JAVADOC do projeto.

