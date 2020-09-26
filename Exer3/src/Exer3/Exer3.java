package Exer3;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade =25;
		int anoAtual = 2020;
		int anoNascimento = anoAtual - idade;
		char sexo = 'F';
		double salario = 2000;
		double impostoDevido = 2000 * 0.20;
		
		String sexoPorex = "Feminino";
		System.out.printf("Voce nasceu em: %d",anoNascimento);
	
		if(sexo =='f') {
			System.out.printf("Voce e do sexo %s",sexoPorex);
		}else {
			System.out.println("\nVoce e do sexo masculino");
		}
		System.out.printf("Vai descontar do seu salario R$ %.2f reais",impostoDevido);
	}

}
