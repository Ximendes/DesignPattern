package com.design_pattern.decorator;


import com.design_pattern.strategy_imposto.ICMS;
import com.design_pattern.strategy_imposto.ISS;
import com.design_pattern.strategy_imposto.Imposto;
import com.design_pattern.strategy_imposto.Orcamento;

public class TesteDeImpostoComplexo {

	public static void main() {

		Imposto iss = new ISS(new ICMS());

		Orcamento orcamento = new Orcamento(500.0);

		double valor = iss.calcula(orcamento);

		System.out.println(valor);
	}
}
