**Arquitetura Limpa**

Estrutura:
- Core
- Adapter
- Infrastructure

**Core** - Camada responsável por manter as regras de negócio, que irá ser acessada atráves interfaces. A implementação da interface do UseCase fica no core enquanto as demais são da camada de adapter.

**Adapter** - Camada responsável por manter as implementações das interfaces de saida e também os meios que vão chamar a aplicação (controller, mensageria, etc);

**Infrastrucutre** - Camada responsável por manter as configurações da aplicação, como BeanConfiguration por exemplo.
