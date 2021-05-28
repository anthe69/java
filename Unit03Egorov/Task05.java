package by.epam.unit03.main;

public class Task05 {

	public static void main(String[] args) {
		// Составить программу для вычисления значений функции F(x) на отрезке [а, b]
		// с шагом h. Результат представить в виде таблицы, первый столбец которой –
		// значения аргумента, второй - соответствующие значения функции:

		double a;
		double b;
		double h;
		double y;

		a = -1;
		b = 4;
		h = 0.5;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			y = 2 * Math.tan(x / 2) + 1;
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}

		System.out.println("---------------------------------");
	}
}