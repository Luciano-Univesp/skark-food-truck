package com.foodtruck.api.controller;

import com.foodtruck.api.repository.PagamentoRepository;
import com.foodtruck.api.repository.ProdutoRepository;
import com.foodtruck.api.repository.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.math.BigDecimal;

@Controller
public class DashboardController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private PerformanceRepository performanceRepository;

    @GetMapping("/dashboard")
    public String exibirDashboard(Model model) {
        // 1. Vendas do Dia (Simulado - buscando do repositório de pagamentos)
        BigDecimal vendasHoje = pagamentoRepository.findAll().stream()
                .map(p -> p.getValorTotal())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        // 2. Produtos Críticos (Estoque baixo)
        long produtosCriticos = produtoRepository.findAll().stream()
                .filter(p -> p.getEstoque() != null && p.getEstoque().getQuantidadeAtual() <= 5)
                .count();

        // 3. Lucro Mensal (Pegando o último registro de performance)
        BigDecimal ultimoLucro = performanceRepository.findAll().stream()
                .findFirst() // Simplificação para pegar um dado de teste
                .map(perf -> perf.getLucroLiquido())
                .orElse(BigDecimal.ZERO);

        model.addAttribute("vendasHoje", vendasHoje);
        model.addAttribute("produtosCriticos", produtosCriticos);
        model.addAttribute("ultimoLucro", ultimoLucro);

        return "dashboard";
    }
}