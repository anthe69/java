package by.epam.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		
		//Даны натуральные числа М и N. Вывести старшую цифру дробной части и
		//младшую цифру целой части числа M/N.
		
		int m = 1569;
		int n = 45;
		double mn = 1.0*m/n;
	
		int a = (int)((mn - (int)mn) * 10);		
		int b = (int)mn % 10;
		
		System.out.println("M/N = " + mn);
		System.out.println("Старшая цифра дробной части = " + a);
		System.out.println("Младшая цифра целой части = " + b);
		
	}	
}
