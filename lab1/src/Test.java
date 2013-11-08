import static org.junit.Assert.assertTrue;
import org.junit.Before;


public class Test {
	
	Transformador transformador;
	@Before
	public void setUp() {
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
	}
	
	/**
	 * Testa a transformação de números da forma de milhar
	 */
	@org.junit.Test
	public void transformaMilhar() {
		assertTrue(transformador.getMilhar(24200).equals("vinte e quatro mil e duzentos"));
		assertTrue(transformador.getMilhar(100000).equals("cem mil"));
		assertTrue(transformador.getMilhar(100001).equals("cem mil e um"));
		
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
		assertTrue(transformador.getValue(1000000000).equals("um bilhão"));
	
	}
}















