# Entendendo o Padrão Factory Method

O padrão Factory Method é um padrão de design criacional que fornece uma interface para criar objetos em uma superclasse, mas permite que subclasses alterem o tipo de objetos que serão criados. Esse padrão é especialmente útil quando há uma complexidade envolvida na criação de diferentes tipos de objetos, cada um com suas próprias especificações e comportamentos. Ao invés de sobrecarregar o cliente com detalhes de criação dos objetos, o Factory Method encapsula essa complexidade, promovendo um código mais limpo e organizado.

## Como o Padrão Factory Method Funciona

O padrão envolve principalmente três componentes:

- **Creator**: A classe que declara o método fábrica, que retorna um objeto de uma classe `Product`. O Creator pode ser abstrato, contendo apenas a declaração do método fábrica, ou concreto, oferecendo uma implementação padrão do método.
- **ConcreteCreator**: Uma classe que implementa ou sobrescreve o método fábrica para retornar uma instância de um `ConcreteProduct`.
- **Product**: Define a interface de objetos que o método fábrica cria.
- **ConcreteProduct**: São as diferentes implementações da interface `Product`, representando objetos específicos que serão criados pelo Factory Method.

## Aplicação do Padrão Factory Method

O exemplo fornecido ilustra a aplicação do padrão Factory Method na criação de contas bancárias, onde `ContaFactory` atua como o Creator, fornecendo um método estático `getInstance` que cria e retorna instâncias de diferentes tipos de contas (`ContaCorrente` e `ContaPoupanca`), baseadas no tipo de cliente.

### Exemplo de Uso

```java

import examples.davijr.factory.ContaFactory;
import examples.davijr.util.examples.davijr.util.TipoClienteEnum;

public class Main {
    public static void main(String[] args) {
        Conta CC = ContaFactory.getInstance(TipoClienteEnum.CONTA_CORRENTE);
        Conta CP = ContaFactory.getInstance(TipoClienteEnum.CONTA_POUPANCA);

        System.out.println(CC);
        System.out.println(CP);
    }
}`
```

Neste exemplo específico de criação de contas bancárias, podemos identificar os componentes do padrão Factory Method da seguinte maneira:

- **Creator (Criador)**: Neste caso, é representado pela classe `ContaFactory`. Embora, no exemplo, `ContaFactory` não seja uma superclasse no sentido tradicional (já que o método é estático e não há herança envolvida), ela cumpre o papel de criador ao definir o método `getInstance`, que é responsável por criar e retornar instâncias de `Conta`.
    
- **ConcreteCreator (Criador Concreto)**: A própria `ContaFactory` atua como ConcreteCreator, pois implementa o método `getInstance` que decide qual tipo de examples.davijr.conta criar baseado no argumento `TipoClienteEnum`. Embora tipicamente, em muitas implementações do Factory Method, existam múltiplas classes criadoras concretas, neste exemplo simplificado, a `ContaFactory` sozinha toma as decisões de criação.
    
- **Product (Produto)**: O papel do produto é desempenhado pela classe abstrata `Conta`, que define a interface comum para os objetos que serão criados. No contexto do nosso exemplo, `Conta` estabelece a estrutura e os métodos que todas as contas bancárias devem implementar, como `tipo`, que é mencionado na criação das contas.
    
- **ConcreteProduct (Produto Concreto)**: São representados pelas classes `ContaCorrente` e `ContaPoupanca`. Estas classes extendem `Conta` e implementam os detalhes específicos que diferenciam uma examples.davijr.conta corrente de uma examples.davijr.conta poupança.
## Executando o Projeto

Para experimentar o padrão Factory Method em ação, compile e execute a classe `Main`. Isso irá criar diferentes tipos de contas bancárias usando a `ContaFactory`, demonstrando como o padrão pode ser utilizado para criar objetos de maneira flexível e desacoplada.
