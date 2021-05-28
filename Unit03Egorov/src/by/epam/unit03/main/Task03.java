package by.epam.unit03.main;

public class Task03 {

	public static void main(String[] args) {
		// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

		int sum = 0;
		double r = 1;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			r = r * sum;
		}

		System.out.println("result = " + r);
	}
}