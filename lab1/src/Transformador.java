
public class Transformador {
	int milhao = 1000000;
	int mil = 1000;
	int bilhao = 1000000000;
	String [] unidade = {"zero","um","dois","tres","quatro","cinco","seis","sete","oito","nove","dez","onze","doze","treze","quatorze","quinze","dezesseis","dezessete","dezoito","dezenove"};
	String [] dezena = {"vinte","trinta","quarenta","ciquenta","sessenta","setenta","oitenta","noventa"};
	String [] centena = {"cento","duzentos","trezentos","quatrocentos","quinhentos","seiscentos","setecentos","oitocentos","novecentos"};
	
	public String getValue(int i ) {
		//0 - 19
		if(i <= 19) {
			return unidade[i];
		}
		//dezena
		if(i < 100 ) {
			return getDezena(i);
		}
		//centena
		if(i >= 100 && i < 1000 ) {
			return getCentena(i);
		}
		else {
			return getMilhar(i);
		}
	}
	
	public String getDezena(int i) {
		String elem = String.valueOf(i);
		char[] charArray = elem.toCharArray();
		if(Integer.valueOf(String.valueOf(charArray[1])) == 0) {
			return dezena[Integer.valueOf(String.valueOf(charArray[0]))-2] ;
		}
		return dezena[Integer.valueOf(String.valueOf(charArray[0]))-2] +" e " + unidade[(Integer.valueOf(String.valueOf(charArray[1])))];
	}
	
	public String getCentena(int i ) {
		String elem = String.valueOf(i);
		char[] charArray = elem.toCharArray();
		
		if(Integer.valueOf(String.valueOf(charArray)) == 100) {
			return "cem";
		}
		if(Integer.valueOf(String.valueOf(charArray[1]))==0 && Integer.valueOf(String.valueOf(charArray[2])) ==0) {
			return centena[Integer.valueOf(String.valueOf(charArray[0]))-1];
		}
		if(Integer.valueOf(String.valueOf(charArray[1])) != 0 && Integer.valueOf(String.valueOf(charArray[2])) == 0) {
			return centena[Integer.valueOf(String.valueOf(charArray[0]))-1] + " e " + 
					dezena[Integer.valueOf(String.valueOf(charArray[1]))-2] ;
		}
		return centena[Integer.valueOf(String.valueOf(charArray[0]))-1] + " e " +
				dezena[Integer.valueOf(String.valueOf(charArray[1]))-2] +" e " + 
				unidade[(Integer.valueOf(String.valueOf(charArray[2])))];
	}
	
	public String getMilhar(int i) {
		int valor = i/milhao;
		int valor2 = i /mil;
		if(i == bilhao) {
			return "um bilhão";
		}
		if(i == 100000) {
			return "cem mil";
		}
		if(valor == 0 ){
			return getValue(valor2) + " mil " + "e " + getValue(i%1000);
		}
		else {
			if(valor == 1) {
				return getValue(valor)+" milhão " + getMilhar(i % milhao);
			}
			return getValue(valor)+" milhões " + getMilhar(i % milhao); 
		}

	}
}
