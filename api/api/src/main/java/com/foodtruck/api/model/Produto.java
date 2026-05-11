package com.foodtruck.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "produtos") // Feito a ligação com o novo nome
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Boolean disponivel;

    // ... dentro da classe Produto
@ManyToOne
@JoinColumn(name = "categoria_id")
private Categoria categoria;

@ManyToMany
   @JoinTable(name = "produto_ingrediente",
             joinColumns = @JoinColumn(name = "produto_id"),
             inverseJoinColumns = @JoinColumn(name = "ingrediente_id")
    )
    private java.util.List<Ingrediente> ingredientes;       

@OneToOne(mappedBy = "produto", cascade = CascadeType.ALL)
private Estoque estoque;
    
}
