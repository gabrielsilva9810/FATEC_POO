CREATE DATABASE bdTaskSystem; -- Cria o banco de dados

USE bdTaskSystem; -- Seleciona o banco de dados

CREATE TABLE tarefas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  titulo VARCHAR(100) NOT NULL,
  descricao TEXT,
  data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
);
