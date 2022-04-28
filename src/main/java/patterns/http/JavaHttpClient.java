package patterns.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		try {
			URL urlApi = new URL(url);
			URLConnection openedConection = urlApi.openConnection();
			openedConection.connect();
		} catch (Exception error) {
			throw new RuntimeException("Erro ao conectar! ");
		}
	}

}
