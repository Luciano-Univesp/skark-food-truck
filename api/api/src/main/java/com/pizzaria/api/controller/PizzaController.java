package com.pizzaria.api.controller;

import com.pizzaria.api.model.Pizza;
import com.pizzaria.api.repository.PizzaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/pizzas") // Define que o endereço será localhost:8080/pizzas
public class PizzaController {

    private final PizzaRepository pizzaRepository;

    // O Spring injeta o repositório automaticamente aqui
    public PizzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping
    public List<Pizza> listar() {
        return pizzaRepository.findAll();
    }
}
