package com.foodtruck.api.controller;

import com.foodtruck.api.repository.ProdutoRepository; // Importe seu repositório
import com.foodtruck.api.repository.UsuarioRepository; // Importe também o de usuários
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Importe o Model
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public String entrada() {
        return "entrada";
    }
    
    @GetMapping("/home")
    public String home(Model model) {
        // Buscamos a contagem real no banco de dados
        long totalProdutos = produtoRepository.count();
        long totalUsuarios = usuarioRepository.count();

        // Enviamos esses números para o HTML com nomes que o Thymeleaf entenda
        model.addAttribute("qtdProdutos", totalProdutos);
        model.addAttribute("qtdUsuarios", totalUsuarios);

        return "index";
    }
}