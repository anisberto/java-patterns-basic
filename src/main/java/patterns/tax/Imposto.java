package patterns.tax;

import java.math.BigDecimal;

import patterns.budget.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
