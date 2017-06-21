package decorator;

import strategyImposto.ICMS;
import strategyImposto.ISS;
import strategyImposto.Imposto;
import strategyImposto.Orcamento;

public class TesteDeImpostoComplexo {

	public static void main(String[] args) {

		Imposto iss = new ISS(new ICMS());

		Orcamento orcamento = new Orcamento(500.0);

		double valor = iss.calcula(orcamento);

		System.out.println(valor);
	}
}
