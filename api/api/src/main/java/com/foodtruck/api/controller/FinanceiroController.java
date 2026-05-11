package com.foodtruck.api.controller;

import com.foodtruck.api.repository.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/financeiro")
public class FinanceiroController {

    @Autowired
    private PerformanceRepository performanceRepository;

    @GetMapping("/relatorios")
    public String exibirRelatorios(Model model) {
        // Busca todos os fechamentos mensais
        model.addAttribute("relatorios", performanceRepository.findAll());
        return "financeiro/relatorios";
    }
}
