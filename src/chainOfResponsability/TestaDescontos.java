package chainOfResponsability;

import strategyImposto.Orcamento;

public interface TestaDescontos {

	public static void main(String[] args) {
		CalculadoraDeDesconto calculador = new CalculadoraDeDesconto();

		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));

		double desconto = calculador.calcula(orcamento);

		System.out.println(desconto);

	}

}
