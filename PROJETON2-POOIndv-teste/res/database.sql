
-- Criação da tabela
CREATE TABLE teste (
  id INT PRIMARY KEY,
  nome VARCHAR(50),
  idade INT
);

-- Inserção de dados
INSERT INTO teste (id, nome, idade)
VALUES (1, 'João', 25),
       (2, 'Maria', 30),
       (3, 'Pedro', 20);

-- Consulta de todos os registros
SELECT * FROM teste;

-- Consulta de registros com idade maior que 25
SELECT * FROM teste WHERE idade > 25;

-- Atualização de um registro
UPDATE teste SET idade = 35 WHERE nome = 'Maria';

-- Consulta após atualização
SELECT * FROM teste WHERE nome = 'Maria';

-- Exclusão de um registro
DELETE FROM teste WHERE id = 3;

-- Consulta final
SELECT * FROM teste;
