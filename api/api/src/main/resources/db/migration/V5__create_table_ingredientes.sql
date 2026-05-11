-- 1. Criar a tabela de ingredientes
CREATE TABLE ingredientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    quantidade_stock DECIMAL(10,2) DEFAULT 0.00
);

-- 2. Criar a tabela de ligação (Join Table) entre Produtos e Ingredientes
CREATE TABLE produto_ingrediente (
    produto_id BIGINT NOT NULL,
    ingrediente_id BIGINT NOT NULL,
    PRIMARY KEY (produto_id, ingrediente_id),
    CONSTRAINT fk_produto FOREIGN KEY (produto_id) REFERENCES produtos(id),
    CONSTRAINT fk_ingrediente FOREIGN KEY (ingrediente_id) REFERENCES ingredientes(id)
);

-- 3. Inserir alguns ingredientes base para o Shark Food Truck
INSERT INTO ingredientes (nome, quantidade_stock) VALUES ('Pão Brioche', 50);
INSERT INTO ingredientes (nome, quantidade_stock) VALUES ('Hambúrguer de Carne 180g', 40);
INSERT INTO ingredientes (nome, quantidade_stock) VALUES ('Queijo Cheddar', 100);
INSERT INTO ingredientes (nome, quantidade_stock) VALUES ('Bacon Crispy', 30);