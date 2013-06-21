/*
 * Script SQL com comandos (DML) para preencher a base de dados de clientes e pedidos.
 *
 * Módulo: Banco de dados
 * Autor: Eder Magalhães
 */

USE ap;

/* Inserção de 3 clientes. */
INSERT INTO cliente (nome, email) VALUES ('Carlos Jose', 'carlos@uol.com.br');
INSERT INTO cliente (nome, email) VALUES ('Maria Paula', 'paula@gmail.com');
INSERT INTO cliente (nome, email) VALUES ('Claudia', 'claudia@ig.com.br'); 

/* Insere 2 pedidos, o primeiro do Carlos Jose e o segundo da Maria Paula. */
INSERT INTO pedido (dataPedido, idCliente) VALUES (SYSDATE(), 1); /* carlos */
INSERT INTO pedido (dataPedido, idCliente) VALUES (SYSDATE(), 2); /* maria */

/* Insere um item no pedido do Carlos Jose */
INSERT INTO pedido_item (descricao, preco, idPedido) VALUES ('Camisa', 120.5, 1);

/* Insere dois itens no pedido da Maria Paula */
INSERT INTO pedido_item (descricao, preco, idPedido) VALUES ('Livro', 50.7, 2);
INSERT INTO pedido_item (descricao, preco, idPedido) VALUES ('Calça', 220.2, 2);

