package strategyInvestimento;

public class Conservador implements Investimento {

	@Override
	public double aplica(Conta conta) {
		return retornaLucro(conta.getSaldo() * 0.008);
	}
}
