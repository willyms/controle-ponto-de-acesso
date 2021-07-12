 Controle de Ponto e Acesso
===========================
---
#### Descrição do desafio
Neste projeto foi desenvolvida uma API Rest para controle de ponto e acesso de uma empresa.

Foram utilizadas as tecnologias: Java, Spring Boot, Gradle, Hibernate Envers, Postgres e lombok, além da documentação de toda a API com Swagger

* Criada uma nova classe para as chaves com annotation @Embeddable, melhorando a documentação da API gerada e melhorando a interação com a mesma.
* A opção pela utilização de @ManyToOne(cascade= CascadeType.PERSIST) deu-se ao fato de facilitar a integração com testes, tais como swagger e Postman.

###Tecnologias utilizadas:
- [Docker](https://docs.docker.com/get-started/)
- Java
- JPA
- Hibernate
- [Lombok](https://projectlombok.org/)
- Postgres

###Pré requisito
Para executar este aplicativo, você precisa instalar duas ferramentas: Docker e Docker Compose.

Instruções de como instalar o Docker no [Ubuntu](https://docs.docker.com/engine/install/ubuntu/), [Windows](https://docs.docker.com/docker-for-windows/install/), [Mac](https://docs.docker.com/docker-for-mac/install/).

Docker Compose já está incluído nos pacotes de instalação para Windows e Mac, portanto, apenas usuários do Ubuntu precisam seguir estas [instruções](https://docs.docker.com/compose/install/).

###Executando
Pode ser executado um único comando no terminal:
~~~
$ docker-compose up -d
~~~
Se você quiser pará-lo, execute o seguinte comando:
~~~
$ docker-compose down
~~~

A lista completa de endpoints REST disponíveis pode ser encontrada na IU Swagger, que pode ser chamada usando o link: http://localhost:8080/swagger-ui.html

Este aplicativo também é colocado no contêiner do Docker e as suas definições podem ser encontrada no arquivo `./Dockerfile`.

@willyms