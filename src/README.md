# 🛠️ Operação IT: Sistema de Gerenciamento de Suporte Técnico

Projeto desenvolvido em **Java** aplicando os pilares da **Programação Orientada a Objetos (POO)**. O sistema simula uma plataforma de atendimento e suporte de TI para a empresa fictícia *IT Solutions*, evoluindo através de cinco missões práticas que consolidam conceitos fundamentais da engenharia de software.

---

## 🚀 Evolução do Projeto (Missões)

O sistema foi construído de forma incremental, refletindo a evolução dos requisitos de arquitetura e segurança:

* **Missão 1 – Inicialização do Sistema:** Configuração básica de variáveis, tipos de dados primitivos/referência, estruturação do método `main` e validações condicionais iniciais (`if-else`).
* **Missão 2 – Transformando Dados em Objetos:** Introdução à Orientação a Objetos com a criação da classe `Computador`, definição de atributos de estado e métodos de comportamento (`ligar`, `desligar`, `exibirInformacoes`).
* **Missão 3 – Encapsulamento e Relacionamentos:** Aplicação do modificador `private` para proteger a integridade dos dados, criação de métodos *Getters* e *Setters*, e modelagem de associações entre as classes `Computador`, `Tecnico` e `Chamado`.
* **Missão 4 – Herança, Interfaces e Polimorfismo:** Especialização da classe `Tecnico` em subclasses (`TecnicoHardware` e `TecnicoSoftware`), implementação da interface `Atendimento` e demonstração de polimorfismo em tempo de execução.
* **Missão 5 – Segurança e Robustez:** Implementação de atributos e métodos estáticos (`static`) para controle de contagem de registros, captura de entradas via `Scanner` e tratamento de exceções (`try-catch`) contra entradas inválidas.

---

## 📂 Estrutura de Classes

```text
src/
├── SistemaSuporte.java     # Módulo inicial da Missão 1
├── Computador.java         # Representação e encapsulamento dos equipamentos
├── Tecnico.java            # Classe base para os profissionais de suporte
├── TecnicoHardware.java    # Subclasse especializada em hardware
├── TecnicoSoftware.java    # Subclasse especializada em software
├── Atendimento.java        # Interface de contrato para os atendimentos
├── Chamado.java            # Gerenciamento de chamados e contagem estática
└── Main.java               # Classe de execução principal (Main)