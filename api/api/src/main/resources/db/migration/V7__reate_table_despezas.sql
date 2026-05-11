CREATE TABLE despesas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    data_vencimento DATE NOT NULL,
    pago BOOLEAN DEFAULT FALSE,
    categoria_despesa VARCHAR(100) -- Ex: Fixo, Variável, Insumos
);

-- Algumas despesas iniciais para teste
INSERT INTO despesas (descricao, valor, data_vencimento, pago, categoria_despesa) 
VALUES ('Aluguel do Ponto', 1500.00, '2026-05-10', true, 'Fixo');

INSERT INTO despesas (descricao, valor, data_vencimento, pago, categoria_despesa) 
VALUES ('Compra de Carne (Fornecedor X)', 850.00, '2026-05-15', false, 'Variável');