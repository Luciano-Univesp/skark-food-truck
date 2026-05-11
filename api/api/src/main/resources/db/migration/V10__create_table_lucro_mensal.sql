CREATE TABLE performance_financeira (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mes_referencia INT NOT NULL,
    ano_referencia INT NOT NULL,
    faturamento_bruto DECIMAL(15,2) DEFAULT 0.00, -- Soma da tabela Pagamentos
    custo_insumos_total DECIMAL(15,2) DEFAULT 0.00, -- Soma baseada na Ficha Técnica x Vendas
    despesas_fixas_total DECIMAL(15,2) DEFAULT 0.00, -- Soma da tabela Despesas
    lucro_liquido DECIMAL(15,2) AS (faturamento_bruto - custo_insumos_total - despesas_fixas_total), -- Coluna calculada
    data_fechamento TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Exemplo de fechamento simulado
INSERT INTO performance_financeira (mes_referencia, ano_referencia, faturamento_bruto, custo_insumos_total, despesas_fixas_total)
VALUES (5, 2026, 12500.00, 4200.00, 1500.00);
