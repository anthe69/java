package by.epam.unit03.main;

public class Task07 {

	public static void main(String[] args) {
		// Написать программу, переводящую римские цифры в арабские.

		char x = 'D';
		int y;

		switch (x) {
		case 'I':
			y = 1;
			break;
		case 'V':
			y = 5;
			break;
		case 'X':
			y = 10;
			break;
		case 'L':
			y = 50;
			break;
		case 'C':
			y = 100;
			break;
		case 'D':
			y = 500;
			break;
		case 'M':
			y = 1000;
			break;
		default:
			System.out.println("Что-то не то с программой.");
			return;
		}

		System.out.println("Римская цифра " + x + " соответствует арабской " + y);
	}
}