package patterns.tax;

import java.math.BigDecimal;

import patterns.budget.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outro) {
		super(outro);
	}

	@Override
	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
