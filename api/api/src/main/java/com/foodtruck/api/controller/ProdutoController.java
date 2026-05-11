package com.foodtruck.api.controller;

import com.foodtruck.api.model.Produto;
import com.foodtruck.api.repository.ProdutoRepository;
import org.springframework.stereotype.Controller; // Importação correta para HTML
import org.springframework.ui.Model; // Necessário para levar dados ao HTML
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller // Removido o @RestController para permitir renderizar templates
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public String listar(Model model) {
        List<Produto> produtos = produtoRepository.findAll();
        
        // Adiciona a lista ao "pacote" que o Thymeleaf vai ler no HTML
        model.addAttribute("produtos", produtos);
        
        // Retorna o caminho: templates/produtos/lista.html
        return "produtos/lista"; 
    }
}
