package State;

import strategyImposto.Orcamento;

public class TestesDoDescontoExtra {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.00);

		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor()); // imprime 475,00 pois descontou
												// 5%
		reforma.aprova(); // aprova nota!
		
//		reforma.finaliza();
//		 reforma.aplicaDescontoExtra(); //lancaria excecao, pois não pode dar desconto nesse estado
         reforma.aprova(); //lança exceção, pois não pode ir para aprovado
      }

}
