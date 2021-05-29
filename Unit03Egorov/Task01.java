package by.epam.unit03.main;// Каждый юнит коммить, пожалуйста в отдельный репозиторий.

public class Task01 {

	public static void main(String[] args) {
		// Необходимо вывести на экран таблицу умножения на 3.

		System.out.println("---------------");

		for (int i = 1; i <= 10; i++) {
			System.out.printf("| 3 x %2s = %2s |\n", i, i * 3);
		}

		System.out.println("---------------");
	}
}
