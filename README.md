**Arquitetura Limpa**

----------------------------------------

**Estrutura**
- _Entities_
- _Use Cases_
- _Adapters_
- _Externals_

**Entities** - Camada responsável por centralizar as regras de negócio, respeitando o contexto do domínio.

**Use Cases** - Camada responsável pelos casos de uso que chamam a camada das entidades, sendo responsável pelo fluxo.

**Adapters** - Camada responsável por adaptar as entradas e saídas da camada externa com as internas (use cases e entities).

**Externals** - Camada responsável pelos componentes externos de entrada (ex: controller, consumer, etc) e saída (ex: banco de dados, etc) da aplicação 

----------------------------------------

**Analise da Arquitetura**

----------------------------------------

**Vantagens**:

_Manutenibilidade_:

A separação clara de responsabilidades de cada camada facilita a manutenção do código.

_Testabilidade_:

A estrutura em camadas facilita a realização de testes unitários, já que as camadas internas são independentes das externas.

_Flexibilidade_:

A Clean Architecture permite mudanças nos detalhes de implementação (como frameworks ou bibliotecas) sem afetar a lógica de negócios central.

_Independência de Frameworks_:

A arquitetura é projetada para ser independente de frameworks, o que facilita a migração para novas tecnologias sem afetar drasticamente o código.

_Reusabilidade_:

As entidades e casos de uso podem ser reutilizados em diferentes contextos, pois são independentes de detalhes de implementação.

**Desvantagens**:

_Complexidade Inicial_:

A implementação inicial pode parecer mais complexa do que estruturas mais simples, especialmente para projetos pequenos ou simples.

_Curva de Aprendizado_:

A equipe pode precisar de tempo para se acostumar com a abordagem e entender a lógica de separação de responsabilidades propostas.