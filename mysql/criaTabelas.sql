/*
 * Script SQL com comandos (DDL) para criação de tabelas, chaves primárias e estrangeiras no MySQL.
 *
 * Simulação de um sistema de vendas, inicialmente com duas entidades principais: Cliente e Pedido.
 *
 * Pequena analise sobre as tabelas definidas nesse script SQL:
 * - Um cliente possui 0 ou muitos (n) pedidos - Many To One;
 * - Cada pedido possui 1 ou muitos (n) itens - Many To One;
 *
 * Módulo: Banco de dados
 * Autor: Eder Magalhães
 */

/* Cria uma nova instância no MySQL, se ainda não existir. */
CREATE DATABASE IF NOT EXISTS ap /*!40100 DEFAULT CHARACTER SET latin1 */;
USE ap;

/* Primeiro elimina a tabela caso ela exista. */
DROP TABLE IF EXISTS cliente;

/* Depois cria a tabela para armazenar dados do cliente. */
CREATE TABLE cliente (
  id INT(10) not null auto_increment,
  nome VARCHAR(50),
  email VARCHAR(70),
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS pedido;

/* Cria a tabela para armazenar os pedidos do cliente (compra). */
CREATE TABLE pedido (
  id INT(10) not null auto_increment,
  idCliente INT(10), /* ligação com a tabela cliente */
  dataPedido DATETIME,
  PRIMARY KEY (id),
  CONSTRAINT FOREIGN KEY (idCliente) REFERENCES cliente (id)
);

DROP TABLE IF EXISTS pedido_item;

/* Cria a tabela para armazenar os itens de um pedido. */
CREATE TABLE pedido_item (
  id INT(10) not null auto_increment,
  idPedido INT(10), /* ligação com a tabela pedido */
  descricao VARCHAR(50),
  preco DOUBLE,
  PRIMARY KEY (id),
  CONSTRAINT FOREIGN KEY (idPedido) REFERENCES pedido (id)
);

