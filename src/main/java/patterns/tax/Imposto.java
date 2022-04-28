package patterns.tax;

import java.math.BigDecimal;

import patterns.budget.Orcamento;

public abstract class Imposto {

	private Imposto outro;

	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal outroImposto = BigDecimal.ZERO;
		if(this.outro != null) {
			valorImposto = outro.realizarCalculo(orcamento);
		}
		return valorImposto.add(outroImposto);
	}

}
