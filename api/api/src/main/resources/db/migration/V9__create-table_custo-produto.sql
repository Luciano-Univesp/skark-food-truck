CREATE TABLE ficha_tecnica (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    produto_id BIGINT NOT NULL,
    ingrediente_id BIGINT NOT NULL,
    quantidade_usada DECIMAL(10,3) NOT NULL, -- Ex: 0.150kg de carne
    custo_proporcional DECIMAL(10,2) NOT NULL, -- Valor calculado na hora do cadastro
    CONSTRAINT fk_ficha_produto FOREIGN KEY (produto_id) REFERENCES produtos(id),
    CONSTRAINT fk_ficha_ingrediente FOREIGN KEY (ingrediente_id) REFERENCES ingredientes(id)
);

-- Exemplo: Shark Burger (ID 1) usa 150g de Carne (ID 2)
INSERT INTO ficha_tecnica (produto_id, ingrediente_id, quantidade_usada, custo_proporcional) 
VALUES (1, 2, 0.150, 4.50);