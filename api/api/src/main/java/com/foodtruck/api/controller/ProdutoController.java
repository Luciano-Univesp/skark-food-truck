package com.foodtruck.api.controller;

import com.foodtruck.api.model.Produto;
import com.foodtruck.api.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/produtos") // Define que o endereço será localhost:8080/produtos
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    // O Spring injeta o repositório automaticamente aqui
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }
}
