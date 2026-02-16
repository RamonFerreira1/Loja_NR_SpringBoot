
# 🍫 NR Brownies & Bolos - API de Gestão
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

Esta é uma API robusta desenvolvida com **Spring Boot** para gerenciar as vendas e o estoque da doceria NR Brownies & Bolos. O projeto foi construído focando em **Design Patterns** para garantir um código limpo, escalável e de fácil manutenção.

---

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3.2.2**
* **Spring Data JPA** (Persistência de dados)
* **H2 Database** (Banco de dados em memória)
* **Maven** (Gerenciamento de dependências)
* **Swagger/OpenAPI** (Documentação interativa)

---

## 🛠️ Padrões de Projeto Aplicados

O coração desta API utiliza três padrões fundamentais recomendados pela DIO:

1. **Singleton:** O Spring gerencia os Services e Repositories como instâncias únicas, otimizando o uso de memória.
2. **Strategy Pattern:** Utilizado para processar diferentes métodos de pagamento (PIX ou Cartão) sem acoplamento.
3. **Facade Pattern:** Uma fachada de checkout que orquestra a baixa de estoque, o cálculo do total e a finalização do pedido em um único ponto de entrada.

---

## 📦 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone [https://github.com/RamonFerreira1/Loja_NR_SpringBoot.git](https://github.com/RamonFerreira1/Loja_NR_SpringBoot.git)

```

2. No terminal, execute o Maven para baixar as dependências:
```bash
mvn clean install

```


3. Rode a aplicação através da classe `ApiApplication.java`.

---

## 🔍 Testando a API

Assim que o sistema estiver online, acesse a documentação interativa:
📍 **Swagger UI:** [http://localhost:8080/swagger-ui/index.html](https://www.google.com/search?q=http://localhost:8080/swagger-ui/index.html)

Lá você poderá testar o endpoint de checkout enviando um JSON como este:

```json
{
  "itens": [{ "produtoId": 1, "quantidade": 2 }],
  "metodoPagamento": "PIX"
}

```

```
🧠 Desafios Superados & Aprendizados
Durante o desenvolvimento desta API, enfrentei e resolvi desafios técnicos reais que aprimoraram minha compreensão sobre o ecossistema Java:

Sincronização de Dependências: Resolvi erros de compilação onde o VS Code não reconhecia as bibliotecas do Spring Boot, utilizando o Maven para reconstruir o projeto (mvn clean install) e sincronizando a configuração do workspace.

Gestão de Banco de Dados H2: Solucionei a exceção Table "PRODUTO" not found ajustando a propriedade spring.jpa.defer-datasource-initialization, garantindo que o Hibernate criasse as tabelas antes da execução do script de carga de dados (data.sql).

Arquitetura de Pastas: Corrigi problemas de pacotes (package does not exist) reorganizando a estrutura de diretórios para seguir rigorosamente o padrão de pacotes do Java dentro de src/main/java.

Versionamento Profissional: Consolidei o uso do Git para gerenciar o histórico de alterações e preparar o projeto para o deploy no GitHub.


