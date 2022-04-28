package patterns;

import java.math.BigDecimal;

import patterns.budget.Orcamento;
import patterns.budget.RegistroDeOrcamento;
import patterns.http.JavaHttpClient;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}
}
