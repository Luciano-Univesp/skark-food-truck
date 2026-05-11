CREATE TABLE pagamentos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    valor_total DECIMAL(10,2) NOT NULL,
    metodo_pagamento VARCHAR(50) NOT NULL, -- Ex: PIX, CARTAO_DEBITO, DINHEIRO
    status VARCHAR(50) NOT NULL, -- Ex: PENDENTE, CONCLUIDO, CANCELADO
    data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    observacao VARCHAR(255)
);

-- Inserindo um exemplo de venda realizada
INSERT INTO pagamentos (valor_total, metodo_pagamento, status, observacao) 
VALUES (85.50, 'PIX', 'CONCLUIDO', 'Pedido mesa 05');