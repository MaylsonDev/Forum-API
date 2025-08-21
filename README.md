# Forum-API

Forum-API é uma API RESTful desenvolvida em **Java** com **Spring Boot** para gerenciamento de tópicos de fórum. A API permite criar, atualizar, excluir e listar tópicos de fórum de forma simples e eficiente, com suporte a paginação e ordenação.

## Tecnologias Utilizadas

- **Java 17+**: Linguagem de programação
- **Spring Boot**: Framework para desenvolvimento de aplicações Java
- **Spring Data JPA**: Para interagir com o banco de dados usando JPA
- **H2 Database** (ou outro banco de sua escolha): Banco de dados em memória (configurável)
- **Flyway**: Para controle de versionamento do banco de dados
- **Lombok**: Para reduzir a quantidade de código boilerplate
- **JUnit**: Para testes unitários

## Funcionalidades

A API possui as seguintes funcionalidades:

- **Criar Tópico**: Permite criar um novo tópico de fórum.
- **Listar Tópicos**: Permite listar tópicos, com suporte a paginação e ordenação.
- **Atualizar Tópico**: Permite atualizar as informações de um tópico existente.
- **Excluir Tópico**: Permite excluir ou marcar um tópico como excluído.
- **Exclusão Lógica**: Implementada para manter os tópicos no banco de dados, mas marcá-los como excluídos.

## Endpoints

### Criar Tópicos
### Atualizar Tópicos
### Deletar Tópicos
### Listar Tópicos
```http
POST /topicos
```http
PUT /topicos
```http
DELETE /topicos
```http
GET /topicos
