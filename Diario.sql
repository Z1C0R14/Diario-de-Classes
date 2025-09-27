CREATE DATABASE Diario;
USE Diario;

CREATE TABLE Usuarios (
    id INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Usuarios (id, nome, idade, email, senha) VALUES
(100000, 'Diego de Almeida Silva', 20, 'diegodealmeidasilva2005@gmail.com', 'zicotop1');