package com.foodtruck.api.repository;

import com.foodtruck.api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Apenas com essa linha, você já tem métodos como:
    // .findAll(), .save(), .findById(), .deleteById()
}
