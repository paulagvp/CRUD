# PROJETO QUIZ - MJV School #

Projeto desenvolvido durante o curso de Java oferecido pela MJV School ministrado pelo professor Samuel, com a finalidade de criar um sistema de quiz 
conectado a um banco de dados. 

-----------------------------------------
# Ferramentas utilizadas no projeto #

<img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="40" height="40"/>    <img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/dbeaver/dbeaver-original.svg" width="40" height="40"/>    <img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="40" height="40"/>    <img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postgresql/postgresql-plain-wordmark.svg" width="40" height="40"/>    <img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" width="40" height="40"/>    <img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/git/git-original-wordmark.svg" width="40" height="40"/>    <img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" width="40" height="40"/>    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/hibernate/hibernate-original.svg" width="40" height="40"/>


- **Linguagem**: Java 21
- **Framework**: Spring Boot
- **Banco de Dados**: PostgreSQL

------------------------------------------

# Diagrama - Lógica # 

O projeto ainda está em andamento, com o objetivo de adotar o modelo de arquitetura de software MVC (Model-View-Controller). Esse modelo sugere uma abordagem estruturada para dividir as responsabilidades de forma mais clara e eficiente.

![img_3.png](img_3.png)

> [!NOTE]
> Até o momento foram criadas as etapas em laranja no diagrama.

------------------------------------------

# Testes #

Inicialmente foram desenvolvidos testes para avaliar a funcionalidade do código, abrangendo as operações CRUD (Create, Read, Update, Delete), que são essenciais no desenvolvimento de qualquer aplicação. Essas operações foram aplicadas em bases de dados relacionais para assegurar que os dados fossem armazenados e manipulados corretamente pelos usuários do sistema:

- UserTest
- QuestionTest
- AlternativeTest

------------------------------------------

# Próximos passos #

- [ ] Criação das demais estruturas do diagrama: Continuar desenvolvendo as diferentes camadas da aplicação de acordo com o modelo MVC. Isso pode incluir a implementação das camadas de serviço, persistência e apresentação.

- [ ] Integração do Swagger: Utilizar o Swagger para documentar a API da aplicação. Isso envolve a configuração do Swagger no projeto Spring Boot e a anotação dos endpoints da API com informações adicionais, como descrição, parâmetros e respostas esperadas.

- [ ] Desenvolvimento das funcionalidades específicas: Implementar as funcionalidades da aplicação de acordo com os requisitos do projeto. Isso pode envolver a criação de novas classes, métodos e endpoints da API.

- [ ] Integração com o banco de dados PostgreSQL: Configurar a conexão com o banco de dados PostgreSQL e implementar as operações de persistência para armazenar e recuperar os dados da aplicação.

- [ ] Desenvolvimento de novos testes: Expandir a suíte de testes para cobrir as novas funcionalidades adicionadas à aplicação. Isso garante que as novas alterações não quebrem o funcionamento das partes já existentes.

- [ ] Refatoração e otimização do código: Revisar o código existente para identificar possíveis melhorias de desempenho, legibilidade e manutenibilidade. Isso pode incluir a eliminação de código duplicado, a aplicação de padrões de design e a otimização de consultas ao banco de dados.

- [ ] Documentação: Documentar o código-fonte, APIs e processos de instalação e configuração para facilitar o entendimento e a manutenção da aplicação por outros desenvolvedores.

------------------------------------------

# Atalhos interessantes #

- _ctrl + shift + o_ : Remove os imports que não estão sendo utilizados;
- _shift + F6_ : Renomeia o texto alterado em todo o código.
- _ctrl + shift + F10_: Executa o último arquivo ou classe executada.
- _ctrl + shift + F9_: Compila o projeto.
- _ctrl + d_: Duplica a linha atual de código.
- _ctrl + / (Barra invertida)_: Comenta ou descomenta a linha ou bloco de código selecionado.