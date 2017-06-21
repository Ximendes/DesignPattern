package strategyImposto;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();

		Orcamento orcamento = new Orcamento(500.0);
		Orcamento orcamento1 = new Orcamento(3001.0);

		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		calculadora.realizaCalculo(orcamento, iss);
		calculadora.realizaCalculo(orcamento, icms);
		calculadora.realizaCalculo(orcamento1, iccc);
	}

}
