
CREATE TABLE carro (
    placa CHAR(7) NOT NULL PRIMARY KEY,
    cor VARCHAR(20),
    descricao VARCHAR(100)
);

SHOW TABLES;
DESCRIBE carro;

USE estacionamento;
SELECT * FROM carro;