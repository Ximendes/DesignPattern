package com.design_pattern.chain_of_responsability;

import com.design_pattern.strategy_imposto.Orcamento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraDeDescontoTest {

    @Test
    public void deveDescontarPorMaisCincoItens() {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento orcamento = new Orcamento(1500.0);
        orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));
        orcamento.adicionaItem(new Item("BORRACHA", 250.0));
        orcamento.adicionaItem(new Item("CADERNO", 250.0));
        orcamento.adicionaItem(new Item("LAPIZEIRA", 250.0));
        orcamento.adicionaItem(new Item("APONTADOR", 250.0));

        double desconto = calculadoraDeDesconto.calcula(orcamento);

        assertEquals(150.0, desconto);
    }

    @Test
    public void deveDescontarPorMaisQuinhentosReais() {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento orcamento = new Orcamento(700.0);
        orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));
        orcamento.adicionaItem(new Item("BORRACHA", 200.0));

        double desconto = calculadoraDeDesconto.calcula(orcamento);

        assertEquals(49, Math.round(desconto));
    }

    @Test
    public void deveDescontarPorVendaCasada() {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento orcamento = new Orcamento(400.0);
        orcamento.adicionaItem(new Item("CANETA", 200.0));
        orcamento.adicionaItem(new Item("LAPIS", 200.0));

        double desconto = calculadoraDeDesconto.calcula(orcamento);

        assertEquals(20, Math.round(desconto));
    }

    @Test
    public void naoDeveTerDesconto() {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento orcamento = new Orcamento(200.0);
        orcamento.adicionaItem(new Item("LAPIS", 200.0));

        double desconto = calculadoraDeDesconto.calcula(orcamento);

        assertEquals(0, desconto);
    }
}