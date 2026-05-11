package com.foodtruck.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "performance_financeira")
@Getter
@Setter
public class PerformanceFinanceira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer mesReferencia;
    private Integer anoReferencia;
    private BigDecimal faturamentoBruto;
    private BigDecimal custoInsumosTotal;
    private BigDecimal despesasFixasTotal;

    @Column(insertable = false, updatable = false)
    private BigDecimal lucroLiquido; // O banco calcula automaticamente

    private LocalDateTime dataFechamento = LocalDateTime.now();
}