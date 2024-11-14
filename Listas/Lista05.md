## Lista de Exercícios 05 - Interface, Herança & Herança Múltipla

#### Exercício 1: Sistema de Controle de Veículos
- Crie uma interface `Veiculo` com métodos `acelerar()` e `frear()`.
- Crie uma classe base `Carro` com atributos como `marca`, `modelo`, e `ano`.
- Implemente uma classe `CarroEletrico` que herda de `Carro` e implementa a interface `Veiculo`, adicionando um método específico `carregarBateria()`.
- Crie uma classe `Moto` que também implemente `Veiculo`.

---

#### Exercício 2: Gerenciamento de Animais em um Zoológico
- Crie uma interface `Animal` com métodos `fazerSom()` e `mover()`.
- Crie uma classe abstrata `Mamifero` que implemente `Animal` e adicione um método `amamentar()`.
- Implemente classes `Leao` e `Elefante` que herdem de `Mamifero` e implementem os métodos abstratos.
- Crie uma classe `Passaro` que implemente `Animal` e adicione o método específico `voar()`.

---

#### Exercício 3: Sistema de Notificações
- Crie uma interface `Notificacao` com um método `enviarMensagem(String mensagem)`.
- Implemente classes `Email` e `SMS` que implementam `Notificacao`.
- Crie uma classe `Usuario` com o atributo `nome` e um método `notificar()` que aceita um objeto `Notificacao` como argumento, permitindo que um `Usuario` possa ser notificado tanto por `Email` quanto por `SMS`.

---

#### Exercício 4: Sistema de Figuras Geométricas
- Crie uma interface `Forma` com o método `calcularArea()`.
- Crie uma classe `Circulo` que implemente `Forma` e tenha um atributo `raio`.
- Crie uma classe `Retangulo` que implemente `Forma` e tenha os atributos `largura` e `altura`.
- Implemente uma classe `Quadrado` que herde de `Retangulo` e reutilize o cálculo de área de `Retangulo`.

---

#### Exercício 5: Sistema de Documentos
- Crie uma interface `Imprimivel` com o método `imprimir()`.
- Implemente uma classe `Relatorio` que implemente `Imprimivel` e adicione o método `gerarRelatorio()`.
- Crie uma classe `Contrato` que implemente `Imprimivel` e tenha um método `assinarContrato()`.
- Crie uma classe `Impressora` que aceite objetos `Imprimivel` e chame o método `imprimir()` para diferentes tipos de documentos.

---

#### Exercício 6: Sistema de Aquecimento e Resfriamento de Ambientes
- Crie uma interface `Aquecivel` com o método `aquecer()`.
- Crie uma interface `Resfriavel` com o método `resfriar()`.
- Crie uma classe `ArCondicionado` que implemente ambas as interfaces (`Aquecivel` e `Resfriavel`), simulando um sistema de ar condicionado que pode aquecer ou resfriar o ambiente.

---

#### Exercício 7: Sistema de Pagamentos
- Crie uma interface `Pagamento` com o método `processarPagamento(double valor)`.
- Implemente as classes `CartaoCredito` e `CartaoDebito` que implementam `Pagamento`.
- Crie uma interface `Reembolsavel` com o método `processarReembolso(double valor)`.
- Implemente a classe `CartaoCredito` para que implemente também a interface `Reembolsavel`, permitindo que apenas o cartão de crédito seja reembolsado.

---

#### Exercício 8: Sistema de Controle de Dispositivos Eletrônicos
- Crie uma interface `Ligavel` com o método `ligar()`.
- Crie uma interface `Desligavel` com o método `desligar()`.
- Implemente a classe `Televisao` que implemente ambas as interfaces, simulando um dispositivo que pode ser ligado e desligado.

---

#### Exercício 9: Sistema de Conta Bancária
- Crie uma classe `Conta` com atributos como `saldo` e um método abstrato `depositar(double valor)`.
- Implemente uma classe `ContaPoupanca` que herde de `Conta` e implemente o método `depositar`.
- Implemente uma classe `ContaCorrente` que herde de `Conta` e adicione um método `sacar(double valor)`.
- Crie uma interface `Transferivel` com o método `transferir(double valor, Conta destino)`.
- Implemente a classe `ContaCorrente` para que implemente também a interface `Transferivel`.

---

#### Exercício 10: Sistema de Controle de Biblioteca
- Crie uma interface `Emprestavel` com o método `emprestar()`.
- Crie uma classe `Livro` que implemente `Emprestavel` e adicione um método específico `ler()`.
- Crie uma classe `Revista` que implemente `Emprestavel` e adicione um método `consultarArtigos()`.
- Implemente uma classe `Biblioteca` que possa emprestar tanto livros quanto revistas.

---

#### Exercício 11: Sistema de Controle de Pedidos
- Crie uma interface `Calculavel` com o método `calcularTotal()`.
- Implemente uma classe `PedidoOnline` que implemente `Calculavel` e calcule o total com uma taxa de entrega.
- Implemente uma classe `PedidoPresencial` que implemente `Calculavel` e calcule o total sem taxa de entrega.

---

#### Exercício 12: Sistema de Gerenciamento de Mídias
- Crie uma interface `Reproduzivel` com o método `reproduzir()`.
- Implemente classes `Video` e `Musica` que implementem a interface `Reproduzivel`.
- Crie uma classe `Playlist` que aceite objetos `Reproduzivel` e reproduza vídeos e músicas.

---

#### Exercício 13: Sistema de Veículos de Transporte Público
- Crie uma interface `Transporte` com o método `transportar()`.
- Implemente uma classe `Onibus` que implemente `Transporte` e adicione o método `pararPonto()`.
- Implemente uma classe `Trem` que implemente `Transporte` e adicione o método `pararEstacao()`.

---

#### Exercício 14: Controle de Produtos de Mercado
- Crie uma interface `VendidoPorPeso` com o método `calcularPreco(double peso)`.
- Implemente as classes `Fruta` e `Carne` que implementem `VendidoPorPeso` e calcule o preço com base no peso.

---

#### Exercício 15: Sistema de Autenticação de Usuários
- Crie uma interface `Autenticavel` com o método `autenticar(String usuario, String senha)`.
- Implemente a classe `AutenticacaoSenha` e `AutenticacaoToken` que implementem `Autenticavel`.
- Crie uma classe `SistemaLogin` que aceite qualquer implementação de `Autenticavel`.

---

#### Exercício 16: Sistema de Exportação de Relatórios
- Crie uma interface `Exportavel` com o método `exportar(String conteudo)`.
- Implemente as classes `ExportacaoPDF` e `ExportacaoCSV` que implementem `Exportavel`.
- Crie uma classe `GeradorRelatorio` que aceite objetos `Exportavel` e exporte relatórios.

---

#### Exercício 17: Sistema de Registro de Logs
- Crie uma interface `Logger` com o método `registrar(String mensagem)`.
- Implemente `LoggerConsole` e `LoggerArquivo` que registram logs no console e em arquivo, respectivamente.
- Crie uma classe `Aplicacao` que aceite objetos `Logger` para registrar eventos de aplicação.

---

#### Exercício 18: Sistema de Gerenciamento de Formulários
- Crie uma interface `Validavel` com o método `validar()`.
- Implemente as classes `FormularioPessoa` e `FormularioEmpresa` que implementem `Validavel` e façam validações específicas para cada tipo de formulário.

---

#### Exercício 19: Sistema de Notificação de Alerta
- Crie uma interface `Enviavel` com o método `enviar(String mensagem)`.
- Implemente as classes `AlertaEmail` e `AlertaSMS` que implementem `Enviavel`.
- Crie uma classe `CentralAlerta` que aceite objetos `Enviavel` para enviar alertas.

---

#### Exercício 20: Sistema de Dispositivos de Segurança
- Crie uma interface `Sensor` com os métodos `ativar()` e `desativar()`.
- Implemente as classes `SensorFumaca` e `SensorMovimento` que implementem `Sensor`.
- Crie uma classe `PainelSeguranca` que controle múltiplos sensores.

---
