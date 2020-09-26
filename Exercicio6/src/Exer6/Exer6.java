package Exer6;

public class Exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		for (num = 100; num<=200; num++) {
			if (num % 2 == 0) {
				System.out.println(num + " e divisivel por 2");
			} else if (num % 3 == 0) {
				System.out.println(num + " e divisivel por 3");
			} else if ( num % 2 == 0 && num % 3 ==0) {
				System.out.println(num + " e divisivel por 2 e por 3. Logo, tambem e divisivel por 6");
			}
	}
	}
}
