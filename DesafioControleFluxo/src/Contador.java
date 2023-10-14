import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm,parametroDois);
			
		}catch (ParametrosInvalidosException Exception ) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		terminal.close();

	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		if (parametroUm > parametroDois) { 
			throw new ParametrosInvalidosException();
		}
		else {
			int contagem = parametroDois - parametroUm;
			for (int x=0; x <=contagem; x++) 
				System.out.println(x);
			
		}
			
		
	}

}
