
## Lista de Exercícios 04

Atenção: A maioria dos exercícios pede para que o código SIMULE uma operação, como por exemplo, exportar um PDF, salvar um log ou enviar um alerta. Não é necessário implementar a funcionalidade real de exportar um PDF, por exemplo, apenas simular a operação. NO ENTANTO, se você quiser implementar a funcionalidade real, fique à vontade! Possivelmente será necessário pesquisar sobre como fazer isso em Java, adicionar bibliotecas, etc.

### Exercício 1: Implementação de Funcionalidades de Movimentação e Ataque em um Jogo

**Descrição**:
Crie as seguintes interfaces:
- **Movimentavel**: Com o método `mover(String direcao)` para mover personagens em diferentes direções.
- **Atacavel**: Com o método `atacar(String alvo)` para atacar um alvo.

Implemente uma classe **Personagem** que deve implementar as duas interfaces, permitindo que o personagem se mova e ataque em um jogo.

**Tarefas**:
- Crie uma instância da classe `Personagem` que possa se mover para diferentes direções e atacar inimigos.
- Exiba no console as ações do personagem (movimento e ataque).

---

### Exercício 2: Sistema de Alerta e Registro de Eventos

**Descrição**:
Crie as seguintes interfaces:
- **Alertavel**: Com o método `enviarAlerta(String mensagem)` para enviar alertas.
- **Registravel**: Com o método `registrarEvento(String evento)` para registrar eventos em logs.

Implemente uma classe **MonitoramentoSistema** que deve enviar alertas para administradores e registrar eventos importantes. A classe deve implementar as duas interfaces.

**Tarefas**:
- Simule um sistema que envia um alerta e registra um evento.
- Exiba no console as mensagens de alerta e os eventos registrados.

---

### Exercício 3: Implementação de Sistema de Controle de Qualidade

**Descrição**:
Crie as seguintes interfaces:
- **Testavel**: Com o método `executarTeste()` para executar um teste de qualidade.
- **Relatavel**: Com o método `gerarRelatorio()` para gerar um relatório após o teste.

Implemente uma classe **ControleQualidade** que deve implementar as duas interfaces. Ela deve ser capaz de realizar testes em um produto e gerar relatórios com os resultados.

**Tarefas**:
- Execute um teste de qualidade em um produto.
- Gere um relatório com os resultados do teste.

---

### Exercício 4: Sistema de Impressão e Digitalização

**Descrição**:
Crie as seguintes interfaces:
- **Imprimivel**: Com o método `imprimir(String documento)` para imprimir documentos.
- **Digitalizavel**: Com o método `digitalizar(String documento)` para digitalizar documentos.

Implemente uma classe **Multifuncional** que deve implementar ambas as interfaces, permitindo que a impressora multifuncional possa tanto imprimir quanto digitalizar documentos.

**Tarefas**:
- Implemente a funcionalidade de impressão e digitalização em uma impressora multifuncional.
- Crie um documento que seja impresso e outro que seja digitalizado.

---

### Exercício 5: Controle de Dispositivos Eletrônicos Inteligentes

**Descrição**:
Crie as seguintes interfaces:
- **Ligavel**: Com o método `ligar()` para ligar dispositivos eletrônicos.
- **ControlavelRemotamente**: Com o método `controlarRemotamente(String comando)` para controlar dispositivos à distância.

Implemente uma classe **SmartDevice** que deve ser capaz de ligar e ser controlada remotamente, implementando ambas as interfaces.

**Tarefas**:
- Crie uma instância da classe `SmartDevice` que possa ser ligada e controlada remotamente.
- Simule comandos remotos como "Aumentar volume", "Desligar", etc., e exiba os resultados no console.

---
