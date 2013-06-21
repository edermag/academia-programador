/*
 * Script SQL com um exemplo de procedure, um bloco de código que manipula os registros no banco.
 * Diferente de uma function, a procedure não devolve resultado no fim do processamento.
 *
 * Essa procedure define um bloco de código com a capacidade de inserir registros nas tabelas:
 * cliente, pedido e pedido_item;
 * Uma alternativa interessante para simular um determinado número de cadastros.
 *
 * No MySQL para chamar uma procedure é necessário o comando call, por exemplo:
 *   call preencheBasePedidos(10);
 *
 * Módulo: Banco de dados
 * Autor: Eder Magalhães
 */

USE ap;

DELIMITER $$

DROP PROCEDURE IF EXISTS preencheBasePedidos$$
/* Recebe como argumento a quantidade de registros deve ser inserida em cada tabela. */
CREATE PROCEDURE preencheBasePedidos (qtd INT)
BEGIN

  --definição de algumas variáveis da procedure.
  DECLARE $nome VARCHAR(50);
  DECLARE $email VARCHAR(70);
  DECLARE $descricao VARCHAR(50);
  DECLARE $preco DOUBLE;

  DECLARE x INT;

  -- inicializa a variável de controle do loop
  SET x = 1;

  -- de 1 até o valor informado no argumento qtd
  WHILE x <= qtd DO
    -- a cada iteração do loop, insere um registro em cada tabela
    SET $nome = CONCAT('Cliente ',x);
    SET $email = CONCAT('cliente',x,'gmail.com');
    
    INSERT INTO cliente(nome, email) VALUES($nome, $email);

    -- LAST_INSERT_ID informa o último valor de id (auto_increment) gerado pelo MySQL.
    INSERT INTO pedido(idCliente, dataPedido) VALUES(LAST_INSERT_ID(), SYSDATE());

    SET $descricao = CONCAT('Produto ',x);
    SET $preco = 10 * x; --10, 20, 30 ...

    INSERT INTO pedido_item(idPedido, descricao, preco) VALUES(LAST_INSERT_ID(), $descricao, $preco);

    -- incrementa a variável de controle do loop
    SET x = x + 1;
  END WHILE;
  
END$$

DELIMITER ;
