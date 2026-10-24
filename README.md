# Calculadora em Java

Calculadora de terminal desenvolvida em Java como projeto de aprendizado, organizada em incrementos inspirados na metodologia Scrum.

## Funcionalidades

- Adição, subtração, multiplicação e divisão.
- Validação da opção do menu e dos números informados.
- Tratamento de divisão por zero, solicitando outro divisor.
- Repetição de cálculos até a pessoa escolher sair.
- Validação da resposta de continuidade (`s` ou `n`).

## Requisitos

- JDK 14 ou superior.
- Terminal ou uma IDE Java, como IntelliJ IDEA.

Confira se o Java está instalado:

```powershell
java -version
javac -version
```

## Como executar

Na pasta raiz do projeto, compile o arquivo:

```powershell
javac -d out src/Main.java
```

Em seguida, execute a calculadora:

```powershell
java -cp out Main
```

No IntelliJ IDEA, também é possível abrir `src/Main.java` e executar o método `main`.

## Como usar

1. Escolha uma operação no menu, de `1` a `4`.
2. Informe os dois números solicitados.
3. Para divisão, se o divisor for zero, informe outro valor quando solicitado.
4. Responda `s` para fazer outro cálculo ou `n` para encerrar.

Entradas inválidas no menu, nos números ou na pergunta de continuidade geram uma mensagem e são solicitadas novamente.

## Estrutura do projeto

```text
calculadora-java/
├── src/
│   └── Main.java
└── README.md
```

## Evolução

O projeto é desenvolvido em etapas. A Sprint 5 está organizando as operações em métodos reutilizáveis; neste momento, a adição já foi extraída para um método próprio.
