import java.util.Scanner;


public class Sistema {
	
	private static String informacao = "A aplica��o transforma n�meros no formato de algarismo para sua vers�o escrita.";
	//Main
	public static void main(String[] args) {
		
		Transformador sistema = new Transformador();
		System.out.println(informacao);
		Scanner entrada = new Scanner(System.in); 
		String continuar = "SIM";
		
		while(continuar.equals("SIM")) {
			System.out.println("Insira um n�mero para que seja transformado em sua vers�o escrita!");
			int valor = verificaInteiro();
			String resposta = sistema.getValue(valor);
			System.out.println(resposta);
			System.out.println("Se desejar realizar outra consulta digite SIM, caso contr�rio NAO"); 
			continuar = entrada.next();
		}
		
	}
	
	/**
	 * Verifica se o n�mero � valido 
	 * @return o valor v�lido
	 */
	private static int verificaInteiro() { 
        int n; 
        Scanner valor = new Scanner(System.in); 
        if (!valor.hasNextInt()) { 
            System.out.print("Digite um valor v�lido! Tente novamente: "); 
            return verificaInteiro(); 
        } 
        n = valor.nextInt(); 
        if (n < 0) { 
            System.out.print("Digite um valor v�lido! Tente novamente: "); 
            return verificaInteiro(); 
        } 
        if(n > 1000000000) {
        	System.out.print("Digite um valor v�lido! Tente novamente: "); 
            return verificaInteiro(); 
        }
        return n; 
    } 
}
