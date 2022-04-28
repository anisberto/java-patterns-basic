package patterns.tax;

import java.math.BigDecimal;

import patterns.budget.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal realizarCalculo(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
