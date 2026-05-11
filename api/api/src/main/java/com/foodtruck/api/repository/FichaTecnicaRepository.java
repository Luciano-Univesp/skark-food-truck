package com.foodtruck.api.repository;

import com.foodtruck.api.model.FichaTecnica;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FichaTecnicaRepository extends JpaRepository<FichaTecnica, Long> {
    // Busca todos os ingredientes de um produto específico
    List<FichaTecnica> findByProdutoId(Long produtoId);
}