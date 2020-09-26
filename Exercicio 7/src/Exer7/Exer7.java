package Exer7;

public class Exer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limiteInferior = 14;
		int limiteSuperior = 1578;
		int numerosDiv6 = 0;
		int cont = limiteInferior;
		while (cont <= limiteSuperior) {
			if(cont % 6 == 0) {
				numerosDiv6++;
			}
			cont++;
			} 
		System.out.println("Quantidade de numeros divisiveis por 6 entre " + limiteInferior + " e " + limiteSuperior + " e :" + numerosDiv6);
	}	
}