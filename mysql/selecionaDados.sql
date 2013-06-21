/*
 * Script SQL com comandos de consulta das informações na base de dados de clientes e pedidos.
 *
 * Módulo: Banco de dados
 * Autor: Eder Magalhães
 */

USE ap;

/* Consulta basica, de todos os clientes cadastrados. */
SELECT * FROM cliente;


/* Consulta o email de clientes que possuem nome começando com Maria. */
SELECT email FROM cliente WHERE nome like 'Maria %';


/* Mesma consulta definindo alias (apelido) para a tabela e tratando letras minusculas/maisculas. */
SELECT c.email FROM cliente c WHERE UPPER(c.nome) like 'MARIA %';


/* Consulta utilizando funções do MySQL para formatar dados.
 * Nesse consulta todos os clientes cadastros e exibe os campos:
 *   - nome com todas as letras maíusculas - Função do MySQL: UPPER;
 *   - informa o tamanho do campo de email - Função do MySQL: LENGTH;
 *   - inverte os caracteres que formam o nome do cliente - Função do MySQL: REVERSE;
 */
SELECT UPPER(c.nome), LENGTH(c.email), REVERSE(c.nome) FROM cliente c;


/* Verifica a quantidade de clientes cadastrados. Note o alias (apelido) no resultado (AS qtde). */
SELECT COUNT(c.id) AS qtde FROM cliente c;


/* Consulta informações do pedido, item e clientes, de todos os clientes que compraram. (join requerido) */
SELECT c.nome, p.dataPedido, i.descricao, i.preco
FROM cliente c, pedido p, pedido_item i
WHERE p.idCliente = c.id --liga a tabela pedido com cliente, soh traz os clientes que possuem pedido
  AND i.idPedido = p.id; --liga a tabela de itens com a pedido


/*
 * Consulta traz o nome e data de compra (pedido). Mas é preciso considerar todos os cliente!
 * Os clientes que não compraram devem aparecer, mas o campo de data deve ficar vazio.
 * O inner join não atende essa situação, por isso utilizamos o LEFT OUTER JOIN (join opcional).
 */
SELECT c.nome, p.dataPedido
FROM cliente c LEFT OUTER JOIN pedido p ON p.idCliente = c.id;


/* Utilizando funções do MySQL para extrair informações do banco, sem o uso de tabelas: */
SELECT SYSDATE(); --retorna a data atual no servidor MySQL

SELECT CONCAT('Consulta',' no ', 'MySQL') AS texto; --devolve um registro, com o texto passado na função


