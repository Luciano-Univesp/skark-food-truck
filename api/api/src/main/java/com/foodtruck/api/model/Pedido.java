package com.foodtruck.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos") // Garanta que esteja no plural se o SQL for V2__..._pedidos
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_nome")
    private String clienteNome;

    private String endereco;
    private BigDecimal total;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido = LocalDateTime.now();
}