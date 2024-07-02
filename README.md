<h1 align="center">
  Desafio Simplify
</h1>

## Condições

> Desenvolver uma aplicação web utilizando uma linguagem de programação e
> um framework de sua escolha. A aplicação deve consistir em um sistema
> de gerenciamento de tarefas, onde os usuários podem criar, visualizar,
> editar e excluir tarefas

Faz parte [desse desafio](https://github.com/simplify-tec/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

## Tecnologias utilizadas
 

```Spring Boot```
```Spring MVC```
```Spring Data JPA```
```SpringDoc OpenAPI 3```
```MySQL```

## Práticas adotadas

```SOLID```, ```DRY```, ```YAGNI```, ```KISS```
```API REST```
```Consultas com Spring Data JPA```
```Injeção de Dependências```
```Tratamento de respostas de erro```
```Geração automática do Swagger com a OpenAPI 3```

## Como Executar

### Pré-requisitos

- Java 11 ou superior
- Maven
- MySQL

### Configuração

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)


## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta ```Postman```:

- Criar Tarefa 
```
$ http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "categoria": "Estudos",
    "realizado": false
  }
]
```

- Listar Tarefas
```
$ http GET :8080/todos

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "categoria": "Estudos",
    "realizado": false
  }
]
```

- Atualizar Tarefa
```
$ http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "categoria": "Estudos",
    "realizado": false
  }
]
```

- Remover Tarefa
```
http DELETE :8080/todos/1

[ ]
