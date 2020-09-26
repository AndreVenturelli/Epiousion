package Exer8;

import java.lang.reflect.Array;

public class Exer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email[] = new String [10]; 
		for (int i = 0; i < email.length; i++) { //length = o "tamanho" cada vez que o for ser utilizado ele ira cadastrar um email 
			email[i] ="Cliente " + (i + 1) + " email: cliente" + (i + 1) + "@cliente.com.br";
		}
		for (String string : email) {
			System.out.println(string);
		}
	}

}
