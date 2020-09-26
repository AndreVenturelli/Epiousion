package Exer4;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Andre Venturelli";
		int idade = 25;
		String rg = "39992844-5";
		char sexo = 'M';
		double salario = 2000.0;
		int anoAtual = 2020;
		int anoNascimento = anoAtual - idade;
		
		if(sexo == 'M') {
			System.out.printf("O senhor %s, nascido no ano de %d, portador do rg %s", nome, anoNascimento, rg);
		}else if(sexo == 'F') {
			System.out.printf("A senhora %s, nascida no ano de %d, portadora do rg %s", nome, anoNascimento, rg);
		}else {
			System.out.printf("O(a) Senhor(a) %s, nascido(a) no ano de %d, portador(a) do rg %s", nome, anoNascimento, rg);
		}
		
		
		
		
	}
}
