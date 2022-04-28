package patterns.budget;

import java.util.Map;

import patterns.DomainException;
import patterns.http.HttpAdapter;

public class RegistroDeOrcamento {

	private HttpAdapter http;

	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {throw new DomainException("Erro faltal! Não Finalizado");}
		String url = "http://localhost:8080/api/cliente";
		Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidade", orcamento.getQuantidadeItens());
		http.post(url, dados);
	}

}
