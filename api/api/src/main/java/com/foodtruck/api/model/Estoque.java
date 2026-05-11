package com.foodtruck.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "estoque")
@Getter
@Setter
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "produto_id")
    @JsonIgnore // Evita referência circular ao serializar o produto    
    private Produto produto;

    private Integer quantidadeAtual;
    private Integer quantidadeMinima;
    private LocalDateTime ultimaAtualizacao;
}