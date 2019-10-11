
CREATE DATABASE Vendas;
USE Vendas;

CREATE TABLE clientes(
cli_id INTEGER NOT NULL AUTO_INCREMENT,
cli_name VARCHAR(50) NOT NULL,
cli_datacad DATE NOT NULL,
cli_telefixo VARCHAR(15) NULL,
cli_telcel VARCHAR(15) NOT NULL,
cli_email VARCHAR(50) NOT NULL,
cli_logradouro VARCHAR(100) NOT NULL,
cli_numero INT NOT NULL,
cli_complemento VARCHAR(50) NULL,
cli_bairro VARCHAR(50) NULL,
cli_cidade VARCHAR(50) NOT NULL,
cli_uf VARCHAR(50) NOT NULL,
cli_cpf CHAR(11) NOT NULL,
PRIMARY KEY(cli_id));

DESC clientes;

CREATE TABLE produtos(
pro_id INTEGER NOT NULL AUTO_INCREMENT,
pro_nome VARCHAR(50) NOT NULL,
pro_descricao VARCHAR(100) NOT NULL,
pro_valor FLOAT(10,2) NOT NULL,
pro_status CHAR(1) NOT NULL,
PRIMARY KEY(pro_id));

DESC produtos;

CREATE TABLE pedido(
pedido_id INTEGER NOT NULL AUTO_INCREMENT,
fk_cli_id INTEGER NOT NULL,
fk_pro_id INTEGER NOT NULL,
pedido_data DATETIME NOT NULL,
PRIMARY KEY(pedido_id));

DESC pedido;

ALTER TABLE pedido
ADD CONSTRAINT fk_clientes
FOREIGN KEY(fk_cli_id)
REFERENCES clientes(cli_id);

ALTER TABLE pedido
ADD CONSTRAINT fk_pro
FOREIGN KEY(fk_pro_id)
REFERENCES servicos(pro_id);
