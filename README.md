# SpringBootCrud
Para executar esse projeto, clone o repositorio, modifique o nome do arquivo "applicationModel.properties"(/ProjetoSB/src/main/resources/applicationModel.properties) para "application.properties"

Edite o campo (spring.datasource.username= spring.datasource.password=) insirindo o usuario e senha do banco de dados MYSQL do seu sistema

Importe o projeto MAVEN (File -> Import -> Maven -> Existing Maven Projects) na IDE para que as dependências sejam baixadas

Execute a classe ProjetoSbApplication.java (/ProjetoSB/src/main/java/com/github/FabioSCP0/ProjetoSB/ProjetoSbApplication.java)

Para fazer um CREATE no POSTMAN http://localhost:8080/api/produtos/ inserindo o NOME, o PRECO, o DESCONTO do produto

Para fazer um READE de todos os produtos http://localhost:8080/api/produtos/

Para fazer um READE por nome http://localhost:8080/api/produtos/nome/{insira o nome}

Para fazer um READE por paginação http://localhost:8080/api/produtos/pagina/{numero da paginas}/{qtde de paginas}

Para fazer um READE por id http://localhost:8080/api/produtos/{Id}

Para fazer um DELETE no POSTMAN http://localhost:8080/api/produtos/ inserindo o ID do produto.
