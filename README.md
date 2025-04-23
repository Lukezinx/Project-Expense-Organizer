# 📅 Organizador de Despesas Pessoais (Java)

Este é um projeto de console feito em **Java puro**, com foco em praticar **orientação a objetos**, **coleções**, **manipulação de listas**, ordenação e entrada de dados com `Scanner`. Foi desenvolvido como exercício prático para consolidar os conhecimentos em Java e servir como base para uma evolução futura para back-end com Spring Boot.

---

## 📊 Funcionalidades

- Adicionar despesas com valor, descrição e categoria
- Listar todas as despesas cadastradas
- Ordenar despesas por valor, descrição ou categoria (com uso de `Comparator` e menu interativo)
- Filtrar despesas por categoria (busca por texto com `equalsIgnoreCase`)
- Calcular o total de gastos (somatório com formatação decimal)
- Exibir menu principal interativo no console com Scanner
- Tratar exceções de entrada inválida (valores não numéricos ou vazios)
- Estrutura modular com separação por pacotes (`expenses`, `Manage`, `Menu`, etc)

---

## ⚡ Tecnologias utilizadas

- Java 17+
- IDE: IntelliJ IDEA (recomendado)
- Execução via console (modo texto)

---

## 📚 Conceitos aplicados

- Programacão orientada a objetos (POO)
- Encapsulamento e boas práticas
- Uso de listas (`ArrayList`) e laços de repetição
- Uso de `Comparable` e `Comparator`
- Modularização com separação por pacotes e responsabilidades
- Try/catch com `Scanner` para entradas seguras

---

## 📁 Estrutura do projeto

```
├── expenses
│   └── Expense.java
├── Manage
│   └── ManageExpenses.java
|   └── OrganizedList.java
├── Menu
│   └── Menu.java
└── ProgramMain
    └── Program.java
```

---

## 🗓️ Como usar

1. Clone o repositório:

```bash
git clone https://github.com/Lukezinx/Project-Expense-Organizer
```

2. Abra no IntelliJ IDEA (ou outra IDE Java)
3. Execute a classe `Program.java`
4. Navegue pelo menu usando as opções numéricas no console

---

## 🌟 Possíveis melhorias futuras

- Persistência de dados em arquivo ou banco de dados
- Interface gráfica (JavaFX ou Swing)
- Versão com Spring Boot e API REST
- Login de usuários e autenticação
- Exportação de relatórios em PDF ou CSV

---

## 🚀 Objetivo

Este projeto foi desenvolvido com o objetivo de praticar e consolidar o conhecimento em Java e servir como um marco inicial para evolução em back-end.

---

## 👤 Autor

**Lucas dos Santos Cardoso**\
[LinkedIn](https://www.linkedin.com/in/lucas-luke/) | [GitHub](https://github.com/Lukezinx)

---

Sinta-se à vontade para abrir issues, mandar PRs ou clonar e adaptar o projeto à sua necessidade!

