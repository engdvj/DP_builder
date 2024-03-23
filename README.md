# Funcionamento

Esse sistema permite criar contas correntes com informações como saldo, número da conta, agência e nome do cliente. Isso é feito de maneira fluída e intuitiva graças ao padrão Builder, que nos ajuda a evitar a necessidade de um construtor com muitos parâmetros, tornando o código mais limpo e fácil de entender.

## Implementação do Padrão Builder
O padrão Builder é implementado através de métodos na classe Conta que retornam a própria instância da classe (this), permitindo a encadeação de chamadas de métodos. A classe ContaCorrente estende Conta e utiliza um método estático build para iniciar a construção.

## Exemplo de Uso

```java
Conta contaCorrente = ContaCorrente.build()
                        .saldo(500)
                        .numeroConta(123456)
                        .agencia(1)
                        .cliente("Davi");
```

Este código cria uma nova conta corrente com um saldo inicial de 500, número da conta 123456, agência 1 e cliente chamado Davi.

## Como Executar

Para executar o projeto, compile e rode a classe Main, que demonstra a criação de uma conta corrente usando o padrão Builder.
