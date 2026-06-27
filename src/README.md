# Comportamento por Dia da Semana

Este projeto implementa o padrão de projeto Strategy para definir um comportamento diferente para cada dia da semana. O programa identifica o dia atual ou permite que o usuário informe um dia manualmente, selecionando automaticamente a estratégia correspondente.

Também foi utilizado o padrão Command para encapsular o processo de cadastro das estratégias, mantendo o componente responsável pela seleção desacoplado das implementações concretas.

## Estrutura do projeto

```
src/
├── strategy/
│   ├── DayStrategy.java
│   ├── MondayStrategy.java
│   ├── TuesdayStrategy.java
│   ├── WednesdayStrategy.java
│   ├── ThursdayStrategy.java
│   ├── FridayStrategy.java
│   ├── SaturdayStrategy.java
│   ├── SundayStrategy.java
│   └── UnknownDayStrategy.java
│
├── command/
│   ├── DayCommand.java
│   ├── RegisterStrategyCommand.java
│   └── CommandLoader.java
│
├── selector/
│   └── StrategySelect.java
│   └── StrategySelector.java
│
└── Main.java
```

## Estrutura dos padrões

### Strategy

Foi utilizado para representar o comportamento de cada dia da semana. Cada dia possui uma classe própria responsável por executar sua mensagem e informar a prioridade correspondente (ALTA, MÉDIA ou BAIXA).

Todas as estratégias implementam a interface DayStrategy, permitindo que o programa utilize qualquer uma delas de forma uniforme.

### StrategySelect

A classe StrategySelector mantém um mapa entre o nome do dia e sua estratégia correspondente. Ela disponibiliza apenas os métodos register() e select(), sem conhecer as implementações concretas das estratégias. O cadastro é realizado pelos comandos criados no CommandLoader, mantendo baixo acoplamento entre os componentes.

### Command

O padrão Command foi utilizado para encapsular o cadastro das estratégias.

Cada objeto RegisterStrategyCommand representa um único cadastro (dia + estratégia). A classe CommandLoader cria todos os comandos e executa, registrando as estratégias no StrategySelect.

Dessa forma, o seletor permanece desacoplado das implementações concretas, conhecendo apenas a interface DayStrategy.

### UnknownDayStrategy (Null Object)

Quando o dia informado não possui uma estratégia cadastrada, o StrategySelect retorna UnknownDayStrategy.

Essa classe implementa a mesma interface das demais estratégias, representando um comportamento seguro para entradas inválidas e evitando verificações de valores null.

## Como executar

1. Clone o repositório.

```bash[
git clone https://github.com/KohatsuRK/Comportamento-por-Dia-da-Semana.git
```

2. Abra o projeto em uma IDE Java.

3. Execute a classe Main.

4. Informe:

- nome do usuário
- tarefa ou meta semanal
- dia da semana

# Questões de reflexão

### 1. Como evitar verificações repetidas de valores nulos no código principal?

Foi utilizada uma estratégia padrão (UnknownDayStrategy) para representar a ausência de uma estratégia válida. Assim, o programa sempre recebe um objeto que implementa DayStrategy, eliminando a necessidade de verificações de null.

### 2. Qual padrão de projeto pode ser utilizado para representar a ausência de uma estratégia de forma segura?

O padrão Null Object.

### 3. Explique brevemente como esse padrão foi incorporado à solução.

A classe UnknownDayStrategy implementa a interface DayStrategy e fornece um comportamento padrão para dias inválidos ou sem estratégia cadastrada. Quando isso ocorre, o StrategySelect retorna essa implementação em vez de null, permitindo que o restante da aplicação continue funcionando normalmente sem tratamentos especiais.
