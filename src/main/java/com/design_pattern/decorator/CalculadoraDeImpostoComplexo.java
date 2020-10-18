package com.design_pattern.decorator;


import com.design_pattern.strategy_imposto.ICMS;
import com.design_pattern.strategy_imposto.ISS;
import com.design_pattern.strategy_imposto.Imposto;
import com.design_pattern.strategy_imposto.Orcamento;

public class CalculadoraDeImpostoComplexo {

    private CalculadoraDeImpostoComplexo() {
    }

    public static double calcularISSandICMS() {
        Imposto iss = new ISS(new ICMS());
        Orcamento orcamento = new Orcamento(500.0);
        return iss.calcula(orcamento);
    }

    public static double calcularISSandImpostoMuitoAuto() {
        Imposto iss = new ISS(new ImpostoMuitoAlto());
        Orcamento orcamento = new Orcamento(500.0);
        return iss.calcula(orcamento);
    }

    public static double calcularISSAndImpostoMuitoAutoAndICMS() {
        Imposto iss = new ISS(new ImpostoMuitoAlto(new ICMS()));
        Orcamento orcamento = new Orcamento(500.0);
        return iss.calcula(orcamento);
    }
}
