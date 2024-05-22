Contextualização do Problema


Você foi contratado por um museu para desenvolver um sistema que ajudará no gerenciamento de seu acervo de obras de arte. O museu enfrenta desafios para manter os registros das obras atualizados, organizar as exposições, e fornecer informações rápidas e precisas sobre as obras disponíveis. O objetivo do projeto é criar um sistema informatizado que facilite o cadastro, a busca, a atualização e a exclusão de registros de obras de arte. Além disso, o sistema deve ser capaz de gravar e recuperar dados de arquivos, permitindo um gerenciamento eficiente do acervo.

Etapas do Exercício
Etapa 1: Cadastro de Obras de Arte
Para começar, precisamos criar um sistema que permita o cadastro de obras de arte. Cada obra deve ter informações básicas como título, artista, ano de criação, tipo de obra (pintura, escultura, etc.) e localização no museu. Este cadastro será a base do nosso sistema de gerenciamento de obras de arte.

Tarefa:

Permitir a entrada dos dados da obra de arte: título, artista, ano de criação, tipo de obra e localização.
Garantir que os dados inseridos sejam válidos e completos.
Etapa 2: Armazenamento e Organização dos Dados
Agora que podemos cadastrar obras de arte, precisamos de uma maneira de armazenar esses dados de forma organizada para facilitar futuras operações. Vamos criar uma estrutura para guardar as obras de arte cadastradas.

Tarefa:

Armazenar as obras de arte cadastradas em uma estrutura que permita fácil acesso e manipulação.
Garantir que essa estrutura suporte a adição de novas obras e a busca de obras já cadastradas.
Etapa 3: Recuperação e Exibição de Dados
Com as obras de arte armazenadas, o próximo passo é permitir que os usuários recuperem informações sobre as obras cadastradas. O sistema deve ser capaz de listar todas as obras e buscar uma obra específica pelo título.

Tarefa:

Implementar uma funcionalidade para listar todas as obras de arte cadastradas.
Implementar uma funcionalidade para buscar uma obra específica pelo título e exibir suas informações.
Etapa 4: Atualização e Exclusão de Dados
Além de cadastrar e buscar obras de arte, o sistema também deve permitir a atualização das informações de uma obra e a exclusão de obras do sistema.

Tarefa:

Implementar uma funcionalidade para atualizar os dados de uma obra de arte existente.
Implementar uma funcionalidade para excluir uma obra de arte do sistema.
Etapa 5: Persistência de Dados
Para garantir que os dados das obras de arte sejam mantidos mesmo após o fechamento do sistema, precisamos implementar uma maneira de gravar e recuperar os dados de arquivos.

Tarefa:

Implementar a gravação dos dados das obras de arte em um arquivo.
Implementar a leitura dos dados das obras de arte a partir de um arquivo e carregá-los na estrutura de armazenamento ao iniciar o sistema.
Etapa 6: Organização Modular do Sistema
Para facilitar a manutenção e a escalabilidade do sistema, vamos organizar o código em módulos distintos, cada um responsável por uma parte específica do sistema.

Tarefa:

Separar as funcionalidades do sistema em diferentes módulos, como entrada de dados, gerenciamento de obras de arte e persistência de dados.
Garantir que cada módulo seja responsável por uma tarefa específica e que os módulos trabalhem juntos de forma coesa.
Etapa 7: Suporte a Diferentes Tipos de Obras de Arte
Para melhorar a flexibilidade e a reutilização do código, vamos implementar uma solução que permita a criação de diferentes tipos de obras de arte, como pinturas, esculturas e fotografias, usando um tipo de obra de arte como base.

Tarefa:

Criar uma estrutura básica que permita diferentes tipos de obras de arte com propriedades comuns.
Implementar uma solução que permita a criação de diferentes tipos de obras de arte no sistema usando um tipo de obra como base.
Etapa 8: Gerenciamento Avançado de Dados
Finalmente, vamos implementar funcionalidades avançadas de gerenciamento de dados, como a possibilidade de realizar operações complexas de busca e manipulação de registros de obras de arte.

Tarefa:

Implementar operações avançadas de busca que permitam filtrar obras de arte por diferentes critérios, como artista, ano de criação e tipo de obra.
Garantir que o sistema seja robusto e eficiente, lidando adequadamente com grandes volumes de dados e múltiplas operações simultâneas.
Resumo
Essas etapas guiarão o desenvolvimento de um sistema de gerenciamento de obras de arte para um museu. Cada etapa aumenta gradualmente a complexidade, introduzindo novos conceitos e funcionalidades que culminam em um sistema completo, modular e escalável.