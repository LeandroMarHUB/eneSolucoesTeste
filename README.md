> # Ene Soluções
>
> Projeto de teste automatizado, com SeleniumWebdriver + java

> # Foram elaborados 1 cenário

 Funcionalidade   | Cadastrar Usuário
--------- | ------
Escolhendo um produto e colocando no carrinho  | Ok

> # Validações realizadas
- Logar no site
- Acessar a barra de busca de produtos
- Clicar no produto escolhido
- Verificar se o produto escolhido foi para o carrinho



Ponto a melhorar ou uma análise do projeto:

Não usei o driver.wait, porque o site muda os elementos, e o Thread.sleep, funcionou melhor


Foi feita a escrita em BDD, gerando o Gherkin em Cucumber.
Automação em java.

> # Como rodar o projeto?
- Projeto realizado em Maven, ja com todas depêndencias
- O projeto cria dois tipos de relatórios, um em HTML simples. Onde será necessário rodar o projeto, e depois ir neste caminho abaixo
-  Target > reports > index.html, clicar neste arquivo com o botão direito do Mouse, e ir em, Open in > Browser, e escolher o navegador de sua preferência 
- ![image](https://github.com/LeandroMarHUB/testTinnova/assets/79597874/bda2c20e-c9a5-4c09-96cd-b1f84078cd4f)
- Outro relatório com um gráfico mais apurado, e este 
- Roda o projeto via terminal, colocando este comando a baixo no terminal
- mvn test -Dtest=**/*RunCucumberTest cluecumber-report:reporting
- Depois de rodar o projeto via terminal, faça este caminho a baixo, para ter acesso ao relatório
-  Target > formatedreport > index.html, clicar neste arquivo com o botão direito do Mouse, e ir em, Open in > Browser, e escolher o navegador de sua preferência
- ![image](https://github.com/LeandroMarHUB/testTinnova/assets/79597874/7fbe09e0-f479-4216-98d2-82a58b1cce7d)

> # Tecnologias
SeleniumWebDriver

- Junit

- Cucumber

- Report Trivago

- BDD


## Autor: Leandro Martins de Souza
