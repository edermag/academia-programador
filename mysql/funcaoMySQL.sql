/*
 * Script SQL com um exemplo de function, um bloco de código que acessa/manipula os registros no banco
 * e no final retorna um resultado para quem o chamou.
 *
 * Essa função tem como objetivo devolver o valor da venda (ou compra) de um determinado cliente.
 * Por isso como entrada ele recebe o argumento com identificador do cliente, e retorna um valor
 * double representando o valor total dos itens do pedido.
 *
 * No MySQL é possível chamar essa função sozinha, ou atrelada a um resultado de SELECT, veja os exemplos:
 *   SELECT calculaValorVenda(1) AS totalVenda; --aciona a função exclusivamente para o cliente 1
 *   SELECT c.nome, calculaValorVenda(c.id) FROM cliente c; -- aciona a função para cada registro da consulta
 *
 * Módulo: Banco de dados
 * Autor: Eder Magalhães
 */

USE ap;

DELIMITER $$

DROP FUNCTION IF EXISTS calculaValorVenda$$
/* Recebe como argumento o código do cliente (id) e retorna um double, o valor da venda*/
CREATE FUNCTION calculaValorVenda (codCliente INT) RETURNS DOUBLE
BEGIN
  -- define a variável que irá armazenar o total da venda
  DECLARE somaVenda DOUBLE;

  -- soma os precos de cada item comprado pelo cliente
  SELECT SUM(i.preco) INTO somaVenda 
  FROM pedido p, pedido_item i WHERE i.idPedido = p.id AND p.idCliente = codCliente;

  -- retorna o resultado da consulta
  RETURN somaVenda;

END$$

DELIMITER ;
