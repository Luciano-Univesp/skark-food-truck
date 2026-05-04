CREATE TABLE pizzas  
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255),
    preco DECIMAL(10, 2) NOT NULL,
    disponivel BOOLEAN DEFAULT TRUE
);

-- Vamos inserir alguns produtos iniciais para teste
INSERT INTO pizzas (nome, descricao, preco) VALUES ('Calabresa', 'Molho de tomate, calabresa fatiada e cebola', 45.00);
INSERT INTO pizzas (nome, descricao, preco) VALUES ('Margherita', 'Molho de tomate, muçarela e manjericão fresco', 42.50);
INSERT INTO pizzas (nome, descricao, preco) VALUES ('Frango com Catupiry', 'Frango desfiado com o legítimo catupiry', 50.00);