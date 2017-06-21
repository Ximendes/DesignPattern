package strategyInvestimento;

public class TesteDeInvestimento {

	public static void main(String[] args) {
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();

		Conta juca = new Conta("JUCA", 100.0);
		Conta maria = new Conta("MARIA", 100.0);
		Conta janaina = new Conta("JANAINA", 100.0);

		RealizadoDeInvestimentos realizadoDeInvestimentos = new RealizadoDeInvestimentos();

		realizadoDeInvestimentos.investe(juca, conservador);
		realizadoDeInvestimentos.investe(maria, moderado);
		realizadoDeInvestimentos.investe(janaina, arrojado);
	}
}
