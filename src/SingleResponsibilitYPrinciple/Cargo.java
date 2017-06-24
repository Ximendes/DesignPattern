package SingleResponsibilitYPrinciple;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento(),"descricao.desenvolvedor"),
    DBA(new QuinzeOuVinteCincoPorcento(),"descricao.dba"),
    TESTER(new QuinzeOuVinteCincoPorcento(),"descricao.tester");
	
	
	private RegraDeCalculo regraCalculo;
	private String descricao;

	private Cargo(RegraDeCalculo regraCalculo, String descricao) {
		this.regraCalculo = regraCalculo;
		this.descricao = descricao;
	}

	public RegraDeCalculo getRegraCalculo() {
		return regraCalculo;
	}
	public String getDescricao() {
		return descricao;
	}
}
