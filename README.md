# Entendendo o Padrão Singleton

O padrão Singleton é um dos padrões de design criacional que visa garantir que uma classe tenha apenas uma instância em todo o programa, proporcionando um ponto global de acesso a essa instância. Este padrão é particularmente útil quando você precisa de um controle rigoroso sobre como e quando o acesso é concedido a um recurso compartilhado ou uma entidade única, como uma conexão de banco de dados, uma agenda de contatos, ou configurações globais.

## Como o Padrão Singleton Funciona

A ideia central do padrão Singleton é impedir a criação de múltiplas instâncias de uma classe, assegurando um único ponto de acesso global a essa instância. Para isso, o padrão Singleton tipicamente envolve:

- **Privatização do construtor**: Impede a criação de instâncias fora da classe.
- **Criação de um método estático**: Que permite aos clientes acessarem a única instância da classe.
- **Armazenamento da instância única**: Geralmente, dentro de um atributo estático privado da classe.

Existem várias maneiras de implementar o padrão Singleton em Java, incluindo o uso de campos estáticos, classes internas estáticas, e o modelo baseado em enumeração, que é considerado o método mais simples e seguro para implementar Singletons a partir do Java 5.

## Aplicação do Padrão Singleton

No exemplo fornecido, `AgendaSingletonEnum` ilustra uma implementação eficaz e thread-safe do padrão Singleton usando enumeração. Este método combina a simplicidade da criação de instâncias com garantias de segurança em ambientes multithread.

### Exemplo de Uso

```java
package examples.davijr.classes;

public class Main {
    public static void main(String[] args) {
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();

        Cliente cliente = new Cliente("Davi", "12345678900", "davi@example.com");
        agenda.addCliente(cliente);

        System.out.println(agenda.getAgenda());
    }
}
```

Neste fragmento de código, `AgendaSingletonEnum` é usado para gerenciar uma lista de clientes (`agenda`). Ao chamar `AgendaSingletonEnum.getInstance()`, temos acesso à única instância de `AgendaSingletonEnum`. O método `addCliente` permite adicionar novos clientes à agenda, demonstrando como o padrão Singleton pode ser utilizado para criar e gerenciar um recurso compartilhado de forma controlada e segura.

## Executando o Projeto

Para experimentar o padrão Singleton em ação, compile e execute a classe `Main`. Você verá que, independentemente de quantas vezes você recupera a instância de `AgendaSingletonEnum` ou onde no seu código ela é acessada, sempre será a mesma instância única que é usada, garantindo um ponto centralizado e consistente de acesso à agenda de clientes.
