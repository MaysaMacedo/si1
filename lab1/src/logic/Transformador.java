package logic;

public class Transformador {
	private static int milhao = 1000000;
	private static int mil = 1000;
	private static int bilhao = 1000000000;
	private static String[] entre0e19 = { "zero", "um", "dois", "tres","quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze",
			"doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete","dezoito", "dezenove" };
	private static String[] dezena = { "vinte", "trinta", "quarenta","ciquenta", "sessenta", "setenta", "oitenta", "noventa" };
	private static String[] centena = { "cem", "duzentos", "trezentos","quatrocentos", "quinhentos", "seiscentos", "setecentos",
			"oitocentos", "novecentos" };

	/**
	 * Retorna o valor em sua versão escrita
	 * 
	 * @param valor
	 *            valor a ser transformado
	 * @return versão escrita
	 */
	public String getValue(int valor) {
		// [0..99]
		if (valor == bilhao) {
			return "um bilhão";
		}
		if (valor < 100) {
			return getMenoresDe99(valor);
		}
		// centena
		else if (valor >= 100 && valor < 1000) {
			return getCentena(valor);
		} else if(valor < 1000000){
			return getMilhar(valor);
		} else {
			return getMilhao(valor);
		}
	}

	/**
	 * Transforma os números unitários e decimais em sua versão em português
	 * 
	 * @param valor
	 * @return versão escrita
	 */
	public String getMenoresDe99(int valor) {
		char[] charArray = converteInteiro(valor);
		if (valor < 20) {
			return entre0e19[valor];
		} else {
			if (Integer.valueOf(String.valueOf(charArray[1])) == 0) {
				return dezena[Integer.valueOf(String.valueOf(charArray[0])) - 2];
			}
			return dezena[Integer.valueOf(String.valueOf(charArray[0])) - 2]
					+ " e "
					+ entre0e19[(Integer.valueOf(String.valueOf(charArray[1])))];
		}
	}

	/**
	 * Transforma os números da centesimais para sua português
	 * 
	 * @param i
	 *            valor a ser tranformado
	 * @return versão escrita
	 */
	public String getCentena(int valor) {
		String resposta = "";
		// casa da centena
		if (valor > 100 && valor < 200) {
			resposta = "cento";
		} else {
			resposta = centena[valor / 100 - 1];
		}

		valor = valor % 100;
		// casa da dezena e unidade
		if (valor != 0) {
			resposta += " e " + getMenoresDe99(valor);
		} else {
			resposta += "";
		}
		return resposta;
	}

	/**
	 * Transforma os números dos milhares para sua português
	 * 
	 * @param valor
	 *            valor a ser tranformado
	 * @return versão escrita
	 */
	public String getMilhar(int valor) {
		int parteMilhar = valor / mil;
		if (valor == mil) {
			return "mil";
		}
		if (valor % 1000 != 0) {
				if (parteMilhar == 0) {
					return "e " + getValue(valor % 1000);
				}
				else if(parteMilhar == 1) {
					return "mil " + "e "+ getValue(valor % 1000);
				}
				return getValue(parteMilhar)+ " mil " + "e "+ getValue(valor % 1000);
			}
		return getValue(parteMilhar) + " mil";
	}

	/**
	 * Transforma os números dos milhões para sua português
	 * 
	 * @param i
	 *            valor a ser tranformado
	 * @return versão escrita
	 */
	public String getMilhao(int i) {
		int parteMilhao = i / milhao;
		if (parteMilhao == 1) {
			return getValue(parteMilhao) + " milhão " + getMilhar(i % milhao);
		}
		return getValue(parteMilhao) + " milhões " + getMilhar(i % milhao);
	}

	/**
	 * Converte o inteiro para um arry de char
	 * 
	 * @param inteiro
	 *            a ser convertido
	 * @return o array de chars
	 */
	private char[] converteInteiro(int i) {
		String elem = String.valueOf(i);
		char[] charArray = elem.toCharArray();
		return charArray;

	}
}
