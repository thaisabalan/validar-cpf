import java.util.Scanner;

//

class validarCPF {
	public static boolean validarCPF(String cpf){
		
		if (cpf.length() != 11) {
			return false;
		}
		
		int [] numeros = new int[11];
		
		for (int i = 0; i < 11; i++) {
			numeros[i] = Integer.parseInt(cpf.substring(i, i + 1));
			System.out.printf("%d \n", numeros[i]);
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
    
    		Scanner lerTeclado = new Scanner(System.in);
			
			System.out.print("Por favor insira seu CPF a ser validado: \n");
			String cpf = lerTeclado.nextLine();
			
			if (validarCPF(cpf)) {
				System.out.print("CPF valido!");
			} else {
				System.out.print("CPF invalido!");
			}
		
	}

}
