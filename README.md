# Entendendo o Padrão Builder

O padrão Builder é uma solução de design de software que é usada para construir objetos complexos passo a passo. Ao contrário de outros padrões criacionais, que muitas vezes requerem que um objeto seja construído em uma única chamada a um construtor com vários parâmetros, o Builder permite que os objetos sejam construídos por meio de várias chamadas a métodos específicos antes da finalização do objeto. Isso não apenas melhora a legibilidade do código, mas também facilita a manutenção, uma vez que cada aspecto da construção do objeto é tratado de forma modular.

## Como o Padrão Builder Funciona

No coração do padrão Builder está a ideia de separar a construção de um objeto complexo da sua representação. Isso permite que o mesmo processo de construção possa criar diferentes representações. Para alcançar isso, o padrão geralmente envolve:

- Um **Builder** que declara métodos para definir as partes do objeto complexo. Esses métodos retornam o próprio Builder, permitindo chamadas encadeadas (chaining).
- Uma **Diretor** (opcional) que encarrega-se de orquestrar a construção com um ou vários builders.
- Um **Produto**, que é o objeto complexo que está sendo construído.

## Aplicação do Padrão Builder

Considerando o código fornecido como exemplo, podemos ver o padrão Builder em ação na criação de uma instância de `ContaCorrente`. Este exemplo simplifica a criação de uma examples.davijr.conta corrente, evitando a necessidade de um construtor complexo e permitindo uma inicialização fluída e intuitiva dos objetos.

### Exemplo de Uso


```java
Conta contaCorrente = ContaCorrente.build()
                        .saldo(500)
                        .numeroConta(123456)
                        .agencia(1)
                        .cliente("Davi");`
```

Neste fragmento de código, a classe `ContaCorrente` estende `Conta` e utiliza um método estático `build` para iniciar a construção. Cada chamada subsequente a métodos como `saldo`, `numeroConta`, `agencia`, e `cliente` ajusta um aspecto específico da `ContaCorrente`, antes de finalizar a construção. O resultado é uma nova examples.davijr.conta corrente com um saldo inicial de 500, número da examples.davijr.conta 123456, agência 1, e cliente chamado Davi, demonstrando uma aplicação prática do padrão Builder para simplificar a criação de objetos complexos.

## Executando o Projeto

Para ver o padrão Builder em ação, compile e execute a classe `Main`, que demonstra a criação de uma `ContaCorrente` usando o padrão Builder, conforme ilustrado acima.
