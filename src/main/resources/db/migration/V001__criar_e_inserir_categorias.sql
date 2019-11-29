CREATE TABLE categoria (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
	versao Integer NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (nome, versao) values ('Lazer', 0);
INSERT INTO categoria (nome, versao) values ('Alimentação', 0);
INSERT INTO categoria (nome, versao) values ('Supermercado', 0);
INSERT INTO categoria (nome, versao) values ('Farmácia', 0);
INSERT INTO categoria (nome, versao) values ('Outros', 0);