
# 🍫 NR Brownies & Bolos - API de Gestão

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

---

### Dicas para Destacar o Projeto

* **Screenshots:** Tire um print da tela do seu **Swagger** com o "Success" e salve na pasta do projeto. No Markdown, você pode exibir a imagem usando: `![Texto Alternativo](caminho/da/imagem.png)`.
* **Logs:** Você pode até colocar um print do seu terminal mostrando a mensagem **"Pagamento PIX processado"** para provar que a lógica de negócio está redonda.



---

### Como salvar no GitHub?

Depois de criar e salvar o arquivo no VS Code, rode estes comandos no terminal para atualizar seu repositório remoto:

1. `git add README.md`
2. `git commit -m "docs: adiciona README detalhado com padrões de projeto"`
3. `git push origin main`

**Gostaria que eu te ajudasse a criar uma seção de "Desafios Superados" para o seu README, contando como você resolveu os erros de inicialização do banco de dados e sincronização do Maven?** Isso demonstra uma habilidade de *troubleshooting* muito valiosa!

```
