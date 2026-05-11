CREATE TABLE categorias (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

-- Adicionando a coluna categoria_id na tabela produtos
ALTER TABLE produtos ADD COLUMN categoria_id BIGINT;

-- Criando o relacionamento (Chave Estrangeira)
ALTER TABLE produtos ADD CONSTRAINT fk_produto_categoria 
FOREIGN KEY (categoria_id) REFERENCES categorias(id);

-- Inserindo algumas categorias iniciais para o Shark Food Truck
INSERT INTO categorias (nome) VALUES ('Hambúrgueres');
INSERT INTO categorias (nome) VALUES ('Bebidas');
INSERT INTO categorias (nome) VALUES ('Porções');
