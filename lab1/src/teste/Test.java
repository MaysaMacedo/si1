package teste;


import static org.junit.Assert.assertTrue;
import logic.Transformador;

import org.junit.Before;


public class Test {
	
	Transformador transformador;
	@Before
	public void inicio() {
		transformador = new Transformador();
	}
	
	/**
	 * Testa a transformação de unidade
	 */
	@org.junit.Test
	public void transformaUnidade() {
		assertTrue(transformador.getValue(0).equals("zero"));
		assertTrue(transformador.getValue(1).equals("um"));
		assertTrue(transformador.getValue(2).equals("dois"));
		assertTrue(transformador.getValue(3).equals("tres"));
		assertTrue(transformador.getValue(4).equals("quatro"));
		assertTrue(transformador.getValue(5).equals("cinco"));
		assertTrue(transformador.getValue(6).equals("seis"));
		assertTrue(transformador.getValue(7).equals("sete"));
		assertTrue(transformador.getValue(8).equals("oito"));
		assertTrue(transformador.getValue(9).equals("nove"));

	}
	
	/**
	 * Testa a transformão dos números decimais
	 */
	
	@org.junit.Test
	public void transformaDezena() {
		assertTrue(transformador.getValue(10).equals("dez"));
		assertTrue(transformador.getValue(11).equals("onze"));
		assertTrue(transformador.getValue(12).equals("doze"));
		assertTrue(transformador.getValue(13).equals("treze"));
		assertTrue(transformador.getValue(14).equals("quatorze"));
		assertTrue(transformador.getValue(15).equals("quinze"));
		assertTrue(transformador.getValue(16).equals("dezesseis"));
		assertTrue(transformador.getValue(17).equals("dezessete"));
		assertTrue(transformador.getValue(18).equals("dezoito"));
		assertTrue(transformador.getValue(19).equals("dezenove"));
		assertTrue(transformador.getValue(20).equals("vinte"));
		assertTrue(transformador.getValue(21).equals("vinte e um"));
		assertTrue(transformador.getValue(22).equals("vinte e dois"));
		assertTrue(transformador.getValue(30).equals("trinta"));
		assertTrue(transformador.getValue(32).equals("trinta e dois"));
		assertTrue(transformador.getValue(43).equals("quarenta e tres"));
		assertTrue(transformador.getValue(58).equals("ciquenta e oito"));
		assertTrue(transformador.getValue(79).equals("setenta e nove"));
		assertTrue(transformador.getValue(99).equals("noventa e nove"));
	}
	/**
	 * Testa a transformação de números da forma de centena  
	 */
	@org.junit.Test
	public void tranformaCentena() {
		assertTrue(transformador.getValue(121).equals("cento e vinte e um"));
		assertTrue(transformador.getValue(100).equals("cem"));
		assertTrue(transformador.getValue(120).equals("cento e vinte"));
		assertTrue(transformador.getValue(176).equals("cento e setenta e seis"));
		assertTrue(transformador.getValue(222).equals("duzentos e vinte e dois"));
		assertTrue(transformador.getValue(505).equals("quinhentos e cinco"));
		assertTrue(transformador.getValue(510).equals("quinhentos e dez"));
		assertTrue(transformador.getValue(401).equals("quatrocentos e um"));
		assertTrue(transformador.getValue(101).equals("cento e um"));
		assertTrue(transformador.getValue(110).equals("cento e dez"));
		assertTrue(transformador.getValue(111).equals("cento e onze"));
		assertTrue(transformador.getValue(811).equals("oitocentos e onze"));
		assertTrue(transformador.getValue(814).equals("oitocentos e quatorze"));
		assertTrue(transformador.getValue(101).equals("cento e um"));
		assertTrue(transformador.getValue(999).equals("novecentos e noventa e nove"));
		assertTrue(transformador.getValue(990).equals("novecentos e noventa"));
	}
	
	/**
	 * Testa a transformação de números da forma de milhar
	 */
	@org.junit.Test
	public void transformaMilhar() {
		assertTrue(transformador.getValue(1000).equals("mil"));
		assertTrue(transformador.getValue(1076).equals("mil e setenta e seis"));
		assertTrue(transformador.getValue(1001).equals("mil e um"));
		assertTrue(transformador.getValue(8768).equals("oito mil e setecentos e sessenta e oito"));
		assertTrue(transformador.getMilhar(24200).equals("vinte e quatro mil e duzentos"));
		assertTrue(transformador.getMilhar(100000).equals("cem mil"));
		assertTrue(transformador.getMilhar(100001).equals("cem mil e um"));
		assertTrue(transformador.getMilhar(10509).equals("dez mil e quinhentos e nove"));
		assertTrue(transformador.getMilhar(10500).equals("dez mil e quinhentos"));
		assertTrue(transformador.getMilhar(10510).equals("dez mil e quinhentos e dez"));
		assertTrue(transformador.getMilhar(11000).equals("onze mil"));
		assertTrue(transformador.getMilhar(400000).equals("quatrocentos mil"));
		assertTrue(transformador.getMilhar(400001).equals("quatrocentos mil e um"));
		assertTrue(transformador.getMilhar(400100).equals("quatrocentos mil e cem"));
		assertTrue(transformador.getMilhar(400101).equals("quatrocentos mil e cento e um"));
		assertTrue(transformador.getMilhar(999999).equals("novecentos e noventa e nove mil e novecentos e noventa e nove"));
	}
	
	/**
	 * Testa a transformação de números da forma de milhão
	 */
	@org.junit.Test
	public void transformaMilhao() {
		assertTrue(transformador.getValue(24530200).equals("vinte e quatro milhões quinhentos e trinta mil e duzentos"));
		assertTrue(transformador.getValue(230450220).equals("duzentos e trinta milhões quatrocentos e ciquenta mil e duzentos e vinte"));
		assertTrue(transformador.getValue(100123300).equals("cem milhões cento e vinte e tres mil e trezentos"));
		assertTrue(transformador.getValue(1100001).equals("um milhão cem mil e um"));
		assertTrue(transformador.getValue(1000001).equals("um milhão e um"));
		assertTrue(transformador.getValue(1000100).equals("um milhão e cem"));
		assertTrue(transformador.getValue(1100001).equals("um milhão cem mil e um"));
		assertTrue(transformador.getValue(1000000000).equals("um bilhão"));
	
	}
}















