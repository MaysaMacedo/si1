package logic;

import java.util.Scanner;


public class Sistema {
	
	private static String informacao = "Esta aplica��o transforma n�meros no formato de algarismo para sua vers�o escrita.";
	//Main
	public static void main(String[] args) {
		
		Transformador sistema = new Transformador();
		System.out.println(informacao);
		Scanner entrada = new Scanner(System.in); 
		String continuar = "SIM";
		
		while(continuar.equals("SIM")) {
			System.out.println("Insira um n�mero para que seja transformado em sua vers�o escrita!");
			int valor = ehNumeroValido();
			String resposta = sistema.getValue(valor);
			System.out.println(resposta);
			System.out.println("Se desejar realizar outra consulta digite SIM, caso contr�rio NAO"); 
			continuar = ehPalavraValida().toUpperCase();
		}
		
	}

	/**
	 * Verifica a validade da entrada
	 * @return palavra
	 */
	private static String ehPalavraValida() {
       String n;
		Scanner valor = new Scanner(System.in);
        if (valor.hasNextInt()) { 
           return message();
        } 
        n = valor.next();
        return n;
	}
	
	/**
	 * Messagem de entrada inv�lida
	 * @return messagem
	 */
	private static String message() {
		System.out.print("Digite um valor v�lido! Tente novamente: "); 
        return ehPalavraValida();
	}
	/**
	 * Verifica se o n�mero � valido 
	 * @return o valor v�lido
	 */
	private static  int ehNumeroValido() { 
        int n; 
        Scanner valor = new Scanner(System.in);
        if (!valor.hasNextInt()) { 
           return messagemDeInvalidez();
        } 
        n = valor.nextInt(); 
        if (n < 0) { 
        	return messagemDeInvalidez();
        } 
        if(n > 1000000000) {
        	return messagemDeInvalidez();
        } 
        if(!valor.hasNextLine()) {
        	return messagemDeInvalidez();
        }
        return n; 
    } 
	
	/**
	 * Menssagem de entrada inv�lida 
	 * @return menssagem
	 */
	private static int messagemDeInvalidez() {
		System.out.print("Digite um valor v�lido! Tente novamente: "); 
        return ehNumeroValido();
	}
}
