import java.util.Scanner;


public class Sistema {
	
	private static String informacao = "A aplicação transforma números no formato de algarismo para sua versão escrita.";
	//Main
	public static void main(String[] args) {
		
		Transformador sistema = new Transformador();
		System.out.println(informacao);
		Scanner entrada = new Scanner(System.in); 
		String continuar = "SIM";
		
		while(continuar.equals("SIM")) {
			System.out.println("Insira um número para que seja transformado em sua versão escrita!");
			int valor = verificaInteiro();
			String resposta = sistema.getValue(valor);
			System.out.println(resposta);
			System.out.println("Se desejar realizar outra consulta digite SIM, caso contrário NAO"); 
			continuar = entrada.next();
		}
		
	}
	
	/**
	 * Verifica se o número é valido 
	 * @return o valor válido
	 */
	private static int verificaInteiro() { 
        int n; 
        Scanner valor = new Scanner(System.in); 
        if (!valor.hasNextInt()) { 
            System.out.print("Digite um valor válido! Tente novamente: "); 
            return verificaInteiro(); 
        } 
        n = valor.nextInt(); 
        if (n < 0) { 
            System.out.print("Digite um valor válido! Tente novamente: "); 
            return verificaInteiro(); 
        } 
        if(n > 1000000000) {
        	System.out.print("Digite um valor válido! Tente novamente: "); 
            return verificaInteiro(); 
        }
        return n; 
    } 
}
