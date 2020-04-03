Projeto Spring usando Feigh e Hysdrix.

Usando:

* Lombok
* Devtoos
* Feigh
* Hysdrix
* Gradle


Este pacote possui dois projeto: webApp e o feighWithHysdrix.
Rodar cada uma em um Intellij.

<p>Para simular o circuito fechado, acessar no navegador:</p>
http://localhost:8081/customerClients

Um objeto JSON com atributo "id = 1" será exibido.

<p>Para simular o circuito aberto, para de rodar a aplicação webApp e acessar o mesmo link:</p>
http://localhost:8081/customerClients

Um objeto JSON com atributo "id = 2" será exibido.

Quando o fluxo é normal o objeto de id = 1 é exibido, quando ocorre um rompimento do circuito, o fallback é acionado.
Assim a requisição recebe uma nova rota, q exibe o id = 2.
