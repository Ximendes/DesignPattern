package com.design_pattern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeImpostoComplexoTest {

    @Test
    public void deveCalularISSandICMS(){
        double imposto = CalculadoraDeImpostoComplexo.calcularISSandICMS();
        assertEquals(80.0, imposto);
    }

    @Test
    public void deveCalularISSandImpostoMuitoAlto(){
        double imposto = CalculadoraDeImpostoComplexo.calcularISSandImpostoMuitoAuto();
        assertEquals(130.0, imposto);
    }

    @Test
    public void deveCalularISSandImpostoMuitoAltoAndICMS(){
        double imposto = CalculadoraDeImpostoComplexo.calcularISSAndImpostoMuitoAutoAndICMS();
        assertEquals(180.0, imposto);
    }

}