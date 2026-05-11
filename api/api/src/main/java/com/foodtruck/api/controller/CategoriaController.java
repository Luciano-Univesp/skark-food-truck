package com.foodtruck.api.controller;

import com.foodtruck.api.model.Categoria;
import com.foodtruck.api.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categorias") // Todas as rotas aqui começam com /categorias
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Rota para listar todas as categorias: localhost:8080/categorias
    @GetMapping
    public String listar(Model model) {
        List<Categoria> lista = categoriaRepository.findAll();
        model.addAttribute("categorias", lista);
        return "categorias/lista"; // Vai procurar em templates/categorias/lista.html
    }
}