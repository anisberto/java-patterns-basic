package patterns;

import java.math.BigDecimal;

import patterns.budget.Orcamento;
import patterns.tax.CalculadoraDeImpostos;
import patterns.tax.ISS;

public class DecoratorImposto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.realizarCalculo(orcamento, new ISS(null)));
		
	}
}
