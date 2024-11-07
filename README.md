# Verificador de Números Primos (Prime Number Checker)

Este projeto é uma aplicação simples em Java que verifica se um número é primo. Ele utiliza um conceito matemático de otimização para reduzir a quantidade de operações, garantindo um desempenho mais eficiente.

## Sobre o Projeto (About the Project)

O programa permite que o usuário insira um número, e então determina se ele é primo ou não. Números primos são aqueles que só podem ser divididos por 1 e por eles mesmos, sem deixar resto. Na primeira versão, o programa verificava todos os números de 1 até n para determinar a primalidade de n. Contudo, ao usar a raiz quadrada de n como limite, o número de verificações é significativamente reduzido, o que melhora a eficiência.

## Como Funciona (How It Works)

O método principal utiliza uma lógica que testa divisores de 2 até a raiz quadrada do número informado. Se algum divisor for encontrado, o número não é primo. Caso contrário, ele é primo.

## Exemplo de Uso (Usage Example)

Ao executar o programa, o usuário insere um número, e o programa exibe a mensagem indicando se o número é primo ou não.

```plaintext
==== Bem-vindo(a) ao Verificador de Números Primos ====
Digite um número para verificar: 17
O número 17 é primo.
```

## Tecnologias Utilizadas (Technologies Used)

- **Java**: Linguagem de programação para a lógica do projeto.
- **Matemática Aplicada**: Conceito de divisibilidade e raiz quadrada para otimização.

## Objetivo (Purpose)

O projeto visa demonstrar a importância de aplicar conceitos matemáticos na programação para alcançar maior eficiência e otimização em algoritmos.
