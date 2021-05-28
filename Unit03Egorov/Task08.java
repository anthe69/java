package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// Написать программу, в которой вводятся два операнда Х и Y и знак операции
		// (+, –, /, *). Вычислить результат Z в зависимости от знака. Предусмотреть
		// реакции на возможный неверный знак операции, а также на ввод Y=0 при
		// делении. Организовать возможность многократных вычислений без
		// перезагрузки программа (т.е. построить цикл). В качестве символа
		// прекращения вычислений принять ‘#’.

		double x;
		double y;
		String k;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Введите X > ");
			if (sc.hasNext("#")) {
				System.out.println("Программа завершена!");
				break;
			}
			x = sc.nextDouble();

			System.out.print("Введите Y > ");
			if (sc.hasNext("#")) {
				System.out.println("Программа завершена!");
				break;
			}
			y = sc.nextDouble();

			System.out.print("Введите знак операции (+, –, /, *) > ");
			if (sc.hasNext("#")) {
				System.out.println("Программа завершена!");
				break;
			}
			k = sc.next();

			switch (k) {
			case "+":
				System.out.println("Z = " + (x + y) + " Для завершения программы введите #");
				break;
			case "-":
				System.out.println("Z = " + (x - y) + " Для завершения программы введите #");
				break;
			case "/":
				if (y == 0) {
					System.out.println("На ноль делить нельзя! Для завершения программы введите #");
					break;
				}
				System.out.println("Z = " + (x / y) + " Для завершения программы введите #");
				break;
			case "*":
				System.out.println("Z = " + (x * y) + " Для завершения программы введите #");
				break;
			default:
				System.out.println("Вы ввели неверный знак операции! Для завершения программы введите #");
				break;
			}
		}
	}
}
