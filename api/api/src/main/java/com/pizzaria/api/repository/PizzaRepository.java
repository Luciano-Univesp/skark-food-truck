package com.pizzaria.api.repository;

import com.pizzaria.api.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    // Apenas com essa linha, você já tem métodos como:
    // .findAll(), .save(), .findById(), .deleteById()
}
