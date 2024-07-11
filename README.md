# Projeto Backend - Desafio Magalu

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

## Índice
- [Sobre o Projeto](#sobre-o-projeto)
- [Funcionalidades](#funcionalidades)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Como Usar](#como-usar)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Contato](#contato)

## Sobre o Projeto
Este projeto é uma aplicação backend desenvolvida como parte do Desafio Backend Magalu. O objetivo é criar um microserviço utilizando Spring Boot que gerencia notificações com funcionalidades de agendamento, consulta e cancelamento. O projeto também demonstra como realizar tasks agendadas, comunicação com banco de dados MySQL via Docker e outras boas práticas de desenvolvimento.

## Funcionalidades
- Solicitação de agendamento de notificações
- Consulta de agendamentos de notificações
- Cancelamento de notificações
- Rotina com Spring Scheduler para checagem e envio de notificações
- Configuração de comunicação com MySQL via Docker
- Logs com SLF4J

## Pré-requisitos
- Java 11 ou superior
- Docker
- Maven

## Instalação
1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/Desafio-Back-End-Magalu.git
    cd Desafio-Back-End-Magalu
    ```
2. Configure o MySQL no Docker:
    ```bash
    docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=senha -e MYSQL_DATABASE=nome_banco -p 3306:3306 -d mysql
    ```
3. Atualize as configurações de banco de dados no arquivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/nome_banco
    spring.datasource.username=root
    spring.datasource.password=senha
    ```
4. Execute a aplicação:
    ```bash
    mvn spring-boot:run
    ```

## Como Usar
### Solicitação de Agendamento de Notificação
- Endpoint: `POST /api/notifications/schedule`
- Exemplo de payload:
    ```json
    {
        "channel": "EMAIL",
        "status": "PENDING",
        "message": "Sua notificação agendada!",
        "scheduledTime": "2024-07-11T10:00:00"
    }
    ```

### Consulta de Agendamentos de Notificação
- Endpoint: `GET /api/notifications`

### Cancelamento de Notificação
- Endpoint: `DELETE /api/notifications/{id}`

## Tecnologias Utilizadas
- Java
- Spring Boot
- MySQL
- Docker
- Spring Data JPA
- SLF4J

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).

## Contato
- Seu Nome - [LinkedIn](https://www.linkedin.com/in/gabriel-anacletoo/)
- Email: gabrielanacleto159@live.com
