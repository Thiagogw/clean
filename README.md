**Arquitetura Limpa**

----------------------------------------

**Estrutura**
- _Core_
- _Adapter_
- _Infrastructure_

**Core** - Camada responsável por manter as regras de negócio, que irá ser acessada atráves interfaces. A implementação da interface do UseCase fica no core enquanto as demais são da camada de adapter.

**Adapter** - Camada responsável por manter as implementações das interfaces de saida e também os meios que vão chamar a aplicação (controller, mensageria, etc);

**Infrastrucutre** - Camada responsável por manter as configurações da aplicação, como BeanConfiguration por exemplo.

----------------------------------------

**Analise da Arquitetura**

----------------------------------------

**Vantagens**:

_Manutenibilidade_:

A separação clara de responsabilidades e a direção controlada de dependências facilitam a manutenção do código ao longo do tempo.

_Testabilidade_:

A estrutura em camadas da Clean Architecture facilita a realização de testes unitários, já que as camadas internas são independentes das externas.

_Flexibilidade_:

A Clean Architecture permite mudanças nos detalhes de implementação (como frameworks ou bibliotecas) sem afetar a lógica de negócios central.

_Independência de Frameworks_:

A arquitetura é projetada para ser independente de frameworks, o que facilita a migração para novas tecnologias sem afetar drasticamente o código.

_Reusabilidade_:

As entidades e casos de uso podem ser reutilizados em diferentes contextos, pois são independentes de detalhes de implementação.

**Desvantagens**:

_Complexidade Inicial_:

A implementação inicial da Clean Architecture pode parecer mais complexa do que estruturas mais simples, especialmente para projetos pequenos ou simples.

_Curva de Aprendizado_:

A equipe pode precisar de tempo para se acostumar com a abordagem e entender a lógica de separação de responsabilidades proposta pela Clean Architecture.