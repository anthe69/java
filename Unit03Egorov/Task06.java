package by.epam.unit03.main;

public class Task06 {

	public static void main(String[] args) {
		// Даны два числа. Определить цифры, входящие в запись как первого так и
		// второго числа.

		int a = 23450;
		int b = 12367;
		int temp_a, temp_b;// именуем переменные по Java Code Convention

		while (a > 0) {
			temp_a = a % 10;
			temp_b = b;
			while (temp_b > 0) {
				if (temp_a == temp_b % 10) {
					System.out.println("Общие цифры: " + temp_a);
				}
				temp_b = temp_b / 10;
			}
			a = a / 10;
		}
	}
}
